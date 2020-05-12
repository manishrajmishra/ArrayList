import java.util.Scanner;
public class Sorting {
	private static Scanner s = new Scanner(System.in);
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int n;
		System.out.println("Enter the size of array");
		n = s.nextInt();
		int myint[] = getint(n);
		int sorted[] = sortarr(myint);
		printarr(sorted);
		s.close();
	}
	public static int[] getint(int number){
		int arr[] = new int[number];
		for(int i=0;i<arr.length;i++){
			arr[i] = s.nextInt();
		}
		return arr;
	}
	public static void printarr(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.println("Elements " + i + " contents " + arr[i]);
		}
	}
	public static int[] sortarr(int arr[]){
		int arr1[] = new int[arr.length];
		for(int i=0;i<arr.length;i++){
			arr1[i] = arr[i];
		}
		int temp;
//		for(int j=0;j<arr1.length;j++){
		boolean flag = true;
		while(flag) {
			flag=false;
			for(int i=0;i<(arr1.length-1);i++){
				if(arr1[i]<arr1[i+1]){
					temp=arr1[i];
					arr1[i]=arr[i+1];
					arr1[i+1]=temp;
					flag = true;
				}
			}
		}
		return arr1;
	}
}