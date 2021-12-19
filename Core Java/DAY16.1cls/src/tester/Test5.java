package tester;
import com.app.books.Book;
import static utils.CollectionUtils.*;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class Test5 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		/*
		 * 5. Sorting : custom ordering Use populated List of Books from
		 * CollectionUtils. Sort them as per books price , using custom ordering n
		 * lambda expression.
		 */
		List<Book> list = populateListFromMap(populateMap());
		System.out.println("orig list");
		list.forEach(b -> System.out.println(b));
		String s="hello";//s : string literal
		
		int data=12345;//int literal
		//function literal
		Comparator<Book> comp=(b1,b2) ->((Double)b1.getPrice()).compareTo(b2.getPrice());	
		Collections.sort(list,comp);
		System.out.println("sorted list");
		list.forEach(b -> System.out.println(b));
		//Can above lambda expression be concised into a method ref ? YES
		System.out.println("sorted list displayed  via method  ref.");
		list.forEach(System.out::println);
		
		
		//Collections.sort(list,comp).forEach(b -> System.out.println(b));  //not possible
		
		

	}

}
