package com.abhishek;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Customer Id");
        String customerId = sc.next();

        System.out.println("Enter Customer Name");
        String customerName = sc.next();

        System.out.println("Enter Phone Number");
        long phoneNumber = sc.nextLong();

        System.out.println("Enter Email Id");
        String emailId = sc.next();

        System.out.println("Enter type");
        String toyType = sc.next();

        System.out.println("Enter Price");
        double price = sc.nextDouble();

        CustomerDetails customer1 = new CustomerDetails(customerId, customerName, phoneNumber, emailId, toyType, price);

        if(!customer1.validateCustomerId()){
            System.out.println("Provide a proper Customer Id");
            return;
        }
        System.out.printf("Amount to be paid by the Customer %.2f", customer1.calculateDiscount());
    }
}
