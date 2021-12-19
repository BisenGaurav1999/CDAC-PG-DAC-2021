import java.util.Scanner;

//Write a java program to read 10 numbers from keyboard and find their  sum and average?
public class Quest2_4 {

	public static void main(String[] args) {
		System.out.println("Enter 10 number ");
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
				int sum = 0;
		for(int i=0;i<10;i++)
		{
			a[i]=sc.nextInt();
			sum = sum + a[i];
		}
		System.out.println("Sum of number is : "+ sum);
		System.out.println("Avg is : " + (double)sum/10 );
		sc.close();
	}

}
