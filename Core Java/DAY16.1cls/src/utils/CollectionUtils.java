package utils;

import static com.app.books.Category.ROMANCE;
import static com.app.books.Category.SC_FI;
import static com.app.books.Category.TECHNOLOGY;
import static java.time.LocalDate.parse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.app.books.Book;

public interface CollectionUtils {
//add static method to populate map of sample books
	static HashMap<String, Book> populateMap() {
		HashMap<String, Book> books = new HashMap<>();
		// String title, Category category, double price, LocalDate publishDate, String
		// author, int quantity
		books.put("book1", new Book("book1", SC_FI, 500, parse("2010-01-01"), "abc", 10));
		books.put("book5", new Book("book5", ROMANCE, 400, parse("2010-01-01"), "abc1", 12));
		books.put("book3", new Book("book3", TECHNOLOGY, 550, parse("2011-01-01"), "abc2", 20));
		books.put("book2", new Book("book2", TECHNOLOGY, 480, parse("2009-11-01"), "abc2", 14));
		books.put("book8", new Book("book8", TECHNOLOGY, 520, parse("2008-11-21"), "abc2", 13));
		return books;

	}
	/*
	 * 3.1 Add a method in Collection utils(i/f) , to accept Map of books , copy
	 * it's references into the List. Return list to the caller.
	 */
	static List<Book> populateListFromMap(Map<String, Book> map)
	{
		return new ArrayList<>(map.values());
	}
}
