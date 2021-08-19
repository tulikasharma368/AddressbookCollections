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
		//System.out.println(addBook.size());
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
					String val = contact.getAddress();
					System.out.println(val);
					break;
				case 2:
					System.out.println("Enter the new City");
					String newCity = sc.nextLine();
					contact.setAddress(newCity);
					break;
					

				}
				
				
			}
		}
		
		
	}

}
