package tester;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import com.app.books.Book;
import static utils.CollectionUtils.*;

public class Test2 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			// get populated list
			List<Book> books = populateListFromMap(populateMap());
			System.out.println("Orig list");
			// replace it by declarative / functional style of prog : internal iteration :
			// forEach(Consumer<? super T> action)
			// Consumer : func i/f --SAM : func method -- public void accept(T t)
			books.forEach(b -> System.out.println(b));
			// remove all books published before a specific date.
			// Collection i/f : higher order func : public boolean removeIf(Predicate<?
			// super T> filter)
			// Predicate : func i/f
			// func method(SAM) : public boolean test(T t)
			System.out.println("Enter date : yr-mon-day");
			LocalDate date=LocalDate.parse(sc.next());
			books.removeIf(b -> b.getPublishDate().isBefore(date));
			System.out.println("list after remove");
			books.forEach(b -> System.out.println(b));
		}

	}

}
