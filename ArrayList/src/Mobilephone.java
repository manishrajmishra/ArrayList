import java.util.ArrayList;
public class Mobilephone {
	private String mynumber;
	private ArrayList<Contact> mycontact;
	
	public Mobilephone(String mynumber) {
		this.mynumber = mynumber;
		this.mycontact = new ArrayList<Contact>();
	}
	public boolean addnewcontact(Contact contact) {
		if(findcontact(contact.getname())>=0) {
			System.out.println("Contact is already on file");
			return false;
		}
		mycontact.add(contact);
		return true;
	}
	public boolean updatecontact(Contact oldcontact, Contact newcontact) {
		int foundposition = findcontact(oldcontact);
		if(foundposition < 0) {
			System.out.println(oldcontact.getname() + " , was not found.");
			return false;
		}else if(findcontact(newcontact.getname()) != -1){
			System.out.println("Contact with name " + newcontact.getname() + " already exists. Update was not Successful.");
			return false;
		}
		this.mycontact.set(foundposition, newcontact);
		System.out.println(oldcontact.getname() + " , was replaced with " + newcontact.getname());
		return true;
	}
	public boolean removecontact(Contact contact) {
		int foundposition = findcontact(contact);
		if(foundposition<0) {
			System.out.println(contact.getname() + ", wass not found.");
			return false;
		}
		this.mycontact.remove(foundposition);
		System.out.println(contact.getname() + ", wwas deleted.");
		return true;
	}
	private int findcontact(Contact contact) {
		return this.mycontact.indexOf(contact);
	}
	private int findcontact(String contactname) {
		for(int i=0;i<this.mycontact.size();i++) {
			Contact contact = this.mycontact.get(i);
			if(contact.getname().equals(contactname)) {
				return i;
			}
		}
		return -1;
	}
	public String querycontact(Contact contact) {
		if(findcontact(contact)>=0) {
			return contact.getname();
		}
		return null;
	}
	public Contact querycontact(String name) {
		int position = findcontact(name);
		if(position >= 0) {
			return this.mycontact.get(position);
		}
		return null;
	}
	public void printContacts() {
		System.out.println("Contact List");
		for(int i=0;i<this.mycontact.size();i++) {
			System.out.println((i+1) + " . " + this.mycontact.get(i).getname() + " => " + this.mycontact.get(i).getnumber());
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
