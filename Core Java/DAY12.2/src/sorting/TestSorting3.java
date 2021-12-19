package sorting;

import static utils.CollectionUtils.populateVehicleList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import com.app.vehicles.Vehicle;

import custom_ordering.VehicleDatePriceComparator;
import custom_ordering.VehiclePriceDescComparator;

//Print vehicle details , sorted as per asc chasis no.
public class TestSorting3 {

	public static void main(String[] args) {
		try {
			// get populated ArrayList<Vehicle> , filled with sample data from another
			// layer(class) : CollectionUtils
			ArrayList<Vehicle> vehicleList = populateVehicleList();
			//display ordered list
			System.out.println("Ordered list");
			for(Vehicle v : vehicleList)
				System.out.println(v);
			//api of Collections class
			//public static void sort(List<T> list,Comparator<T> comp)			
			Collections.sort(vehicleList,new VehicleDatePriceComparator());
			//sort(...) will implicitly call  VehicleDatePriceComparator's compare. 
			//custom ordering
			System.out.println("Vehicle list sorted as per price (desc)");
			for(Vehicle v : vehicleList)
				System.out.println(v);

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over....");
	}

}
