import java.util.Scanner;

//4. Write a program to calculate the power of any number using recursion?

public class Quest4_9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Number and the power");
		int num = in.nextInt();
		int pow = in.nextInt();
		in.close();
		System.out.println("Result : "+power(num, pow));
	}
	
	public static int power(int a, int b) {
		int pro;
		if (b==0) {
			return 1;
		}
		else
			  pro = a * power( a , b-1);
		return pro;
	}

}
