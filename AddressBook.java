package addressBookCollections;

import java.util.ArrayList;

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
		addBook.add(contact);
		System.out.println(addBook.size());
	}

}
