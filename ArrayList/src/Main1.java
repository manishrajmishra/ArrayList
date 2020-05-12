import java.util.Scanner;
public class Main1 {
	private static Scanner s = new Scanner(System.in);
	private static Mobilephone mobilephone = new Mobilephone("8340229351");
	public static void main(String args[]) {
		boolean quit = false;
		startphone();
		printaction();
		while(!quit) {
			System.out.println("\nEnter action: (6 to show avilable actions)");
			int action = s.nextInt();
			s.nextLine();
			switch(action) {
			case 0:
				System.out.println("\n Shutting Down....");
				quit = true;
				break;
			case 1:
				printcontacts();
				break;
			case 2:
				addnewcontact();
				break;
			case 3:
				updatecontact();
				break;
			case 4:
				removecontact();
				break;
			case 5:
				querycontact();
				break;
			case 6:
				printaction();
				break;
			default:
				System.out.println("Wrong choice");
			}
		}
	}
	private static void addnewcontact() {
		System.out.println("Enter new contact name: ");
		String name = s.nextLine();
		System.out.println("Enter the phone number: ");
		String phone = s.nextLine();
		Contact newcontact = Contact.createcontact(name, phone);
		if(mobilephone.addnewcontact(newcontact)) {
			System.out.println("New contact added: name = " + name + " , phone = " + phone);
		}else {
			System.out.println("Cannot add, " + name + "already on file");
		}
	}
	private static void updatecontact() {
		System.out.println("Enter existing contact name: ");
		String name = s.nextLine();
		Contact existingcontactrecord = mobilephone.querycontact(name);
		if(existingcontactrecord == null) {
			System.out.println("Contact not found");
			return;
		}
		System.out.println("Enter new contact name: ");
		String newname = s.nextLine();
		System.out.println("Enter new contact phone number");
		String newnumber = s.nextLine();
		Contact newcontact = Contact.createcontact(newname, newnumber);
		if(mobilephone.updatecontact(existingcontactrecord, newcontact)) {
			System.out.println("Successfully updated record");
		}else {
			System.out.println("Error in updating record.");
		}
	}
	private static void removecontact() {
		System.out.println("Enter existing contact name: ");
		String name = s.nextLine();
		Contact existingcontactrecord = mobilephone.querycontact(name);
		if(existingcontactrecord == null) {
			System.out.println("Contact not found");
			return;
		}
		if(mobilephone.removecontact(existingcontactrecord)) {
			System.out.println("Successfully deleted");
		}else {
			System.out.println("Error in deleting.");
		}
	}
	private static void querycontact() {
		System.out.println("Enter existing contact name: ");
		String name = s.nextLine();
		Contact existingcontactrecord = mobilephone.querycontact(name);
		if(existingcontactrecord == null) {
			System.out.println("Contact not found");
			return;
		}
		System.out.println("Name " + existingcontactrecord.getname() + " phone number is " +existingcontactrecord.getnumber());
	}
	private static void printcontacts() {
		mobilephone.printContacts();
	}
	private static void startphone() {
		System.out.println("Starting phone.....");
	}
	private static void printaction() {
		System.out.println("\nAvailable action:\npress");
		System.out.println("0 - to shutdown\n");
		System.out.println("1 - to print contacts");
		System.out.println("2 - to add new contact\n");
		System.out.println("3 - to update existing contact\n");
		System.out.println("4 - to remove an existing contact\n");
		System.out.println("5 - query if an existing contact exists\n");
		System.out.println("6 - to print a list of available actions\n");
		System.out.println("Choose your action: ");
	}
}
