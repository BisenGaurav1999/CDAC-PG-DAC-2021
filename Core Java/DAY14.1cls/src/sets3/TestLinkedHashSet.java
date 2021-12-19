package sets3;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class TestLinkedHashSet {

	public static void main(String[] args) {
		LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
		int[] data= {120,34,-10,10,13,10,13,14,19,21,34};
		for(int i : data)
			System.out.println("Added "+lhs.add(i));
		System.out.println(lhs);//[120,34,-10,10,13,14,19,21] : ordered set imple class , extends from HashSet
			
		

	}

}
