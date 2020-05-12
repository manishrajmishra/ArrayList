import java.util.Scanner;
public class Main {
	private static Scanner s = new Scanner(System.in);
	private static GroceryList grocerylist = new GroceryList();
	
	public static void main(String args[]) {
		boolean quit = false;
		int choice = 0;
		printinstruction();
		while(!quit) {
			System.out.println("Enter Choice: ");
			choice = s.nextInt();
			s.nextLine();
			switch(choice) {
			case 0:
				printinstruction();
				break;
			case 1:
				grocerylist.printgrocerylist();
				break;
			case 2:
				additem();
				break;
			case 3:
				modifyitem();
				break;
			case 4:
				removeitem();
				break;
			case 5:
				searchitem();
				break;
			case 6:
				quit = true;
				System.out.println("You have pressed option to quit");
				break;
			default:
				System.out.println("Wrong Choice");
					
			}
		}
	}
	
	public static void printinstruction() {
		System.out.println("\nPress ");
		System.out.println("\t 0 - To print choice option.");
		System.out.println("\t 1 - To print the list of grocery item.");
		System.out.println("\t 2 - To add an item to list.");
		System.out.println("\t 3 - To modify the list.");
		System.out.println("\t 4 - To remove the item.");
		System.out.println("\t 5 - To search the item.");
		System.out.println("\t 6 - To quit from the application.");
	}
	
	public static void additem() {
		System.out.println("Please enter the grocery item: ");
		grocerylist.addgroceryitem(s.nextLine());
	}
	
	public static void modifyitem() {
		System.out.println("Enter the number");
		int itemno = s.nextInt();
		s.nextLine();
		System.out.println("Enter the item of replacement: ");
		String newitem = s.nextLine();
		grocerylist.modifygroceryitem(itemno-1, newitem);
	}
	
	public static void removeitem() {
		System.out.println("Enter the item number to be removed: ");
		int itemno = s.nextInt();
		s.nextLine();
		grocerylist.removegroceryitem(itemno-1);
	}
	
	public static void searchitem() {
		System.out.println("Enter the item to be searched");
		String item;
		item = s.nextLine();
		if(grocerylist.finditem(item)!= null) {
			System.out.println("Your item " + item + " is found in the grocery list");
		}else {
			System.out.println("Item " + item + " is not foung in the grocery list");
		}
	}
}