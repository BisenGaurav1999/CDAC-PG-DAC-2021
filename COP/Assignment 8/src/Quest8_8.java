import java.util.Scanner;

//8. Write a Java program to find the duplicate values of an array of integer values?

public class Quest8_8 {
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
		boolean flag = false;
		int status = 0;
		for (int i = 0; i < a.length-1; i++) {
			flag = false;
			for (int j = i+1; j < a.length; j++) {
				
				if (a[i] == a[j] && a[j] != -1) {
					status = 1;
					flag = true;
					a[j]=-1;
				}
			}
			if (flag == true) {
				System.out.println("Duplicate Value found "+ a[i]);
			}
		}
		
		if(status == 0) {
			System.out.println("No Duplicate Value Found");
		}
		
		sc.close();
	}
}
