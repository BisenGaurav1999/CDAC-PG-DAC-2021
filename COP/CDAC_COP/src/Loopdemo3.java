import java.util.Scanner;

public class Loopdemo3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");

		int n = scan.nextInt();
		int i = 1;
		do {

			System.out.println(i);
			i++;
		} while (i <= n);
		scan.close();
	}

}
