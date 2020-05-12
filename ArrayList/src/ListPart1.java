import java.util.Scanner;
public class ListPart1 {
	private static Scanner s = new Scanner(System.in);
	private static int basedata[] = new int[10];
	public static void main(String aargs[]) {
		System.out.println("Enter 10 intergers");
		getinput();
		printarray(basedata);
		resizearray();
		System.out.println("Enter 12 integers");
		getinput();
		printarray(basedata);
		s.close();
	}
	private static void getinput() {
		for(int i=0;i<basedata.length;i++) {
			basedata[i]=s.nextInt();
		}
	}
	private static void printarray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
			System.out.println();
		}
	}
	private static void resizearray() {
		int original[] = basedata;
		basedata = new int[12];
		for(int i=0;i<original.length;i++) {
			basedata[i]=original[i];
		}
	}
}