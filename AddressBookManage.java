package day22Practiceproblem;

import java.util.*;
import java.util.stream.Collectors;

public class AddressBookManage {

	private Map<String, AddressBook> modelContactListMap;
	List<String> valuePrinted;
	private int countPerson;
	public AddressBookManage() {
		modelContactListMap = new HashMap<>();
		valuePrinted = new ArrayList<>();
	}

	public void addAddressBook(String addBookName, AddressBook addBook) {
		modelContactListMap.put(addBookName, addBook);
	}

	public boolean createAddBooks() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Address Books To Create :");
		int num = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < num; i++)
		{
			System.out.println("Number of Address Book is Created is : " + num);
			System.out.println("Enter the Name Address Book :");
			String aBookName = sc.nextLine();
			AddressBook addBookObj = new AddressBook();
			addBookObj = addBookObj.addressBookOption();
			addAddressBook(aBookName, addBookObj);
		}
		return true;
	}

	public void viewAddBooks()
	{
		for (int i = 0; i < modelContactListMap.size(); i++) {
			System.out.println(i + "Name of add. book are : " + modelContactListMap);
		}
	}

	// UC 8 & 9, 10 Ability to search Person in City or State across the multiple Addressbook & Ability to Count Person in Address Book
	public void findPersonByCity(String cityName)
	{
		modelContactListMap.forEach((key, addresBookValue) -> {
			valuePrinted = addresBookValue.cityToPersonsMap.get(cityName).stream()
					.peek(n -> System.out.println("person names: "+ n))
					.collect(Collectors.toList());
		});
		countPerson = valuePrinted.size();
	}

	public void findPersonByState(String stateName)
	{
		modelContactListMap.forEach((key, addresBookValue) -> {
			valuePrinted = addresBookValue.stateToPersonsMap.get(stateName).stream()
					.peek(n -> System.out.println("person names: "+ n))
					.collect(Collectors.toList());
		});
		countPerson = valuePrinted.size();
	}

	public static void main(String[] args) {
		System.out.println("--------------------Welcome To Address Books------------------ ");
		AddressBookManage addBookManage = new AddressBookManage();
		boolean created = addBookManage.createAddBooks();
		System.out.println("Successfully Created Address Books");
		Scanner sc = new Scanner(System.in);

		if (created)
		{
			System.out.println("Enter 1 to find by City \nEnter 2 to find by State");
			int ch = sc.nextInt();
			sc.nextLine();
			switch (ch)
			{
				case 1:
					System.out.println("Enter the name of City: ");
					String cityName = sc.nextLine();
					addBookManage.findPersonByCity(cityName);
					break;

				case 2:
					System.out.println("Enter the name of State: ");
					String stateName = sc.nextLine();
					addBookManage.findPersonByState(stateName);
					break;
				default:
					break;
			}
			System.out.println("Number of persons found = " + addBookManage.countPerson);	 // Printing after execution of program & display count of Person
		}

	}
}