package java8_strms;

import java.util.stream.IntStream;

public class Test2 {

	public static void main(String[] args) {
		// Create stream of ints between 1-100 & display all even elements.
		IntStream.range(1, 101)//IntStream 1-100
		.filter(i -> i % 2 == 0)//IntStream 2,4,6,98,100
		.forEach(System.out::println);
		
					/*OR 
					 using rangeclosed
					 */
		
		IntStream.rangeClosed(1, 100).
		forEach(i->{if(i%2==0)
			System.out.println(i);
		});
	}

}
