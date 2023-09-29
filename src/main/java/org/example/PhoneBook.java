package org.example;

import java.util.*;

public class PhoneBook {
    private static HashMap<String, ArrayList> contacts = new HashMap<>();


    private static void addContacts(String name, String phoneNumber) {
        if (contacts.containsKey(name)) {
            ArrayList phoneNumbers = contacts.get(name);
            phoneNumbers.add(phoneNumber);
            contacts.put(name, phoneNumbers);
        } else {
            ArrayList phoneNambers = new ArrayList();
            phoneNambers.add(phoneNumber);
            contacts.put(name, phoneNambers);
        }
    }

    public static void PrintPhonebook() {
        ArrayList<Map.Entry<String, ArrayList>> list = new ArrayList(contacts.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, ArrayList>>() {
            @Override
            public int compare(Map.Entry<String, ArrayList> tel1, Map.Entry<String, ArrayList> tel2) {
                return tel2.getValue().size() - tel1.getValue().size();
            }
        });
        System.out.println("Телефонный справочник: ");
        for (Map.Entry<String, ArrayList> k : list) {
            System.out.println(k.getValue() + ": " + k.getKey());

        }
    }


    public static void main (String[]args){
        addContacts("Ivanov", "9-10-40");
        addContacts("Ivanov", "9-10-40");
        addContacts("Petrov", "9-10-40");
        addContacts("Petrov", "9-10-40");
        addContacts("Petrov", "9-10-40");
        addContacts("Sidorov", "9-10-55");
        addContacts("Sidorov", "9-10-40");
        addContacts("Sidorov", "9-10-40");
        addContacts("Sidorov", "9-10-40");

        PrintPhonebook();
    }
}






