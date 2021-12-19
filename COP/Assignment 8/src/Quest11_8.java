import java.util.Arrays;
import java.util.Scanner;

//11. Write a program to Sort an array in ascending order? [Notes : Arrays.sort()]

public class Quest11_8 {

	public static void main(String[] args) {
		System.out.println("===============================================================");
		System.out.println("*********                     Welcome                 *********");
		System.out.println("===============================================================");
		System.out.println("Enter Size of Array ");
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int[] a = new int[n1];
		System.out.println("Enter the Elements ");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}sc.close();
		System.out.println("Unsorted Array : "+ Arrays.toString(a));
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Sorted Array   : "+ Arrays.toString(a));
	}
}
