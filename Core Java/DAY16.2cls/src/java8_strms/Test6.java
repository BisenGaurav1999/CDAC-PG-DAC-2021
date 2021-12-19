package java8_strms;

import static utils.CollectionUtils.populateData;

import java.util.List;
import java.util.Scanner;
import com.app.core.Category;
import com.app.core.Product;
/*
 * 4.5 Prompt user for category n discount.
Apply that discount on all products of specified category n print it.
 */

public class Test6 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// get list of products
			List<Product> list = populateData();
			System.out.println("Original list");
			list.forEach(p -> System.out.println(p));
			System.out.println("Enter category n discount");
			Category category = Category.valueOf(sc.next().toUpperCase());
			double discount = sc.nextDouble();
			System.out.println("Discounted products ");
			list.stream()//Stream<Product>
			.filter(p -> p.getProductCatgeory()==category) //Stream<Product> : filtered 
			.peek(p -> p.setPrice(p.getPrice()-discount)) //Stream<Product> : filtered n discounted
			.forEach(System.out::println);
			
		}

	}

}
