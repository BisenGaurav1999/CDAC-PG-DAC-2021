package sorting;

import java.util.ArrayList;
import java.util.Collections;

public class StringListSorting {

	public static void main(String[] args) {
		String[] names= {"Rutuj","Anish","Riya","Ankit","Sameer","Mihir","Rama","Tanvee"};
		//create AL<String> populated with above names.
		ArrayList<String> list=new ArrayList<>();
		for(String s : names)
			list.add(s);
		System.out.println("orig list "+list);
		//java.util.Collections : class , helper class , static methods --sorting
		//Method of Collections class : public static void sort(List<T> list)
		Collections.sort(list);
		System.out.println("sorted list "+list);
		
		
		

	}

}
