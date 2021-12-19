import java.util.Scanner;

public class LoopDemo1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		
		int n = scan.nextInt();
		for(int i=0;i<=n;i++)
		{
			System.out.print(i +" ");
		}
		scan.close();
		}
}
