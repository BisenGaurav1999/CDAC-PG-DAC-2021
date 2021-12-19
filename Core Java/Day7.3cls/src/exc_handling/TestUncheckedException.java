package exc_handling;

public class TestUncheckedException {

	public static void main(String[] args) {
		String s = "abxq123";
		System.out.println("int value " + Integer.parseInt(s));// exc: NumberFormatException : un-checked exc :since it
																// extends RuntimeExc : javac DOES NOT force handling of
																// the unchecked excs
		System.out.println("main over...");
	}

}
