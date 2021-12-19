package tester;

import java.util.Arrays;
import java.util.List;

public class Test6 {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5,6);
		System.out.println("list via lambda");
		list.forEach(i -> System.out.println(i));
		//can it be replaced by method ref ? YESS
		System.out.println("list via meth ref");
		list.forEach(System.out::println);
		System.out.println("list via lambda again ");
		list.forEach(i -> System.out.print(i+" "));
		//can it be replaced by method ref ? NO --->(i+" ")
		
	}

}
