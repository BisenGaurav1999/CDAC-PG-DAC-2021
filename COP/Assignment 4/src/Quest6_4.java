import java.util.Scanner;

/*6. Write a program to display the pattern like right angle triangle with a number as shown below : 
1
12
123
1234
 */
public class Quest6_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int a = sc.nextInt();
		for (int i = 0; i <= a; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(j);
			}System.out.println();
		}
		sc.close();
	}

}
