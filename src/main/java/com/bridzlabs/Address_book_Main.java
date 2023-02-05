package com.bridzlabs;

import java.util.*;

public class Address_book_Main {
    public static void main(String[] args) {
        ArrayList al1 = new ArrayList();
        Addressbook addressbook = new Addressbook();
        addressbook.addDetails(al1);
        addressbook.addMultipleContacts(al1);
    }
}
