package com.tts;

public class AddressBookEntry {
    private String name;
    private String address;
    private int mobilenumber;
    private String emailaddress;

    public AddressBookEntry() {}

    public AddressBookEntry(String name, String address,
                            int mobilenumber, String emailaddress){
        this.name = name;
        this.address = address;
        this.mobilenumber = mobilenumber;
        this.emailaddress = emailaddress;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }

    public int getMobileNumber(){
        return mobilenumber;
    }
    public void setMobileNumber(int mobilenumber){
        this.mobilenumber = mobilenumber;}

    public String getEmailAddress(){
        return emailaddress;
    }
    public void setEmailAddress(String emailaddress){
        this.emailaddress = emailaddress;
    }

    public String toString(){
        return "Name: " + name + ", Address: " + address +
                ", Mobile Number: " + mobilenumber + ", Email Address: " + emailaddress;
    }
}
