package tester;

import static utils.GenericUtils.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Vector;

public class Test1 {
//<T extends Number & Comparable<T>>
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		List<Integer> l3 = Arrays.asList(12, 34, 11, 78, 75);
		System.out.println(findMax(l3));
		Vector<Integer> l4 = new Vector<>(Arrays.asList(12, 34, 11, 78, 75));
		System.out.println(findMax(l4));
		Byte[] bytes = { 100, 27, 39, 40, 50 };// array of refs , byte ---> Byte : auto boxing done by javac
		List<Byte> l1 = Arrays.asList(bytes);
		System.out.println(findMax(l1));
		List<Double> l2 = Arrays.asList(10.5, 2.5, 3.78, 54.9, 59.1);
		System.out.println(findMax(l2));
		// findMax : AL<String>
		// Can you write another findAnyMax method : to return max value of any type
		// (Number, String , Date , Emp.....)
		List<String> names = Arrays.asList("one", "two", "three", "four", "five");
		System.out.println(findAnyMax(names));// expected o/p : two
		List<Date> dates = Arrays.asList(sdf.parse("1-2-2020"), sdf.parse("14-5-2010"), sdf.parse("1-12-2020"),
				sdf.parse("31-12-2020"));
		System.out.println(sdf.format(findAnyMax(dates)));// expected o/p :31-12-2020
	}

}
