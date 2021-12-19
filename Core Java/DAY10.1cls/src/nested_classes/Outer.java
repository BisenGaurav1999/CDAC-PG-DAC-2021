 package nested_classes;

public class Outer {
//can outer class contain static as well as non static data members ? : YES
	private int i;
	private static int j;
	static {
		j = 10;
	}

	public Outer(int i) {
		this.i = i;
	}

	// can outer class contain static as well as non static method members ? : YES
	public void show() {
		System.out.println("from outer's non-static method " + i + " " + j);
		//can outer class(non static method) access inner's data members DIRECTLY ?(w/o instantiation) : NO
		//simply create inner cls instance n acces it!
		//System.out.println(l);
		Inner in=new Inner(1234);
		System.out.println("accessing inner's members "+in.l);
	//	in.showInner();
	}

	public static void print() {
		System.out.println("from outer's static method " + j);// i : inaccessible directly
		//how to access inner cls' members ? 
	//	Inner in=new Inner(12345);
		Outer o=new Outer(11);
		//how to create inner cls ref ? : Outer.Inner
		Outer.Inner in=o.new Inner(12);
		in.showInner();
		//can u combine 2 statements in single one ?
		Outer.Inner in2=new Outer(34).new Inner(78);
		in2.showInner();
	}

	// nested class : non static nested class : inner class
	public class Inner {
		// can inner class(=non static nested class) contain static data members ? : NO
		// (static constants)
		private static final int k = 20;
		// can inner class(=non static nested class) contain non static data members ?
		// :YES
		private int l;

//		static {
//			
//		}
		public Inner(int l) {
			super();
			this.l = l;
		}

		// can you add static methods in inner class ? : NO
//		public static void test1()
//		{
//			
//		}
		// can you add non static methods in inner class ? : YES
		public void showInner() {
			// Inner class can DIRECTLY access Outer's members. : since every inner class is
			// implicitly associated with Outer class instance.
			System.out.println("from inner's non static method "+i+" "+j+" "+k+" "+l);
		}

	}
}
