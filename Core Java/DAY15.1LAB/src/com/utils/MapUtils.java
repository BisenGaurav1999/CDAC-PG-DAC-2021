package com.utils;

import static com.utils.LibraryValidation.validateAll;

import java.util.HashMap;

import com.library.BookLibrary;

import custom_exc.LibraryExcHandler;

public class MapUtils {
	public static HashMap<String, BookLibrary> populateMap() throws LibraryExcHandler {
		HashMap<String, BookLibrary> books = new HashMap<String,BookLibrary>();
		books.put("book1", validateAll("book1", 1200.0, "2021-12-01", "Author1",10,"history"));
		books.put("book2",validateAll("book2", 500.0, "2016-11-05", "Author2",2 , "action"));
		books.put("book3",validateAll("book3",  600.0,"2006-12-01", "Author3",3 , "childrens"));
		books.put("book4",validateAll("book4",  7000.0, "1998-01-29", "Author4",15 ,"comic"));
		books.put("book5",validateAll("book5", 1100.0, "2006-12-01", "Author5", 40,"fantasy"));
		return books;
	}
}
