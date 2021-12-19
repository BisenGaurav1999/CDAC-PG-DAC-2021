package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;
import static utils.GenericUtils.copy;

public class Test2 {

	public static void main(String[] args) {
		ArrayList<Worker> workers = new ArrayList<>(
				Arrays.asList(new Worker(5000), new TempWorker(3000), new Worker(2000)));
		System.out.println(workers);
		Vector<Emp> emps = new Vector<>();
		copy(workers, emps);// src ---> dest
		System.out.println(emps);
		// Should you be able to copy from  List of type Emp or its sub type (i.e Mgr /
		// Worker...) to List of Emp type or it's super type ? YES !
		//src :? extends T 
		// dest : ? super T

	}

}
