package com.bridzlabs;

import java.util.Scanner;

public class Addressbook {
    Scanner scan = new Scanner(System.in);
    public Contact createContact(){
        Contact obj = new Contact();
        System.out.println("Enter first name ");
        String firstname = scan.next();
        obj.setFirstname(firstname);
        System.out.print("Please Enter The Last Name :: ");
        String lastName = scan.next();
        obj.setLastname(lastName);
        System.out.print("Please Enter The Address :: ");
        String address = scan.next();
        obj.setAddress(address);
        System.out.print("Please Enter The City :: ");
        String city = scan.next();
        obj.setCity(city);
        System.out.print("Please Enter The State :: ");
        String state = scan.next();
        obj.setState(state);
        System.out.print("Please Enter The Zip Code :: ");
        int zipCode = scan.nextInt();
        obj.setZip(zipCode);
        System.out.print("Please Enter The Phone Number :: ");
        long phoneNumber = scan.nextLong();
        obj.setPhone_number(phoneNumber);
        System.out.print("Please Enter The email ID :: ");
        String emailId = scan.next();
        obj.setEmail(emailId);
        System.out.println(obj);
        return obj;
    }
}
