package inheritance;

 class A {
	A(){
		super();	//javac adds its implicitly
		System.out.println("In A's ctor");
	}
}

class B extends A{
	B(){
		super();	//javac adds its implicitly => Invoking immediate super cls's def ctor
		System.out.println("In B's ctor");
	}
}

public class C extends B{
	public C(){
		super();	//javac adds its implicitly
		System.out.println("In C's ctor");
	}
}
