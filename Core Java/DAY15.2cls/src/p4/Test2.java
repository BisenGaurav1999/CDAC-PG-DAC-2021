package p4;

import java.util.Arrays;
import java.util.LinkedList;

public class Test2 {

	public static void main(String[] args) {
		// use higher order function to display elements of the LinkedList.
		LinkedList<Integer> list=new LinkedList<>(Arrays.asList(10,20,1,2,3,56,11));
		//API def. method of Iterable
		//public default void forEach(Consumer<? super T> action)
		//java.util.function.Consumer : func i./f
		//SAM : public void accept(T t)
		//via ano inner class
//		list.forEach(new Consumer<Integer>() {
//
//			@Override
//			public void accept(Integer t) {
		
//				System.out.print(t+" ");
//				
//			}
//			
//		});
		//lambda expression
		list.forEach(i -> System.out.print(i+" "));
		

	}

}
