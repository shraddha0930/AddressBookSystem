package day22Practiceproblem;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {


	public ArrayList<ModelContactDetails> modelContactList;  			// Declearing Arraylist with Model Class

	public AddressBook()
	{
		modelContactList = new ArrayList<ModelContactDetails>();  		// Initaillizing Arraylist
	}

	public ModelContactDetails getContactInput()				// Getting a Input from User
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name:");
		String fName = sc.nextLine();
		System.out.println("Enter Last Name:");
		String lName = sc.nextLine();
		System.out.println("Enter the Address:");
		String address = sc.nextLine();
		System.out.println("Enter the City:");
		String city = sc.nextLine();
		System.out.println("Enter the State:");
		String state = sc.nextLine();
		System.out.println("Enter the Zip:");
		long zip = sc.nextLong();
		System.out.println("Enter the Phone No:");
		long phoneNo = sc.nextLong();
		sc.nextLine();
		System.out.println("Enter the Email:");
		String email = sc.nextLine();

		ModelContactDetails contact = new ModelContactDetails(fName, lName, address, city, state, email, zip, phoneNo);
		return contact;
	}

	public void addContact(ModelContactDetails createPerson)

	{
		System.out.println("Adding a New Contact for " + createPerson.firstName);      // Creating a Method and Adding object in a Arraylist
		modelContactList.add(createPerson);
	}

	public void editContact() 								// Creating a Method and Edit with Switch Statement
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name of Contact to Edit it");
		String cName = sc.nextLine();
		ModelContactDetails model = modelContactList.get(cName.indexOf(cName));
		if (model.getFirstName().equals(cName))
		{

			System.out.println("Which Details You Would Like To Edit ?");
			System.out.println("Press - 1 for First Name \nPress - 2 for Last Name \n"
					+ "Press - 3 for Address \nPress - 4 for City \nPress - 5 for State \nPress - 6 for Zip \n"
					+ "Press - 7 for Phone No. \nPress - 8 for Email");

			int num = sc.nextInt();
			switch(num)
			{
				case 1: System.out.println("Enter New First Name");
					sc.nextLine();
					String fName = sc.nextLine();
					model.setFirstName(fName);
					System.out.println("Update a Sucessfully " + fName);
					break;

				case 2: System.out.println("Enter New Last Name");
					sc.nextLine();
					String lName = sc.nextLine();
					model.setLastName(lName);
					System.out.println("Update a Sucessfully " + lName);
					break;

				case 3: System.out.println("Enter New Address");
					sc.nextLine();
					String address = sc.nextLine();
					model.setAddress(address);
					System.out.println("Update a Sucessfully "+ address);
					break;

				case 4: System.out.println("Enter New City");
					sc.nextLine();
					String city = sc.nextLine();
					model.setCity(city);
					System.out.println("Update a Sucessfully " + city);
					break;

				case 5: System.out.println("Enter New State");
					sc.nextLine();
					String state = sc.nextLine();
					model.setState(state);
					System.out.println("Update a Sucessfully " + state);
					break;

				case 6: System.out.println("Enter New Zip");
					long zip = sc.nextLong();
					model.setZip(zip);
					System.out.println("Update a Sucessfully " + zip);
					break;

				case 7: System.out.println("Enter New Phone Number");
					long phoneNo = sc.nextLong();
					model.setPhoneNo(phoneNo);
					System.out.println("Update a Sucessfully " + phoneNo);
					break;

				case 8: System.out.println("Enter New Email");
					sc.nextLine();
					String email = sc.nextLine();
					model.setEmail(email);
					System.out.println("Update a Sucessfully " + email);
					break;

				default: System.out.println("No Edit");
					return;


			}
		}
		else
		{
			System.out.println("No such contact");
		}
	}

	public void deleteContact() 							// Creating a Method and Deleting Contact with Using First Name
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name of Contact to Delete it");
		String cName = sc.nextLine();
		ModelContactDetails editContact = modelContactList.get(cName.indexOf(cName));
		if (editContact.getFirstName().equals(cName))
		{

			modelContactList.remove(editContact);
		}
		else
		{
			System.out.println("No such Contact to Delete");
		}
	}

	public void viewContacts() 								// Accessing Contact into ArrayList and Display One By One
	{
		if (modelContactList.size() == 0)
		{
			System.out.println("No Contact Here.");
		}
		else
		{
			for(int i = 0; i<modelContactList.size(); i++)
			{
				int num = i+1;
				System.out.println("Availble Contact In List Position At : "+ num);
				System.out.println("First Name :" +modelContactList.get(i).firstName + " Last Name :" + modelContactList.get(i).lastName);
				System.out.println("Address :" +modelContactList.get(i).address + " City :" + modelContactList.get(i).city + " State :" + modelContactList.get(i).state + " Zip :" + modelContactList.get(i).zip);
				System.out.println("Phone No :" +modelContactList.get(i).phoneNo);
				System.out.println("Email :" +modelContactList.get(i).email);
			}
		}
	}

	// UC 6 Create a Multiple Address Book
	public AddressBook addressBookOption()
	{

		System.out.println("Welcome to the Address Book System");
		int ch = 0;
		Scanner sc = new Scanner(System.in);
		AddressBook AD = new AddressBook(); 					// Creating a Object of Main Class
		boolean runLoop = true;
		while(runLoop)											// Checking a Choice with Switch Statement
		{
			System.out.println("1.Adding Contact \n2.Update Contact \n3.Delete Contact \n4.View Contact \n5.Add Multiple Person \n6.Exit");
			System.out.println("Enter a Your Choice :");
			ch = sc.nextInt();

			switch(ch)
			{
				case 1:
					ModelContactDetails modelContactDetails = AD.getContactInput();
					AD.addContact(modelContactDetails);

					System.out.println("Contact Added Successfully");
					break;

				case 2:
					AD.editContact();
					System.out.println("Contact Updated Successfully");
					break;

				case 3:
					AD.deleteContact();
					System.out.println("Contact Delete Successfully");
					break;

				case 4:
					AD.viewContacts();
					System.out.println("Showing All Contact Details");
					break;

				case 5:
					AD.duplicateContact();
					break;
				case 6:
					System.out.println("Thank You We are Exiting");
					runLoop = false;
					break;

				default:
					System.out.println("Sorry You are Type Wrong Choice");

			}
		}
		return AD;

	}
	// UC7 Duplicated Contact
	public void duplicateContact() 					// Creating a Method & Checking if Name is Duplicated or Not
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Person Name:");
		String duplicateName = sc.nextLine();
		for (int i = 0; i < modelContactList.size(); i++)
		{
			ModelContactDetails model = modelContactList.get(i);

			if (modelContactList.get(i).getFirstName().equals(duplicateName)) {
				System.out.println("Contact Already Exist, Please Try Again");
			}
		}

	}



}