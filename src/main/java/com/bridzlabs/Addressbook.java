package com.bridzlabs;

import java.util.*;

public class Addressbook extends Contact {
    Scanner scan = new Scanner(System.in);

    public Contact addDetails(ArrayList al1) {
        Contact contact = new Contact();

        System.out.print("Enter first name :: ");
        firstname = scan.next();
        contact.setFirstname(firstname);

        System.out.print("Please Enter The Last Name :: ");
        lastname = scan.next();
        contact.setLastname(lastname);

        System.out.print("Please Enter The Address :: ");
        address = scan.next();
        contact.setAddress(address);

        System.out.print("Please Enter The City :: ");
        city = scan.next();
        contact.setCity(city);

        System.out.print("Please Enter The State :: ");
        state = scan.next();
        contact.setState(state);

        System.out.print("Please Enter The email ID :: ");
        email = scan.next();
        contact.setEmail(email);

        System.out.print("Please Enter The Zip Code :: ");
        zipCode = scan.nextInt();
        contact.setZipCode(zipCode);

        System.out.print("Please Enter The Phone Number :: ");
        phoneNo = scan.nextLong();
        contact.setPhoneNo(phoneNo);

        // System.out.println(obj);

        al1.add(contact);

        return contact;
    }

    void addMultipleContacts(ArrayList al1) {
        Addressbook obj = new Addressbook();
        String ch;
        do {
            Scanner scan = new Scanner(System.in);

            System.out.println("DO YOU WANT TO ADD MORE CONTACT (PRESS y to contune)");
            System.out.println("Enter choice 1.to add Contact ");
            int choice;
            choice = scan.nextInt();

            switch (choice) {

                case 1:
                    obj.addDetails(al1);
                    break;

                default:
                    System.out.println("Invalid Input");
            }
            System.out.println("DO YOU WANT TO ADD MORE CONTACT (PRESS y to contune)");
            ch = scan.next();
        } while (ch.equals("y") || ch.equals("Y"));

        System.out.println(al1);

    }
}
