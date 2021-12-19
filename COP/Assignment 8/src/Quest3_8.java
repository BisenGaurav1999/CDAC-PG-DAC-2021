import java.util.Scanner;

//3. Write a program to find out highest and second highest number in an array?
public class Quest3_8 {

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
			int temp;  
			for (int i = 0; i < n; i++)   
			{  
				for (int j = i + 1; j < n; j++)   
				{  
					if (a[i] > a[j])   
					{  
						temp = a[i];  
						a[i] = a[j];  
						a[j] = temp;  
					}  
				}  
			}  
		  System.out.println("Second largest no. is ---->" +a[n-2]);  
	      sc.close();

	}

}
