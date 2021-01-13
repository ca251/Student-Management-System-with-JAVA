package com.company;

import java.util.Objects;

public class User {
    String userName;
    String password;
    String emailAddress;
    String firstName;
    String LastName;
    String physicalAddress;
    public User(){}

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getPhysicalAddress() {
        return physicalAddress;
    }

    public void setPhysicalAddress(String physicalAddress) {
        this.physicalAddress = physicalAddress;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password=" + password +
                ", emailAddress='" + emailAddress + '\'' +
                ", firstName='" + firstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", physicalAddress='" + physicalAddress + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return password == user.password &&
                Objects.equals(userName, user.userName) &&
                Objects.equals(emailAddress, user.emailAddress) &&
                Objects.equals(firstName, user.firstName) &&
                Objects.equals(LastName, user.LastName) &&
                Objects.equals(physicalAddress, user.physicalAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, password, emailAddress, firstName, LastName, physicalAddress);
    }

    public User(String userName, String password, String emailAddress, String firstName, String lastName, String physicalAddress){
        this.physicalAddress = physicalAddress;
        LastName = lastName;
        this.firstName = firstName;
        this.emailAddress = emailAddress;
        this.password = password;
        this.userName = userName;

    }

}
