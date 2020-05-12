import java.util.Arrays;
public class ReverseChallenge {
	public static void main(String args[]) {
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("Array = " + Arrays.toString(a));
		reverse(a);
		System.out.println("Reverse Array = " + Arrays.toString(a));
	}
	private static void reverse(int arr[]) {
		int maxindex = arr.length-1;
		int halflength = arr.length/2;
		for(int i=0;i<halflength;i++) {
			int temp=arr[i];
			arr[i]=arr[maxindex-i];
			arr[maxindex-i]=temp;
		}
	}
}