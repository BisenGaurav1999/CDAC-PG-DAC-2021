package com.tester;

import static com.utils.LibraryValidation.validateAll;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.library.BookLibrary;

import custom_exc.LibraryExcHandler;

public class Tester {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			HashSet<BookLibrary> books = new HashSet<BookLibrary>();
			boolean flag = false;

			while (!flag) {
				try {
					System.out.println("******************************");
					System.out.println("1. Add Book");
					System.out.println("100. Exit");
					System.out.println("******************************");

					switch (sc.nextInt()) {
					case 1:
						System.out.println(
								"Enter Book Details\nTitle, Price, PublishDate(yyyy-mm-dd), AuthorName, Quantity, BookCategory");
						BookLibrary b = validateAll(sc.next(), sc.nextDouble(), sc.next(), sc.next(), sc.nextInt(),
								sc.next());
						if (books.add(b))
							System.out.println("Book has been Added...");
						break;
					case 100:
						flag = true;
						break;
					default:
						System.out.println("Invalid Entry...");
						break;
					}
				} catch (LibraryExcHandler e) {
					e.printStackTrace();
				}
			}

		} 
	}
}
