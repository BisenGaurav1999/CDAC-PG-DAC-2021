package utils;

import java.util.List;

public class GenericUtils {
	/*
	 * Write a method in GenericUtils class to Find max number from ANY List of any
	 * numbers (integer / float / double ...) n return it to the caller.
	 */
//	public static Integer findMax(List<Integer> numbers)
//	{
//		Integer max=numbers.get(0);
//		for(int i=1;i<numbers.size();i++)
//			if(numbers.get(i).compareTo(max) > 0)
//				max=numbers.get(i);
//		return max;
//			
//		
//	}
//	public static Number findMax(List<? extends Number & Comparable> numbers) //throw error because with ? muliple class cannot be extended/imple using '&'
//	{
//		Number max=numbers.get(0);
//		for(int i=1;i<numbers.size();i++)
//			if(numbers.get(i).compareTo(max) > 0)
//				max=numbers.get(i);
//		return max;
//			
//		
//	}
	// <T extends Number & Comparable<T>> => Any type T that extends from Number n imple Comparable
	public static <T extends Number & Comparable<T>> T findMax(List<T> numbers)
	{
		T max=numbers.get(0);
		for(int i=1;i<numbers.size();i++)
			if(numbers.get(i).compareTo(max) > 0)
				max=numbers.get(i);
		return max;
			
		
	}
	public static <T extends Comparable<T>> T findAnyMax(List<T> list)
	{
		T max=list.get(0);
		for(int i=1;i<list.size();i++)
			if(list.get(i).compareTo(max) > 0)
				max=list.get(i);
		return max;
			
		
	}
//	public static  ? findAnyMax(List<? extends Comparable<?>> list)
//	{
//		T max=list.get(0);
//		for(int i=1;i<list.size();i++)
//			if(list.get(i).compareTo(max) > 0)
//				max=list.get(i);
//		return max;
//			
//		
//	}
	
	public static void printList(List<?> list) {
		for (Object e : list)
			System.out.println(e);
  
	}
	
	//generic copy method , to copy List of sub type elems  to List of super type
	public static <T> void copy(List<? extends T>src ,List<? super T> dest)
	{
		for(T t : src)
			dest.add(t);
		
	}
	
}
