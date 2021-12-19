package com.tester;

import static com.utils.LibraryValidation.validateAll;
import static com.utils.MapUtils.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

import com.library.BookLibrary;
import com.library.Category;

import custom_exc.LibraryExcHandler;

public class Tester {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			HashMap<String, BookLibrary> books = populateMap();
			boolean flag = false;
			TreeMap<String, BookLibrary> sortedData;
			Iterator<BookLibrary> itr;
			while (!flag) {
				try {
					System.out.println("******************************");
					System.out.println("Choose an Option: ");
					System.out.println("1. Add New Book");
					System.out.println("2. Display All");
					System.out.println("3. Book Issue");
					System.out.println("4. Return a book");
					System.out.println("5. Remove a Book");
					System.out.println("6. delete by author and category");
					System.out.println("7. Books before specific date");
					System.out.println("8. sort books(title)");
					System.out.println("9. reverse sort books(title)");
					System.out.println("10. Sort books(date n price)");
					System.out.println("11. Remove all books published before a specific date");
					System.out.println("12. display book title along with complete book details");
					System.out.println("13. Sort List as per books price");
					System.out.println("404. Exit");
					System.out.println("******************************");

					switch (sc.nextInt()) {
					case 1:
						System.out.println(
								"Enter Book Details\nTitle, Price, PublishDate(yyyy-mm-dd), AuthorName, Quantity, BookCategory");

						String s = sc.next();
						int q;
						BookLibrary b = validateAll(s, sc.nextDouble(), sc.next(), sc.next(), q = sc.nextInt(),
								sc.next());
						if (!books.containsKey(s)) {
							books.put(b.getbTitle(), b);
							System.out.println("book has been added");
						} else {
							books.get(s).setQuantity(q);
						}
						break;
					case 2:
						
						System.out.println("The List of added books are: ");
						/* Collection<BookDetails> c = books.values(); */
						for (BookLibrary ele : books.values()) {
							System.out.println(ele);
						}
						break;
					case 3:
						
						System.out.println("Enter Book title");
						String title = sc.next();
						if (books.containsKey(title)) {
							BookLibrary b1 = books.get(title);
							if (b1.getQuantity() != 0) {
								b1.setQuantity(-1);
								System.out.println("book has been issued!!!");
							} else
								System.out.println("No books left!!!");
						} else
							throw new LibraryExcHandler("No Such book found In the library...");
						break;
					case 4:
						System.out.println("Enter Book title");
						String title1 = sc.next();
						if (books.containsKey(title1)) {
							books.get(title1).setQuantity(+1);
							System.out.println("Book Has Been returned...");
						} else
							throw new LibraryExcHandler("No such book issued with title " + title1);
						break;
						
					case 5:
						System.out.println("Enter Book title");
						String titleRemove = sc.next();
						if (books.containsKey(titleRemove)) {
							books.remove(titleRemove);
							System.out.println("Removed Successfully...");
						} else
							throw new LibraryExcHandler("No Such Book Found in Database!!!");
						break;
						
					case 6:
						System.out.println("Enter Author And Category of Book");
						itr = books.values().iterator();
						System.out.println("In Progress...");
						while (itr.hasNext()) {
							if (itr.next().getAuthorName().equals(sc.next())
									&& itr.next().getBookCat().equals(Category.valueOf(sc.next().toUpperCase()))) {
								itr.remove();
							}
						}
						break;
						
					case 7:
						System.out.println("Enter the date(yyyy-mm-dd)");
						
						LocalDate d = LocalDate.parse(sc.next());
						itr = books.values().iterator();
						while (itr.hasNext()) {
							BookLibrary tmp = itr.next();
							if (tmp.getPublishDate().isBefore(d)) {
								System.out.println(tmp.toString());
							}
						}

						break;
					case 8:	// sort books(title)
						System.out.println("Sorted Data(Title)");
						sortedData = new TreeMap<String, BookLibrary>(books);
						itr = sortedData.values().iterator();
						while (itr.hasNext())
							System.out.println(itr.next().toString());
						break;
						
					case 9: // Sort books in descending order of title using custom sorting using lambda
							// expression
						
						System.out.println("Reverse Sorted order (title)");
						// public TreeMap(Comparator<? super K> comparator)
						sortedData = new TreeMap<>((a1, a2) -> a2.compareTo(a1));
						sortedData.putAll(books); // public void putAll(Map<? extends K, ? extends V> map)
						itr = sortedData.values().iterator();
						while (itr.hasNext()) {
							System.out.println(itr.next());
						}
						break;
						
					case 10: // Sort books(date n price)
						ArrayList<BookLibrary> bkl = new ArrayList<BookLibrary>(books.values());
						/*
						 * Collections.sort(bkl, new Comparator<BookLibrary>() {
						 * 
						 * @Override public int compare(BookLibrary o1, BookLibrary o2) {
						 * if(o1.getPublishDate().compareTo(o2.getPublishDate())==0) return
						 * ((Double)o1.getPrice()).compareTo(o2.getPrice()); return
						 * o1.getPublishDate().compareTo(o2.getPublishDate()); }
						 * 
						 * });
						 */
						// Using Lambda exp.
						Collections.sort(bkl, (o1, o2) -> {
							if (o1.getPublishDate().compareTo(o2.getPublishDate()) == 0)
								return ((Double) o1.getPrice()).compareTo(o2.getPrice());
							return o1.getPublishDate().compareTo(o2.getPublishDate());
						});
						bkl.forEach(i-> System.out.println(i));
						break;
						
					case 11:	// Remove all books published before a specific date
						System.out.println("Enter the date");
						LocalDate d2 = LocalDate.parse(sc.next());
						List<BookLibrary> l_books = convertMapToList(books);
						
						l_books.removeIf(book->book.getPublishDate().isBefore(d2));
						
						System.out.println("Books after " + d2 +" :");
						l_books.forEach(i->System.out.println(i));
						
						break;
						
					case 12:	// display book title along with complete book details
						/*
						 * Set<String> titleString = books.keySet(); titleString.forEach(i ->
						 * System.out.println("Title is "+i+" details are "+books.get(i)));
						 */
						books.forEach((key,value)->System.out.println("title "+key+" \nDetails : "+value));
						break;
						
					case 13:	// Sort List as per books price
						l_books = convertMapToList(books);
						Collections.sort(l_books,(b1,b2)-> ((Double)b1.getPrice()).compareTo((double)b2.getPrice()));
						l_books.forEach(i-> System.out.println(i));
						break;
						
					case 404:
						flag = true;
						break;
						
					default:
						System.out.println("Invalid Entry...");
						break;
					}
				} catch (LibraryExcHandler e) {
					e.printStackTrace();
				}
				sc.nextLine();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
