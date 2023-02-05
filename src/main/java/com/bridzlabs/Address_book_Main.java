package com.bridzlabs;

import java.util.*;

public class Address_book_Main {

    public static void main(String[] args) {
        Addressbook obj = new Addressbook();
        obj.addDetails();
        System.out.println("--------------------------------"
                + "---------------------------------");

        String ch;
        do {
            Scanner scan = new Scanner(System.in);

            // obj.addElement();

            System.out.println("Enter choice \n 1.Add Contact \n 2.Edit Contact");
            int choice;
            choice = scan.nextInt();

            switch (choice) {

                case 1:
                    obj.addDetails();
                    break;
                case 2:
                    obj.editContact();
                    break;

                default:
                    System.out.println("Invalid Input");
            }
            System.out.println("----------------------------------------------------------------");
            System.out.println("DO YOU WANT TO ADD MORE CONTACT (PRESS y to contune)");
            ch = scan.next();
        } while (ch.equals("y") || ch.equals("Y"));

        // System.out.println(al1);

    }
}