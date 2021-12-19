
//1. Write a java program to print first 10 natural number using recursion?

public class Quest1_9 {

	public static void main(String[] args) {
		int num =10;
		printNaturalNum(num);
	}
	
	public static void printNaturalNum(int num1){
		if (num1 == 0) {
			return ;
		}
		System.out.println(num1);
		printNaturalNum(num1-1);
	}

}
