package com.utils;

import java.time.LocalDate;

import com.library.BookLibrary;
import com.library.Category;

import custom_exc.LibraryExcHandler;

public class LibraryValidation {
	public static Category validateCategory(String cat) throws LibraryExcHandler {
		try {
			Category c = Category.valueOf(cat.toUpperCase());
			return c;
		} catch (IllegalArgumentException e) {
			throw new LibraryExcHandler("Invalid category Type");
		}
	}
	
	
	
	public static BookLibrary validateAll(String title, double price, String publishDate, String authorName, int quantity,
			String bookCat) throws LibraryExcHandler {
		Category category = validateCategory(bookCat);
		LocalDate date = LocalDate.parse(publishDate);
		return new BookLibrary(title, price, date, authorName, quantity, category);
	}
}
