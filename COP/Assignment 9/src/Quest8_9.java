import java.util.Scanner;

//8. Write a program to get the largest element of an array using recursion?

public class Quest8_9 {

	public static void main(String[] args) {
		System.out.println("Enter Size of array");
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int[] arr = new int[a];
		System.out.println("Enter the elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		in.close();
		System.out.println("largest element is : "+ largest(arr, 1, arr[0], arr.length));
	}
	public static int largest(int[] arr,int i,int max,int length)
    {
        if(i==length)
        {
            return max;
        }
        else
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
            return largest(arr,i+1,max,length);
        }
    

}}
