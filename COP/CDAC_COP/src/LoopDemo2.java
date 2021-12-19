import java.util.Scanner;

public class LoopDemo2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		
		int n = scan.nextInt();
		int i = 1;
		while (i <= n) {
			System.out.println(i);
			i = i+1;
		}scan.close();
	}

}
