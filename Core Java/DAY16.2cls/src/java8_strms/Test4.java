package java8_strms;

import java.util.List;
import java.util.Scanner;

import com.app.core.Category;
import com.app.core.Product;

import static utils.CollectionUtils.populateData;
/*
 * 4. Display all product names of a particular category , exceeding specific price.
I/P category name & price.
(stream,filters,forEach)
eg : productList : List<Product>
 */

public class Test4 {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in))
		{
			//get list of products
			List<Product> list = populateData();
			System.out.println("Original list");
			list.forEach(p -> System.out.println(p));
			System.out.println("Enter category n price");
			Category category=Category.valueOf(sc.next().toUpperCase());
			double price=sc.nextDouble();
			list //List<Product>
			.stream()  //Stream<Product> : all products
			.filter(p -> p.getProductCatgeory() == category) //filtered strm : as per category
			.filter(p -> p.getPrice()>price) //filtered strm : as per price
			.forEach(p -> System.out.println(p.getName())); //terminal op.
			System.out.println("list again ");
			list.forEach(p -> System.out.println(p));
			
			System.out.println("Enter price");
			populateData().stream().
			filter(i->i.getProductCatgeory()== category).
			filter(j->j.getPrice()>sc.nextDouble()).
			forEach(k->System.out.println(k.getName()));
		}

	}

}
