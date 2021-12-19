package sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class TestHashSet {

	public static void main(String[] args) {
		//create populated HS<Integer> from a fixed size list : 10, 20, 11,110,30,10,45,25,10
		List<Integer> list=Arrays.asList(10, 20, 11,110,30,10,45,25,10);//auto boxing
	//	list.add(0,2345);
		HashSet<Integer> hs=new HashSet<>(list);//copies refs from fixed size list into growable HS
		System.out.println(hs);
		System.out.println("Added 17 "+hs.add(17));//true
		System.out.println("Added 11 "+hs.add(11));//false
		System.out.println(hs);//no dups , un ordered , un sorted.
		System.out.println("hs contains 30 "+hs.contains(30));//t
		System.out.println("removing 30 "+hs.remove(30));//t
		System.out.println("hs contains 30 "+hs.contains(30));//f
		

	}

}
