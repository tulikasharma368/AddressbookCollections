package addressBookCollections;

public class Contact {
	private String fName;
	private String lName;
	private String address;
	private String city;
	private String state;
	private int zipCode;
	private long phNumber;
	private String email;
	
	public Contact(String fName, String lName, String address, String city, String state, int zipCode, long phNumber,
			String email) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.phNumber = phNumber;
		this.email = email;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	public long getPhNumber() {
		return phNumber;
	}
	public void setPhNumber(long phNumber) {
		this.phNumber = phNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
		
}
