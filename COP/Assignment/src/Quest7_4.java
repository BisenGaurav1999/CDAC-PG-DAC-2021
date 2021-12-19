
/*
 7. Write a program to make such a pattern like right angle triangle with a number which will repeat a number in a row, as shown below : 
1
22
333
4444
 */
import java.util.Scanner;
public class Quest7_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int a = sc.nextInt();
		for (int i = 0; i <= a; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(i);
			}System.out.println();
		}
		sc.close();
	}

}
