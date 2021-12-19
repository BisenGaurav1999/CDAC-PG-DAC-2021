package strings;

public class Test1 {

	public static void main(String[] args) {
		//immutabilitity of Strings
		String s1=new String("hello");
		String s2=new String();
		s1.concat("hi");
		System.out.println(s1);//hello
		s1+="12345";
		System.out.println(s1);//hello12345
		System.out.println(s1.length());//10
		System.out.println(s1.toUpperCase());//HELLO12345
	}

}
