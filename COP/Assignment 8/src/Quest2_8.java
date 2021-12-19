import java.util.Scanner;

//2. Write a program to reverse an array of elements?

public class Quest2_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size of The Array");
		int a = sc.nextInt();
		int []arr = new int[a];
		System.out.print("Enter the element of Array");
		for (int i = 0; i <a ; i++) {
			arr[i] = sc.nextInt();
		}
		int temp;
        int size=arr.length;
		for (int i = 0; i <size ; i++) {
			temp = arr[i];
			arr[i] = arr[size - 1];
			arr[size-1] = temp;
			size-=1;
		}
		 System.out.print("Reversed array : ");
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
		
		sc.close();
	}

	}}
