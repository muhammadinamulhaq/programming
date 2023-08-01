package com.abhishek;

import java.util.Scanner;

public class Main {

    public static Doctor createDoctorDetails(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Hospital Name");
        String hospitalName = sc.next();

        System.out.println("Enter Contact Number");
        long contactNumber = sc.nextLong();

        System.out.println("Enter city");
        String city = sc.next();

        System.out.println("Enter Doctor Id");
        String doctorId = sc.next();

        System.out.println("Enter Doctor Name");
        String doctorName = sc.next();

        System.out.println("Enter Specialization");
        String specialization = sc.next();

        Hospital hospital1 = new Hospital(hospitalName, contactNumber, city);

        return new Doctor(doctorId, doctorName, specialization, hospital1);
    }

    public static void main(String[] args) {
	// write your code here

        Doctor doc = createDoctorDetails();

        System.out.println("Doctor id:" + doc.getDoctorId());
        System.out.println("Doctor name:" + doc.getDoctorName());
        System.out.println("Specialization:" + doc.getSpecialization());

        Hospital hospital = doc.getHospital();

        System.out.println("Hospital Name:" + hospital.getHospitalName());
        System.out.println("Contact Number:" + hospital.getContactNumber());
        System.out.println("City:" + hospital.getCity());

    }
}
