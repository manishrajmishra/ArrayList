
public class Contact {
	private String name;
	private String phonenumber;
	
	public Contact(String name, String phonenumber) {
		this.name = name;
		this.phonenumber = phonenumber;
	}
	public String getname() {
		return name;
	}
	public String getnumber() {
		return phonenumber;
	}
	public static Contact createcontact(String name, String phonenumber) {
		return new Contact(name, phonenumber);
	}
}
