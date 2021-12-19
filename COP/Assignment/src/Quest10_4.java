import java.util.Scanner;

/*10. Write a program to make such a pattern like a pyramid with a number which will repeat the number in the same row as shown below : 
   1
  2 2
 3 3 3
4 4 4 4*/

public class Quest10_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number ");

		int a = sc.nextInt();
		int k=0;
		for (int i = 1; i <= a; ++i, k = 0) {
		      for (int space = 1; space <= a - i; ++space) {
		        System.out.print("  ");
		      }

		      while (k != 2 * i - 1) {
		        System.out.print(i +" ");
		        ++k;
		      }System.out.println();
			sc.close();
		}

	}
}
