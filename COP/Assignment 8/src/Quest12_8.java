import java.util.Arrays;
import java.util.Scanner;

//12. Write a program to Sort strings in alphabetical order?
public class Quest12_8 {

	public static void main(String[] args) {
		System.out.println("===============================================================");
		System.out.println("*********                     Welcome                 *********");
		System.out.println("===============================================================");
		System.out.println("Enter Size of Array ");
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		String [] a = new String[n1];
		System.out.println("Enter the Elements ");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.next();
		}sc.close();
		System.out.println("Unsorted Array : "+ Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("Sorted Array   : "+ Arrays.toString(a));

	}

}
