import java.util.Scanner;

//4. Write a Java program to copy an array to another by iterating the array?
public class Quest4_8 {

	public static void main(String[] args) {
		System.out.println("Enter No. Of elements You want to enter ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];  
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<n; i++)  
		{  
			a[i]=sc.nextInt();  
		}
		int[] b = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
		System.out.print("Copy array : ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
	}sc.close();
	}
}
