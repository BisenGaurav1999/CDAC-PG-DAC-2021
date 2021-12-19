//1. Write a java program to print first 10 natural numbers and their sum?

public class Quest1_4 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <=10 ; i++) {
			System.out.println(i);
			sum = sum + i;
				}
		System.out.println("Sum of 10 natural Number is : "+ sum);
	}

}
