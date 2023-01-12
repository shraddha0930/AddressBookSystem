package day22Practiceproblem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookManage {

	private Map<String, AddressBook> modelContactListMap;

	public AddressBookManage() {
		modelContactListMap = new HashMap<>();
	}

	public void addAddressBook(String addBookName, AddressBook addBook) {
		modelContactListMap.put(addBookName, addBook);
	}

	public void createAddBooks() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Address Books To Create :");
		int num = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < num; i++) {
			System.out.println("Number of Address Book is Created is : " + num);
			System.out.println("Enter the Name Address Book :");
			String aBookName = sc.nextLine();
			AddressBook addBookObj = new AddressBook();
			addBookObj = addBookObj.addressBookOption();
			addAddressBook(aBookName, addBookObj);
		}
	}

	public void viewAddBooks() {
		for (int i = 0; i < modelContactListMap.size(); i++) {
			System.out.println(i + "Name of add. book are : " + modelContactListMap);
		}
	}

	public static void main(String[] args) {
		System.out.println("--------------------Welcome To Address Books------------------ ");
		AddressBookManage addBookManage = new AddressBookManage();
		addBookManage.createAddBooks();
		System.out.println("Successfully Created Address Books");
		addBookManage.viewAddBooks();

	}
}