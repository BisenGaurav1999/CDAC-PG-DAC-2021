package java8_strms;

import java.util.Arrays;

public class Test3 {

	public static void main(String[] args) {
		// Create Stream<Integer> from a fixed size list (un sorted ) of integers , sort
		// n display it.
		System.out.println("Sorted ints :asc ");
		Arrays.asList(10,1,23,45,56,789,-10)//List<Integer>
		.stream() //Stream<Integer> : src  : unsorted strm
		.sorted() //Stream<Integer> sorted : N.O
		.forEach(i -> System.out.print(i+" "));
		//desc order 
		System.out.println("Sorted ints :desc ");
		Arrays.asList(10,1,23,45,56,789,-10)//List<Integer>
		.stream() //Stream<Integer> : src  : unsorted strm
		.sorted((i1,i2) -> i2.compareTo(i1))
		.forEach(System.out::println);
	
	}

}
