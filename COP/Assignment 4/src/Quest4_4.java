import java.util.Scanner;

//4. Write a program to calculate the factorial of the given number?

public class Quest4_4 {
	public static void main(String[] args) {
				Scanner sc =  new Scanner(System.in);
				System.out.println("Enter a number :");
				int n = sc.nextInt();
				int fact = 1;
				for (int i = 1; i <= n; i++) {
					fact = fact*i;
				}
				System.out.println("Factorial of "+n+"is :\n" + fact);
				sc.close();
	}

}
