package p3;

public class Test {

	public static void main(String[] args) {
		Formula ref=new MyImpleClass();
		System.out.println(ref.calculate(100));
		System.out.println(ref.sqrt(13, 12));
		Formula.print("hello");
		MyImpleClass.print("hi");
		

	}

}
