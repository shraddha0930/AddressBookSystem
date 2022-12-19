package day9Practiceproblem.AddressBookSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class UniqueAddressBookContact {

    static Scanner scanner = new Scanner(System.in);

    //arraylist -name contactList
    static ArrayList<AddressBookMain.Contacts> contactList = new ArrayList<>();

    //Method to display all contacts
    public static void display(ArrayList<AddressBookMain.Contacts> contactList) {
        for (AddressBookMain.Contacts contactItems : contactList) {
            System.out.println(contactItems);
        }
    }

    //Method to add a contact
    public static void addContact(AddressBookMain.Contacts contactItems, ArrayList<AddressBookMain.Contacts> contactList) {

        // multiple contacts
        int contactcount;
        System.out.println("Enter number of contact you want to add in address book");

        contactcount = scanner.nextInt();
        for (int i = 1; i <= contactcount; i++) {

            contactItems = new AddressBookMain.Contacts();
            System.out.println("Contact: " + i);


            System.out.println("Enter first name");
            contactItems.firstName = scanner.next();

            System.out.println("Enter last name");
            contactItems.lastName = scanner.next();

            System.out.println("Enter Address");
            contactItems.address = scanner.next();

            System.out.println("Enter city");
            contactItems.city = scanner.next();

            System.out.println("Enter state");
            contactItems.state = scanner.next();

            System.out.println("Enter pin code");
            contactItems.pinCode = scanner.nextInt();

            System.out.println("Enter phone number");
            contactItems.phoneNumber = scanner.nextLong();

            System.out.println("Enter Email");
            contactItems.emailID = scanner.next();



            if (contactList.contains(contactItems))
                System.out.println("already exist" +contactList);
            else contactList.add(contactItems);


        }
    }

    public static void addContactList() {

        boolean switcher = true;
        char choice;
        do {
            System.out.println("\n\t\tEnter A to (A)dd New Person:");
            System.out.println("\n\t\tEnter C to Display all (C)ontacts:");
            System.out.println("\n\t\tEnter Q to (Q)uit");
            System.out.print("\n\t\tPlease enter your choice");

            choice = scanner.nextLine().toUpperCase().charAt(0);

            while ((choice != 'A') && (choice != 'E') && (choice != 'D') && (choice != 'C') && (choice != 'Q')) {
                System.out.println("Invalid choice! Please enter (A)dd, (E)dit, (D)elete, (C)ontacts, (Q)uit:");
                choice = scanner.nextLine().toUpperCase().charAt(0);
            }

            switch (choice) {
                case 'A':
                    addContact(null, contactList);
                    break;



                case 'C':
                    display(contactList);
                    break;

                case 'Q':
                    switcher = false;
                    System.exit(0);
                    break;
                default:
            }
        } while (switcher != false);
    }

    public static void main(String[] args) {

        addContactList();
    }


}

