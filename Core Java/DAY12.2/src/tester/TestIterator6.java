package tester;

import static utils.CollectionUtils.populateVehicleList;

import java.util.ArrayList;
import java.util.Iterator;

import com.app.vehicles.Category;
import com.app.vehicles.Vehicle;

//remove all vehicles under Diesel category : PENDING!!!!!!!!!!!!!!!!!
public class TestIterator6 {

	public static void main(String[] args) {
		try {
			// get populated ArrayList<Vehicle> , filled with sample data from another
			// layer(class) : CollectionUtils
			ArrayList<Vehicle> vehicleList = populateVehicleList();
			System.out.println("Original list");
			for (Vehicle v : vehicleList)
				System.out.println(v);
			// attach an iterator .
			Iterator<Vehicle> vehicleItr = vehicleList.iterator();//itr ---> before the 0th elem , ^elem0^elem1^elem2.....
			vehicleList.remove(0);
		//	vehicleList.add(new Vehicle(...));
			// itr --> before the 1st elem (index=-1)
			while (vehicleItr.hasNext()) {

				System.out.println(vehicleItr.next());//ConcuurentModificationExc : fail-fast behavior of the iterators

			}
			
		

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over....");
	}

}
