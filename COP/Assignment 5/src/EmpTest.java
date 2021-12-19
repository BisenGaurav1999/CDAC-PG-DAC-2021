import java.util.Scanner;

public class EmpTest {

	public static void main(String[] args) {
		System.out.println("Welcome to the Employee management System");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Empployee Id ");
		int a = sc.nextInt();
		
		System.out.println("Enter Empployee Name ");
		String b = sc.next();
		
		System.out.println("Enter Empployee Department ");
		String c = sc.next();
		
		System.out.println("Enter Empployee Salary ");
		double d = sc.nextDouble();
		Emp e1 = new Emp(a, b, c, d);
		
		
		e1.displayEmpDetails();
		sc.close();
	}

}
