package day9Practiceproblem.AddressBookSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookEditContact {
    Scanner scanner = new Scanner(System.in);

    //arraylist -name contactList
    static ArrayList<AddressBookMain.Contacts> contactList = new ArrayList<>();

    //Method to display all contacts
    public void display(ArrayList <AddressBookMain.Contacts> contactList) {

        for (AddressBookMain.Contacts contactItems : contactList) {
            System.out.println(contactItems);
        }
    }

    //Method to add a contact
    public void addContact(AddressBookMain.Contacts contactItems, ArrayList <AddressBookMain.Contacts> contactList){

        contactItems = new AddressBookMain.Contacts();

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

        contactList.add(contactItems);

    }

    //Method to edit existing contact in address book
    public void editContact() {
        System.out.println("Enter the first name to edit contact");
        String edit = scanner.next();
        System.out.println("Press 1 to edit first name");
        System.out.println("Press 2 to edit last name");
        System.out.println("Press 3 to edit address");
        System.out.println("Press 4 to edit city");
        System.out.println("Press 5 to edit state");
        System.out.println("Press 6 to edit pincode");
        System.out.println("Press 7 to edit Phone number");
        System.out.println("Press 8 to edit email");



        int choice = scanner.nextInt();
        switch (choice) {

            case 1:
                for (AddressBookMain.Contacts contactItems : contactList) {
                    if (contactItems.firstName.equals(edit)) {
                        System.out.println("Enter new first name");
                        contactItems.firstName = scanner.next();
                    }
                }

            case 2:
                for (AddressBookMain.Contacts contactItems : contactList) {
                    if (contactItems.firstName.equals(edit)) {
                        System.out.println("Enter new last name");
                        contactItems.lastName = scanner.next();
                    }
                }

            case 3:
                for (AddressBookMain.Contacts contactItems : contactList) {
                    if (contactItems.firstName.equals(edit)) {
                        System.out.println("Enter new address");
                        contactItems.address = scanner.next();
                    }
                }

            case 4:
                for (AddressBookMain.Contacts contactItems : contactList) {
                    if (contactItems.firstName.equals(edit)) {
                        System.out.println("Enter new city");
                        contactItems.city = scanner.next();
                    }
                }

            case 5:
                for (AddressBookMain.Contacts contactItems : contactList) {
                    if (contactItems.firstName.equals(edit)) {
                        System.out.println("Enter new state");
                        contactItems.state = scanner.next();
                    }
                }

            case 6:
                for (AddressBookMain.Contacts contactItems : contactList) {
                    if (contactItems.firstName.equals(edit)) {
                        System.out.println("Enter new Pin code");
                        contactItems.pinCode = scanner.nextInt();
                    }
                }

            case 7:
                for (AddressBookMain.Contacts contactItems : contactList) {
                    if (contactItems.firstName.equals(edit)) {
                        System.out.println("Enter new Phone number");
                        contactItems.phoneNumber = scanner.nextLong();
                    }
                }

            case 8:
                for (AddressBookMain.Contacts contactItems : contactList) {
                    if (contactItems.firstName.equals(edit)) {
                        System.out.println("Enter new emailID");
                        contactItems.emailID = scanner.next();
                    }
                }
            default:
                break;

        }

    }
    // for choose option
    public void addContactList(){

        boolean switcher = true;
                char choice;
                do {
                    System.out.println("1.Add NEw Person:");
                    System.out.println("Enter C to Display all (C)ontacts:");
                    System.out.println("Enter Q to (Q)uit");
                    System.out.print("Please enter your choice");

                    choice = scanner.nextLine().toUpperCase().charAt(0);

                    while ((choice != 'A') && (choice != 'E') && (choice != 'D') && (choice != 'C') && (choice != 'Q')) {
                        System.out.println("Invalid choice! Please enter (A)dd, (E)dit, (D)elete, (C)ontacts, (Q)uit:");
                        choice = scanner.nextLine().toUpperCase().charAt(0);
                    }

                    switch (choice){
                        case 'A':
                            addContact(null,contactList );
                            break;

                        case 'E':
                            editContact();
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
}

