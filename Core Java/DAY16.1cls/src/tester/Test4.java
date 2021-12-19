package tester;
import com.app.books.Book;
import static utils.CollectionUtils.*;

import java.util.Collections;
import java.util.List;
public class Test4 {

	public static void main(String[] args) {
		/*
		 * 5. Sorting : custom ordering Use populated List of Books from
		 * CollectionUtils. Sort them as per books price , using custom ordering n
		 * lambda expression.
		 */
		List<Book> list = populateListFromMap(populateMap());
		System.out.println("orig list");
		list.forEach(b -> System.out.println(b));
		//sorting
//		Collections.sort(list,new Comparator<Book>() {
//
//			@Override
//			public int compare(Book b1, Book b2) {
//				// TODO Auto-generated method stub
//				return ((Double)b1.getPrice()).compareTo(b2.getPrice());
//			}
//			
//		});
		Collections.sort(list,(b1,b2) ->((Double)b1.getPrice()).compareTo(b2.getPrice()));
		System.out.println("sorted list");
		list.forEach(b -> System.out.println(b));
		
		
		

	}

}
