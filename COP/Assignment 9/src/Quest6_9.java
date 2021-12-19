import java.util.Scanner;

//6. Write a program to find the sum of digits of a number using recursion?

public class Quest6_9 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = in.nextInt();
		in.close();
		System.out.println(sum(a));
	}
	public static int sum(int num) {
		if (num == 0) {
			return 0;
		}
		return num%10 + sum(num/10);
		
	}

}
