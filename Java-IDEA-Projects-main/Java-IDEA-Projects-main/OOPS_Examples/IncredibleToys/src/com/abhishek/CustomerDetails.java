package com.abhishek;

public class CustomerDetails {
    private String customerId;
    private String customerName;
    private long phoneNumber;
    private String emailId;
    private String toyType;
    private double price;

    public CustomerDetails(String customerId, String customerName, long phoneNumber, String emailId, String toyType, double price) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.emailId = emailId;
        this.toyType = toyType;
        this.price = price;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getToyType() {
        return toyType;
    }

    public void setToyType(String toyType) {
        this.toyType = toyType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean validateCustomerId(){
        String[] details = customerId.split("/");
        if(details.length == 3){
            if(details[0].equalsIgnoreCase("Incredible")){
                if(details[1].length() == 3){
                    boolean flag = validateNum(details[1]);
                    if(flag){
                        if(details[2].length() == 4){
                            return validateNum(details[2]);
                        }
                    }
                }
            }
        }
        return false;
    }

    private boolean validateNum(String detail) {
        return detail.matches("[0-9]+");
    }

    public double calculateDiscount(){
        String toyType = this.toyType;
        double disc = 0;
        if(toyType.equalsIgnoreCase("SoftToys")){
            disc = 5;
        }else if(toyType.equalsIgnoreCase("FidgetToys")){
            disc = 10;
        }else if(toyType.equalsIgnoreCase("SensoryToys")){
            disc = 15;
        }else if(toyType.equalsIgnoreCase("Puzzles")){
            disc = 20;
        }
        disc = ((this.price) * disc)/100;
        return (this.price - disc);
    }
}
