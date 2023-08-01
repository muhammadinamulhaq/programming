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

        System.out.println("Enter City");
        String city = sc.next();

        System.out.println("Enter Units Consumed");
        int unitsConsumed = sc.nextInt();

        System.out.println("Enter Cost per Unit");
        int costPerUnit = sc.nextInt();

        CustomerDetails connection1 = new CustomerDetails(customerId, customerName, phoneNumber, city, unitsConsumed, costPerUnit);

        System.out.printf("Amount to be paid is Rs.%.2f",connection1.calculateElectricityBill());
    }
}
