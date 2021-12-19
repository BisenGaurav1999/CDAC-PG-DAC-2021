package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Test5 {

	public static void main(String[] args) {
		ArrayList<Worker> workers = new ArrayList<>(
				Arrays.asList(new Worker(5000), new TempWorker(3000), new Worker(2000)));
		//sort workers as per their basic salary w/o modifying Emp hierarchy : Custom ordering
		Collections.sort(workers,new Comparator<Worker>() {

			@Override
			public int compare(Worker o1, Worker o2) {
				// TODO Auto-generated method stub
				return ((Double)o1.getBasic()).compareTo(o2.getBasic());
			}
			
		} );
		for(Worker w : workers)
			System.out.println(w.getBasic());

	}

}
