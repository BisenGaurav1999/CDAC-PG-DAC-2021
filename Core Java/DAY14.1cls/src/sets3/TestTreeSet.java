package sets3;

import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		TreeSet<Integer> lhs=new TreeSet<>();//def ctor => natural ordering (asc)
		int[] data= {120,34,-10,10,13,10,13,14,19,21,34};
		for(int i : data)
			System.out.println("Added "+lhs.add(i));//TS invokes : Integer 's compareTo
		System.out.println(lhs);//no dups , asc order 

	}

}
