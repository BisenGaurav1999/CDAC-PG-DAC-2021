package tester;

import nested_classes.Outer;

public class TestInnerClass {

	public static void main(String[] args) {
		// how will you invoke showInner method ?
		//inner class ref.
		Outer.Inner in=new Outer(11).new Inner(13);
		in.showInner();
		

	}

}
