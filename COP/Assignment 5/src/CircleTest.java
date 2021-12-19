import java.util.Scanner;

public class CircleTest {

	public static void main(String[] args) {
		System.out.println("Enter the Radius Of Circle");
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		Circle c1 = new Circle(a);
		c1.calArea();
		c1.calPerimeter();
		sc.close();
	}

}
