package sets;

import java.util.HashSet;

public class TestStringSet {

	public static void main(String[] args) {
		String s1=new String("Anish");
		String s2=new String("Rutuj");
		String s3=new String("Mrunal");
		String s4=new String("Anish");
		String s5=new String ("Riya");
		HashSet<String> hs=new HashSet<>();
		System.out.println("Added "+hs.add(s1));//t
		System.out.println("Added "+hs.add(s2));//t
		System.out.println("Added "+hs.add(s3));//t
		System.out.println("Added "+hs.add(s4));//f
		System.out.println("Added "+hs.add(s5));//t
		System.out.println(hs);//[.....]
		System.out.println("size of HashSet "+hs.size());//4
	
		

	}

}
