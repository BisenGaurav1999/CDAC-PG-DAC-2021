package p2;

public class C implements A, B {
	@Override
	public double calc(double a, double b) {
		return a + b;
	}
	//in case of duplicate method imple : javac FORCES overriding of the inherited def method

	@Override
	public void show() {
		System.out.println("overriding dup def method");
		A.super.show();
		B.super.show();
	}
	
}
