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
		
		//I am using fName 2 times, should i declare it at both places
		//using nextLine to input data creates problem(eg,add nextLine in line 36 )
		AddressBook addressBook = new AddressBook();
		
		Scanner sc = new Scanner(System.in);
		
		int choice = 0;
		
		while(choice!=10) {
			System.out.println("Press 1 to add contact");
			System.out.println("Press 2 to edit contact");
			System.out.println("Press 10 to exit");
			
			choice = sc.nextInt();
			
			switch (choice) {
			case 1: {
				System.out.println("First Name");
				fName=sc.next();
				System.out.println("Last Name");
				lName=sc.next();
				System.out.println("Address");
				address=sc.next();
				System.out.println("City");
				city=sc.next();
				System.out.println("State");
				state=sc.next();
				System.out.println("Zip Code");
				zipCode=sc.nextInt();
				System.out.println("Phone Number");
				phNumber=sc.nextLong();
				System.out.println("E-mail");
				email=sc.next();
				
				Contact contact = new Contact(fName, lName, address, city, state, zipCode, phNumber, email);
				addressBook.addContact(contact);
				break;
			}
			case 2:{
				System.out.println("Enter the first name of the person whose details need to be edited");
				fName=sc.next();
				System.out.println("Enter the last name of the person whose details need to be edited");
				fName+=sc.next();
				addressBook.editContact(fName);
			}
				
			
			}	
		}
		sc.close();		
	}
}
