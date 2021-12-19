import java.util.Scanner;

public class NumUtilMainTest {

	
	
	static void ChoiceOpt(){
	    System.out.println("===============================================================");
		System.out.println("**** Welcome to The Calculator ****");
        System.out.println("===============================================================");
		System.out.println(String.format("Calculating Power           -----  1"));
        System.out.println(String.format("Calculating Factorial       -----  2"));
        System.out.println(String.format("Checking a num Prime        -----  3"));
        System.out.println(String.format("Checking for Even or not    -----  4"));
        System.out.println(String.format("Checking for Odd or not     -----  5"));
      	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ChoiceOpt();
		System.out.println("Enter the Number as per Choice ");
		int ch = sc.nextInt();
		switch (ch) {
		case 1: System.out.println("Enter the number and the power");
			    System.out.println(NumUtilMain.getPower(sc.nextInt(), sc.nextInt()));
			break;
		case 2: System.out.println("Enter The Number");
		        System.out.println(NumUtilMain.getFactorial(sc.nextInt()));
		    break;
		case 3: System.out.println("Enter The number");
		        System.out.println(NumUtilMain.isPrime(sc.nextInt()));
			break;
		case 4: System.out.println("Enter The Number");
		        System.out.println(NumUtilMain.isEven(sc.nextInt()));
		    break;
		case 5: System.out.println("Enter The Number");
		        System.out.println(NumUtilMain.isOdd(sc.nextInt()));
			break;
		default: System.out.println("Invalid input ,,,Retry baby");
			break;
		}		sc.close();
	}

}
