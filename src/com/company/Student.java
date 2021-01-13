package com.company;

import java.util.Objects;

public class Student extends User {
    int customerNumber;
    String date;

    public Student() {
        super();
    }
    public Student(String userName, String password, String emailAddress, String firstName, String lastName, String physicalAddress) {
        super(userName, password, emailAddress, firstName, lastName, physicalAddress);
    }
    @Override
    public String getUserName() {
        return super.getUserName();
    }

    @Override
    public void setUserName(String userName) {
        super.setUserName(userName);
    }

    @Override
    public String getPassword() {
        return super.getPassword();
    }

    @Override
    public void setPassword(String password) {
        super.setPassword(password);
    }

    @Override
    public String getEmailAddress() {
        return super.getEmailAddress();
    }

    @Override
    public void setEmailAddress(String emailAddress) {
        super.setEmailAddress(emailAddress);
    }

    @Override
    public String getFirstName() {
        return super.getFirstName();
    }

    @Override
    public void setFirstName(String firstName) {
        super.setFirstName(firstName);
    }

    @Override
    public String getLastName() {
        return super.getLastName();
    }

    @Override
    public void setLastName(String lastName) {
        super.setLastName(lastName);
    }

    @Override
    public String getPhysicalAddress() {
        return super.getPhysicalAddress();
    }

    @Override
    public void setPhysicalAddress(String physicalAddress) {
        super.setPhysicalAddress(physicalAddress);
    }



    @Override
    public String toString() {
        return "Student{ " +
                "customerNumber=" + customerNumber +
                ", date='" + date + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student st = (Student) o;
        return customerNumber == st.customerNumber &&
                Objects.equals(date, st.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), customerNumber, date);
    }

    public void borrowMoney(){

    }
    public void checkBalance(){

    }
    public void payLoan(){

    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
