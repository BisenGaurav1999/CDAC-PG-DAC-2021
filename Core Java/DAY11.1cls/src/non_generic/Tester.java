package non_generic;

public class Tester {

	public static void main(String[] args) {
		// create Holder class instance to hold the int .
		Holder h1 = new Holder(100);// implicit conversions done by javac : autobox (int -->Integer) -->upcasting
									// --> Object
		System.out.println("cls loaded "+h1.getReference().getClass());//java.lang.Integer
		int data=(Integer)h1.getReference();//prog : down casting   javac : auto un boxing (intValue)
		// create another  Holder class instance to hold the String
		Holder h2=new Holder("some mesg");//javac : String ---> up casting ---> Object
		String s=(String)h2.getReference();//prog : explicit down casting
		h1=h2;//h1 n h2 are referring to Holder class instance
		System.out.println(h1.getClass());
		System.out.println(h2.getClass());
		data=(Integer)h1.getReference();//class cast exc : String can't be cast into Integer
	}

}
