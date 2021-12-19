package tester;
import static utils.CollectionUtils.populateMap;

import java.util.HashMap;

import com.app.books.Book;

public class Test3 {

	public static void main(String[] args) {
		// get populated map
		HashMap<String, Book> map = populateMap();
		//Map i/f higher order func
		//public void forEach(BiConsumer<? super K , ? super V> action)
		//Func method of BiConsumer : public void accept(T t , U u)
		map.forEach((k,v)->System.out.println(k+" "+v));

	}

}
