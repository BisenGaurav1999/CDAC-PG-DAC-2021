import java.util.Scanner;

//5. Write a recursive program to print Fibonacci Series for given number of terms?

public class Quest5_9 {
		   static int n1 = 0, n2 = 1, n3 = 0;
		   static void fibbonacci(int count) {
		      if (count > 1) {
		         n3 = n1 + n2;
		         n1 = n2;
		         n2 = n3;
		         System.out.print(" " + n3);
		         fibbonacci(count - 1);
		      }
		   }
		   public static void main(String args[]) {
			   Scanner in = new Scanner(System.in);
			   System.out.println("Enter the number of terms You want to print");
		      int count = in.nextInt();
		      in.close();
		      System.out.print(n1 + " " + n2);
		      fibbonacci(count - 1);
		   }
		
}
