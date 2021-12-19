package java8_strms;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Test7 {

	public static void main(String[] args) {
		// Display average of all odd nos between 1-100 .
		OptionalDouble optionalDouble = IntStream.rangeClosed(1, 100).
				filter(i -> i % 2 != 0).
				average();
		System.out.println(optionalDouble);
		if (optionalDouble.isPresent())
			System.out.println("Avg = " + optionalDouble.getAsDouble());
		else
			System.out.println("no avg!!!!!");
		System.out.println("trying to rpint an avg");
		//create IntStream of specific values
		 IntStream.of(10,20,30,40,50,64)
		.filter(i -> i % 2 != 0).
		average().
		ifPresent(a -> System.out.println(a));
		 //Optional : orElseThrow

	}

}
