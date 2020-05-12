import java.util.ArrayList;
public class GroceryList {

	private ArrayList<String> grocerylist = new ArrayList<String>();
	
	public void addgroceryitem(String item) {
		grocerylist.add(item);
	}
	
	public void printgrocerylist() {
		System.out.println("You have " + grocerylist.size() + " item in your grocery list");
		for(int i=0;i<grocerylist.size();i++) {
			System.out.println((i+1) + " . " + grocerylist.get(i));
		}
	}
	
	public void modifygroceryitem(int position, String newitem) {
		grocerylist.set(position, newitem);
		System.out.println("Grocery item " + (position+1) + " has been modified.");
	}
	
	public void removegroceryitem(int position) {
		String theitem = grocerylist.get(position);
		grocerylist.remove(position);
	}
	
	public String finditem(String searchitem) {
		int position = grocerylist.indexOf(searchitem);
		if(position>=0) {
			return grocerylist.get(position);
		}
		return null;
	}
}