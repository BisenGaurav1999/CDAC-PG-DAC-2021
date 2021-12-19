package java8_strms;

import java.util.Arrays;

public class Test1 {

	public static void main(String[] args) {
		// 1.Create int[] ---> IntStream & display its contents.
		
		int[] data= {34,12,35,6,7,89,10,12};
		System.out.println("int[] --> Instream --> forEach : lambda ");
		Arrays.stream(data).//IntStream
		forEach(i -> System.out.println(i));
		System.out.println("int[] --> Instream --> forEach : meth ref ");
		Arrays.stream(data).//IntStream
		forEach(System.out::println);
		//IntStream : parallel operations : no support in Arrays BUT exists in Collection i/f
		//2.5 Convert it to parallel stream & display elems
		System.out.println("printing ints using parallel stream");
		Integer[] data2= {34,12,35,6,7,89,10,12};
		Arrays.asList(data2). //List<Integer>
		parallelStream(). //parallel Stream<Integer>
		forEach(System.out::println);
		
		
	}

}
 