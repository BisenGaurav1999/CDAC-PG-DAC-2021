package p1;

public class MyImpleClass2 implements Formula{

	@Override
	public double calculate(double a) {
		System.out.println("imple abstract method again");
		return a+a;
	}
	//Can imple class override inherited def method imple ? YES

	@Override
	public double sqrt(double a, double b) {
		System.out.println("overrding def method");
		return Math.sqrt(a-b);
	}


}
