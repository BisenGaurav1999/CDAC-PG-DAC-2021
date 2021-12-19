package strings;

public class Test2 {

	public static void main(String[] args) {
		// == vs equals
		String s1 = new String("abcdefg");
		String s2 = new String("abcdefg");
		System.out.println(s1 == s2);// false : hashcode comparison or refrence equality
		System.out.println(s1.equals(s2));// true : content equality : String class has overridden Object's equals
											// method to replace ref.equality by content equality
		String s3=s2.toUpperCase();
		System.out.println(s2==s3);//false
		System.out.println(s2.equals(s3));//false
		System.out.println(s2.equalsIgnoreCase(s3));//true
		
	}

}
