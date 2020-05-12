import java.util.Scanner;
public class MinElementChallenge {
	private static Scanner s = new Scanner(System.in);
	public static void main(String args[]) {
		int n;
		System.out.println("Enter the size limits of array");
		n = s.nextInt();
		int array[] = readintegers(n);
		int minimum = findmin(array);
		System.out.println("Minimum Value: " + minimum);
		s.close();
	}
	public static int[] readintegers(int count) {
		int arr[] = new int[count];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		return arr;
	}
	public static int findmin(int arr[]) {
		int min = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			int value = arr[i];
			if(value<min) {
				min = value;
			}
		}
		return min;
	}
	
}