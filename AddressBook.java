package addressBookCollections;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
	
	ArrayList<Contact> addBook = new ArrayList<Contact>();

	public ArrayList<Contact> getAddressBook() {
		return addBook;
	}

	public void setAddressBook(ArrayList<Contact> addressBook) {
		this.addBook = addressBook;
	}
	
	public void addContact(Contact contact) {
		addBook.add(contact);
		System.out.println(addBook.size());
	}

	public void editContact(String fName) {
		Scanner sc = new Scanner(System.in);
		String name = "" ;
		for(Contact contact : addBook) {
			name = contact.getfName() + contact.getlName();
			if(fName.equals(name)) {
				System.out.println("Choose the value to be edited");
				System.out.println("Press 1 to edit Address");
				System.out.println("Press 2 to edit City");
				System.out.println("Press 3 to edit State");
				System.out.println("Press 4 to edit Zip Code");
				System.out.println("Press 5 to edit Phone Numbe");
				System.out.println("Press 6 to edit E-Mail");
				int choice = sc.nextInt();
				sc.nextLine();
				switch (choice) {
				case 1:
					System.out.println("Enter the new Address");
					String newAddress = sc.nextLine();
					contact.setAddress(newAddress);
					System.out.println("Address updated");
					break;
				case 2:
					System.out.println("Enter the new City");
					String newCity = sc.nextLine();
					contact.setAddress(newCity);
					System.out.println("City updated");
					break;
				case 3:
					System.out.println("Enter the new State");
					String newState = sc.nextLine();
					contact.setAddress(newState);
					System.out.println("State updated");
					break;
				case 4:
					System.out.println("Enter the new ZipCode");
					String newZip = sc.nextLine();
					contact.setAddress(newZip);
					System.out.println("Zip Code updated");
					break;
				case 5:
					System.out.println("Enter the new Phone Number");
					String newPhoneNumber = sc.nextLine();
					contact.setAddress(newPhoneNumber);
					System.out.println("Phone Number updated");
					break;
				case 6:
					System.out.println("Enter the new E-mail");
					String newEMail = sc.nextLine();
					contact.setAddress(newEMail);
					System.out.println("E-mail updated");
					break;
				}
			}
			else 
				System.out.println("No such contact found");	
		}
		sc.close();
	}

	public void deleteContact(String fName) {
		String name = "";
		for(Contact contact : addBook) {
			name = contact.getfName() + contact.getlName();
			if(fName.equals(name)) {
				addBook.remove(contact);
			}
		}
		//System.out.println(addBook.size());
	}

}
