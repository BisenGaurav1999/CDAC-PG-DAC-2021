/*
 8. Write a program to make such a pattern like right angle triangle with number increased by 1 as shown below : 
1
2 3
4 5 6
7 8 9 10
 */
import java.util.Scanner;
public class Quest8_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number ");
		
		int a = sc.nextInt();
		int c = 1;
		for (int i = 1; i <= a; i++) { 
			for (int j = 1; j <=i; j++) {
				System.out.print(c+" ");
				c++;
			}System.out.println();
		}sc.close();
	}

}
