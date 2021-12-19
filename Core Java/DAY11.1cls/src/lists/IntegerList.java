package lists;

import java.util.ArrayList;
import java.util.Scanner;

public class IntegerList {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// create sample data : int[]
			int[] data = { 10, 20, 1, 23, 56, -10, 10, 20, 33, 567, 10 };
			// create empty AL to store Integer type of refs , with def init capa =10
			ArrayList<Integer> list = new ArrayList<>();// size=0 capa=10
			// populate AL from array data.
			for (int i : data)// i=data[0]......i=data[data.length-1]
				list.add(i);// i : int ----> Integer : javac : auto boxing
			// display elems from the AL
			System.out.println("AL via toString " + list);// AL's toString
			// Can you attach for-loop to any List ? YES
			System.out.println("AL using for-loop");
			for (int i = 0; i < list.size(); i++)
				System.out.println(list.get(i));
			// Can you attach for-each loop to any List ? YES
			System.out.println("AL using for-each loop");
			for (int i : list)// Integer --->int : auto unboxing
				System.out.println(i);
			// print "Exists" or "Doesn't Exist" : if user supplied elem is found
			System.out.println("Enter a number to search");
			System.out.println(list.contains(sc.nextInt())?"Exists":"Does Not Exist");
			//display index of 1st occurrence n last occurrence of the user specified elem
			System.out.println("Enter a number to find first n last occurrence");
			int data1=sc.nextInt();
			System.out.println("First "+list.indexOf(data1)+" Last "+list.lastIndexOf(data1));
			System.out.println("Enter index of element to remove");
			System.out.println("Removed elem "+list.remove(sc.nextInt()));
			System.out.println("AL after remove " + list);// AL's toString
			//double all elems in the list , having values  > 25
			for(int i=0;i<list.size();i++)
				if(list.get(i) > 25)
					System.out.println("Replaced "+list.set(i, list.get(i)*2));
			System.out.println("List after set "+list);
			//create another AL having same elements as this list. : ArrayList<E> (Collection<E> coll)
			ArrayList<Integer> list2=new ArrayList<Integer>(list);//copy of refs
			System.out.println("list2 "+list2);
			list2.remove(0);
			System.out.println(list2);
			System.out.println(list);
			
			
			
		}

	}

}
