package com.company;

public class Admin extends User {
    public Admin() {
        super();
    }
    public Admin(String userName, String password, String emailAddress, String firstName, String lastName, String physicalAddress) {
        super(userName, password, emailAddress, firstName, lastName, physicalAddress);
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "Admin{}";
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


}
