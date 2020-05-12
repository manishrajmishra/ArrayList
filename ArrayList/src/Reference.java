import java.util.Arrays;
public class Reference {
	public static void main(String args[]) {
		int myintvalue = 10;
		int anotherintvalue = myintvalue;
		
		System.out.println("Myintvalue = " + myintvalue);
		System.out.println("Aotherintvalue = " + anotherintvalue);
		
		anotherintvalue++;
		
		System.out.println("Myintvalue after increment = " + myintvalue);
		System.out.println("Aotherintvalue after increment= " + anotherintvalue);
		
		int a[] = new int[5];
		int a1[] = a;
		
		System.out.println("Array is = " + Arrays.toString(a));
		System.out.println("Another Array is = " + Arrays.toString(a1));
		
		a1[0] = 1;
		
		System.out.println("Array After cahnge is = " + Arrays.toString(a));
		System.out.println("Another Array After change is = " + Arrays.toString(a1));
	    
		a1 = new int[] {4,5,6,7,8};
	    modifier(a);
	    
		System.out.println("Array After cahnge by modifier is = " + Arrays.toString(a));
		System.out.println("Another Array After change by modifier is = " + Arrays.toString(a1));
	
	}
	
	private static void modifier(int arr[]) {
		
		arr[0] = 2;
		arr = new int[] {1,2,3,4,5};
	}
}