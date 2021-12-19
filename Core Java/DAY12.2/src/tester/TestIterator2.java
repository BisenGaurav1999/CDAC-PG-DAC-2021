package tester;

import static utils.CollectionUtils.populateVehicleList;

import java.util.ArrayList;
import java.util.Iterator;

import com.app.vehicles.Vehicle;

public class TestIterator2 {

	public static void main(String[] args) {
		try {
			// get populated ArrayList<Vehicle> , filled with sample data from another
			// layer(class) : CollectionUtils
			ArrayList<Vehicle> vehicleList = populateVehicleList();
			//attach an iterator .
			Iterator<Vehicle> vehicleItr=vehicleList.iterator();
			while(vehicleItr.hasNext())
				System.out.println(vehicleItr.next());
			//vehicleItr ---> after the last elem
			System.out.println(vehicleItr.next());//NoSuchElementExc.
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over....");
	}

}
