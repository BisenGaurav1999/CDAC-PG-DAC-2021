import java.util.Scanner;

/*5. Write a program to display the pattern like right angle triangle using an asterisk as shown below:

*
**
***
**** 
*/
public class Quest5_4 {

	public static void main(String[] args) {
		System.out.println("Enter number of line u want to print : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n ; i++) {
			for (int j = 0; j <=i; j++) {
				System.out.print("*");
			}System.out.println();
		}
		sc.close();
	}

}
