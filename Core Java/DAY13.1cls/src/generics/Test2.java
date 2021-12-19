package generics;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {
		// create fixed size list of doubles : print it
		List<Double> l1=Arrays.asList(1.0,4.5,6.7,3.456,6.89);
		System.out.println(l1);
		//shuffle it n print it
		//public static void shuffle(List<?> list)
		Collections.shuffle(l1);
		System.out.println("shuffled list "+l1);
		//can u use shuffle for shuffling Vector of strings ? YES 
		//public static void shuffle(List<?> list)
		//Can you rewrite above using type parameter ? YES
		//public static <T> shuffle(List<T> list)
		//display contents of the LinkedList in reverse order :  of strings : one two three ....
		LinkedList<String> l2=new LinkedList<>(Arrays.asList("one","two","three","four"));	
		System.out.println(l2.getClass());
		Collections.reverse(l2);
		System.out.println(l2);
		
	}

}
