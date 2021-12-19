package p1;

public class MyImpleClass implements Formula{

	@Override
	public double calculate(double a) {
		System.out.println("imple abstract method");
		return a*a;
	}
	//Imple. class can access inherited defualt method

}
