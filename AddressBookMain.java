package addressBookCollections;

import java.util.Scanner;

public class AddressBookMain {
	
	public static void main(String[] args) {
		
		String fName;
		String lName;
		String address;
		String city;
		String state;
		int zipCode;
		long phNumber;
		String email;
		
		
		AddressBook addressBook = new AddressBook();
		
		Scanner S = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		System.out.println("First Name");
		fName=sc.nextLine();
		System.out.println("Last Name");
		lName=sc.nextLine();
		System.out.println("Address");
		address=sc.nextLine();
		System.out.println("City");
		city=sc.nextLine();
		System.out.println("State");
		state=sc.nextLine();
		System.out.println("Zip Code");
		zipCode=sc.nextInt();
		System.out.println("Phone Number");
		phNumber=sc.nextLong();
		System.out.println("E-mail");
		email=sc.next();
		
		Contact contact = new Contact(fName, lName, address, city, state, zipCode, phNumber, email);
		addressBook.addContact(contact);
		
	}
}
