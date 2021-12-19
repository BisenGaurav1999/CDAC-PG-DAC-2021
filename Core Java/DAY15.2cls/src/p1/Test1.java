package p1;

public class Test1 {

	public static void main(String[] args) {
		Formula[] formulae= {new MyImpleClass(),new MyImpleClass2()};//up casting
		for(Formula f : formulae)
		{
			System.out.println(f.calculate(20));//
			System.out.println(f.sqrt(15, 10));
			
		}

	}

}
