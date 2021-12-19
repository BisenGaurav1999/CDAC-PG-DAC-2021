import java.util.Scanner;

//7. Write a program to find the Factorial of a number using recursion?

public class Quest7_9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number : \n");
		int num = in.nextInt();
		System.out.println("Factorial of "+num+" is : "+Factorial(num));
		in.close();
	}
	static int Factorial(int n) {
		if (n==0) {
			return 1;
		}
		return n*Factorial(n-1);
	}
}
