package tester;
import java.util.List;

import com.app.books.Book;
import static utils.CollectionUtils.*;


public class Test1 {

	public static void main(String[] args) {
		
		//get populated list
		List<Book> books=populateListFromMap(populateMap());
		/*
		 * Write a tester to display books from the list.
		 */
		//imperative style : WHAT n HOW
		for(Book b : books)
			System.out.println(b);
		//replace it by declarative / functional style of prog : internal iteration : forEach(Consumer<? super T> action)
		//Consumer : func i/f --SAM : func method -- public void accept(T t)
		books.forEach(b -> System.out.println(b));
		

	}

}
