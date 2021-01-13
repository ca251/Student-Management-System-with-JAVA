package com.company;

import java.sql.Date;
import java.util.Objects;

public class Loan {
  private int customerNumber;
  private   double intrest;
  private double balance;
  private Date dateIssued;

  public Loan(int customerNumber, Date dateIssued, double balance, double intrest){}
  public Loan(int customerNumber,double intrest,double balance, java.sql.Date dateIssued){
      this.dateIssued = dateIssued;
      this.intrest = intrest;
      this.balance = balance;
      this.customerNumber = customerNumber;

  }

    public double getIntrest() {
        return intrest;
    }

    public void setIntrest(double intrest) {
        this.intrest = intrest;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Date getDateIssued() {
        return dateIssued;
    }

    public void setDateIssued(Date dateIssued) {
        this.dateIssued = dateIssued;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Loan loan = (Loan) o;
        return Double.compare(loan.intrest, intrest) == 0 &&
                Double.compare(loan.balance, balance) == 0 &&
                Objects.equals(dateIssued, loan.dateIssued);
    }

    @Override
    public int hashCode() {
        return Objects.hash(intrest, balance, dateIssued);
    }
}
