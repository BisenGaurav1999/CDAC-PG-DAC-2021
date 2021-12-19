package com.tester;

import static com.utils.LibraryValidation.validateAll;

import java.util.HashMap;
import java.util.Scanner;

import com.library.BookLibrary;
import static com.utils.MapUtils.populateMap;
import custom_exc.LibraryExcHandler;

public class Tester {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			HashMap<String, BookLibrary> books = populateMap();
			boolean flag = false;

			while (!flag) {
				try {
					System.out.println("******************************");
					System.out.println("Choose an Option: ");
					System.out.println("1. Add New Book");
					System.out.println("2. Display All");
					System.out.println("3. Book Issue");
					System.out.println("4. Return a book");
					System.out.println("5. Remove a Book");
					System.out.println("100. Exit");
					System.out.println("******************************");

					switch (sc.nextInt()) {
					case 1:
						System.out.println(
								"Enter Book Details\nTitle, Price, PublishDate(yyyy-mm-dd), AuthorName, Quantity, BookCategory");
						
						String s = sc.next();
						int q;
						BookLibrary b = validateAll(s, sc.nextDouble(), sc.next(), sc.next(), q=sc.nextInt(),
								sc.next());
						if (!books.containsKey(s)) {
							books.put(b.getbTitle(), b);
							System.out.println("book has been added");
						}else {
							books.get(s).setQuantity(q);
						}
						break;
					case 2:
						System.out.println("The List of added books are: ");
						for (BookLibrary ele : books.values()) {
							System.out.println(ele);
						}
						break;
					case 3:
						System.out.println("Enter Book title");
						String title = sc.next();
						if(books.containsKey(title)) {
							BookLibrary b1 = books.get(title);
							if(b1.getQuantity()!=0) {
								b1.setQuantity(-1);
								System.out.println("book has been issued!!!");
							}else
								System.out.println("No books left!!!");
						}else
							throw new LibraryExcHandler("No Such book found In the library...");
						break;
					case 4:
						System.out.println("Enter Book title");
						String title1 = sc.next();
						if(books.containsKey(title1)) {
							books.get(title1).setQuantity(+1);
							System.out.println("Book Has Been returned...");
						}else 
							throw new LibraryExcHandler("No such book issued with title "+title1);
							
						break;
					case 5:
						System.out.println("Enter Book title");
						String titleRemove = sc.next();
						if(books.containsKey(titleRemove)) {
							books.remove(titleRemove);
							System.out.println("Removed Successfully...");
						}else
							throw new LibraryExcHandler("No Such Book Found in Database!!!");
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
				}sc.nextLine();
			}

		}catch (Exception e) {
			e.printStackTrace();
		} 
	}
}
