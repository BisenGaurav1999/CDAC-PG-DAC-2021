import java.util.Scanner;

//3. Write a program to calculate the product of two integers using recursion? (Multiplication & Division operators are not allowed)

public class Quest3_9 {

	public static void main(String[] args) {
		System.out.println("Enter two numbers for product");
		Scanner in = new Scanner(System.in);
		int a1 =in.nextInt();
		int b1 = in.nextInt();
		System.out.println("the product of number is : " + product(a1, b1));
		in.close();
	}
	
	public static int product(int a,int b) {
		int pro;
		if (b==0 || a == 0) {
			return 0;
		}
		else
			  pro = a + product( a , b-1);
		return pro;
	}

}
