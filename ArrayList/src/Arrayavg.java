import java.util.Scanner;
public class Arrayavg {
	private static Scanner s = new Scanner(System.in);
	public static void main(String args[]) {
		int[] myint = getint(5);
		for(int i=0;i<myint.length;i++) {
			System.out.println("Element " + i +", typed values was " + myint[i]);
		}
		System.out.println("The average is" + getavg(myint));
		s.close();
	}
	public static int[] getint(int number) {
		System.out.println("Enter " + number + " integer values.\r");
		int values[] = new int[number];
		for(int i=0;i<values.length;i++) {
			values[i] = s.nextInt();
		}
		return values;
	}
	public static double getavg(int arr[]) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum = sum+arr[i];
		}
		return (double) sum/(double)arr.length;
	}
}