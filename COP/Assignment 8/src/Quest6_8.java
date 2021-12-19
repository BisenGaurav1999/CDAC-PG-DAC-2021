import java.util.Scanner;

//6. Write a Java program to test if an array contains a specific value?
public class Quest6_8 {

	public static void main(String[] args) {
		System.out.println("Enter No. Of elements You want to enter ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];  
		boolean status = false;
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<n; i++)  
		{  
			a[i]=sc.nextInt();  
		}
		System.out.println("Enter The number To search");
		int s = sc.nextInt();
		for (int i = 0; i < a.length; i++) {
			if (a[i] == s) {
				System.out.println("Match found ");
				status = true;
			}
				
		}
		if (status == false) {
			System.out.println("Match not Found");
		}
		sc.close();
	}

}
