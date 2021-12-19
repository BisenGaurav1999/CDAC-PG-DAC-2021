//3. Write a program in java to display the multiplication table of a given integer?

import java.util.Scanner;

public class Quest3_4 {
	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(n +" x "+ i +" = " + n*i );
		}
		sc.close();
	}

}
