package tester;

import static utils.CollectionUtils.populateVehicleList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import com.app.vehicles.Vehicle;

public class TestIterator7 {

	public static void main(String[] args) {
		try {
			// get populated ArrayList<Vehicle> , filled with sample data from another
			// layer(class) : CollectionUtils
			ArrayList<Vehicle> vehicleList = populateVehicleList();
			System.out.println("orig list");
			for (Vehicle v : vehicleList)
				System.out.println(v);
			// display vehicle list in reverse order : ListIterator
			// attach ListIterator , after the last element.
			ListIterator<Vehicle> itr = vehicleList.listIterator(vehicleList.size());// index range : 0 ...size -1
			// listItr.next();
			System.out.println("Reversed list");
			while (itr.hasPrevious())
				System.out.println(itr.previous());
			System.out.println("list iterator class " + itr.getClass());// ArrayList$ListItr : inner class of Al which
																		// has imple ListIterator i/f

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over....");
	}

}
