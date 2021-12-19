import java.util.Scanner;

//2. Write a java program to calculate the sum of numbers from 1 to N using recursion? 

public class Quest2_9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number : ");
		int x = sc.nextInt();
		sc.close();
		System.out.println(NumSum(x));
		
	}
	public static int NumSum(int n) {
		if(n == 0) {
			return 0;
		}
		else
			return n + NumSum(n -1);
	}
}
