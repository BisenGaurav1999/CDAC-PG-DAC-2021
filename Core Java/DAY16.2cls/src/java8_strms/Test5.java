package java8_strms;

import static utils.CollectionUtils.populateData;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.app.core.Category;
import com.app.core.Product;
/*
 * 4. Collect all products of a particular category , exceeding specific price in yet another list
I/P category name & price.
(stream,filters,forEach)
eg : productList : List<Product>
 */

public class Test5 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// get list of products
			List<Product> list = populateData();
			System.out.println("Original list");
			list.forEach(p -> System.out.println(p));
			System.out.println("Enter category n price");
			Category category = Category.valueOf(sc.next().toUpperCase());
			System.out.println("peek o/p ");
			double price = sc.nextDouble();
			List<Product> collectedList = list // List<Product>
					.stream() // Stream<Product> : all products
					.filter(p -> p.getProductCatgeory() == category) // filtered strm : as per category
					.filter(p -> p.getPrice() > price) // filtered strm : as per price
					.peek(System.out::println)
					.collect(Collectors.toList());
			System.out.println("orig list again ");
			list.forEach(p -> System.out.println(p));
			System.out.println("filtered list ");
			collectedList.forEach(p -> System.out.println(p));
			

		}

	}

}
