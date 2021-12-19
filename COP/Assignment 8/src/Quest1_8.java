import java.util.Scanner;

//1. Write a program to calculate average of numbers stored in an array?
public class Quest1_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size of The Array");
		int a = sc.nextInt();
		int []arr = new int[a];
		double sum = 0;
		System.out.println("Enter the element of Array");
		for (int i = 0; i <a ; i++) {
			arr[i] = sc.nextInt();
			sum = sum + arr[i];
		}
		System.out.println("Average is : " + sum/a);
		sc.close();
	}

}
