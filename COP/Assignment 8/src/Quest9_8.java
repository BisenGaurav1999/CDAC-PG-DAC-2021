import java.util.Arrays;
import java.util.Scanner;

//9. Write a Java program to find the common elements between two arrays of integers?

public class Quest9_8 {

	public static void main(String[] args) {
		System.out.println("===============================================================");
		System.out.println("*********                     Welcome                 *********");
		System.out.println("===============================================================");
		System.out.println("Enter No. Of elements You want in 1st Array ");
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int[] a = new int[n1];
		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Enter No. Of elements You want in 2st Array ");
		int n2 = sc.nextInt();
		int[] b = new int[n2];
		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < b.length; i++) {
			b[i] = sc.nextInt();
		}
		System.out.println("Array1 : " + Arrays.toString(a));
		System.out.println("Array2 : " + Arrays.toString(b));
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					System.out.println("Common Element : " + a[i]);

				}
			}
		}
		sc.close();
	}

}
