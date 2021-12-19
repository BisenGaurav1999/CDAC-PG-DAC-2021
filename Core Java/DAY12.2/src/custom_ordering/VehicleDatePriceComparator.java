package custom_ordering;

import java.util.Comparator;

import com.app.vehicles.Vehicle;

public class VehicleDatePriceComparator implements Comparator<Vehicle> {

	@Override
	public int compare(Vehicle o1, Vehicle o2) {
		System.out.println("in compare : date n price");
		int retVal = o1.getManufactureDate().compareTo(o2.getManufactureDate());
		if (retVal == 0)
			return ((Double) o1.getPrice()).compareTo(o2.getPrice());// invoker : prog has to explicitly typecasting ,
																		// arg : javac implicitly : auto boxing
		return retVal;
	}

}
