package sets3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

public class TestTreeSet2 {
//print numbers in desc order
	public static void main(String[] args) {
		// TreeSet(Comparator<? super E> comp) , E : Integer
		TreeSet<Integer> ts = new TreeSet<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				System.out.println("in compare");
				System.out.println(this.getClass());
				return o2.compareTo(o1);
				
			}

		});
		System.out.println(ts);// []
		ts.addAll(Arrays.asList(120, 34, -10, 10, 13, 10, 13, 14, 19, 21, 34));// JVM invokes 
		//TestTreeSet2$1 's compare
		System.out.println(ts);
		

	}

}
