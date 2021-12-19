package sorting;

import static utils.CollectionUtils.populateVehicleList;

import java.util.ArrayList;
import java.util.Collections;

import com.app.vehicles.Vehicle;

//Print vehicle details , sorted as per asc chasis no.
public class TestSorting1 {

	public static void main(String[] args) {
		try {
			// get populated ArrayList<Vehicle> , filled with sample data from another
			// layer(class) : CollectionUtils
			ArrayList<Vehicle> vehicleList = populateVehicleList();
			//display ordered list
			System.out.println("UNOrdered list");
			for(Vehicle v : vehicleList)
				System.out.println(v);
			Collections.sort(vehicleList);//earlier : javac err : since Vehicle IS NOT Comparable!
			System.out.println("Vehicle list sorted as per chasis no (asc)");
			for(Vehicle v : vehicleList)
				System.out.println(v);

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over....");
	}

}
