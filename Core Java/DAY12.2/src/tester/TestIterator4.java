package tester;

import static utils.CollectionUtils.populateVehicleList;

import java.util.ArrayList;
import java.util.Iterator;

import com.app.vehicles.Category;
import com.app.vehicles.Vehicle;

//remove all vehicles under Diesel category
public class TestIterator4 {

	public static void main(String[] args) {
		try {
			// get populated ArrayList<Vehicle> , filled with sample data from another
			// layer(class) : CollectionUtils
			ArrayList<Vehicle> vehicleList = populateVehicleList();
			System.out.println("Original list");
			for (Vehicle v : vehicleList)
				System.out.println(v);
			// attach an iterator .
			Iterator<Vehicle> vehicleItr = vehicleList.iterator();
			// itr --> before the 1st elem (index=-1)
			while (vehicleItr.hasNext()) {

				if (vehicleItr.next().getCategory() == Category.DIESEL)
					vehicleItr.remove();

			}
			System.out.println("Filtered list");
			for (Vehicle v : vehicleList)
				System.out.println(v);

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over....");
	}

}
