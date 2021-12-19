package strings;

public class Test3 {

	public static void main(String[] args) {
		// == vs equals
		Object s1 = new String("abcdefg");//up casting
		Object s2 = new String("abcdefg");
		System.out.println(s1 == s2);// false : refrence equality
		System.out.println(s1.equals(s2));// true : content equality : Object class has overridden Object's equals
											// method to replace ref.equality by content equality
		String s3=((String)s2).toUpperCase();
		System.out.println(s2==s3);//false
		System.out.println(s2.equals(s3));//false
		System.out.println(((String)s2).equalsIgnoreCase(s3));//true
		
	}

}
