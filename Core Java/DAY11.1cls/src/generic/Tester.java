package generic;

public class Tester {

	public static void main(String[] args) {
		// create Holder class instance to hold the int .
		//diamond operator => javac can auto infer generic type of the RHS from the LHS 
		Holder<Integer> h1 = new Holder<>(100);// impl conv done javac : int --->Integer : auto boxing
		int data=h1.getReference();//RHS : Integer ---> int : javac : auto un boxing
		// create another Holder class instance to hold the String
		Holder<String> h2=new Holder<>("some data");//javac impl conversion : NONE !
		String s=h2.getReference();//no expl down casting
	//	h1=h2;//catching type mismatch errors @ compile time --so as to avoid run time err : ClassCastExc.

	}

}
