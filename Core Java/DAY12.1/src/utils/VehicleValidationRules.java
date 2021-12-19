package utils;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

import com.app.vehicles.Category;
import com.app.vehicles.Vehicle;

import custom_exception.VehicleHandlingException;
import static com.app.vehicles.Vehicle.sdf;

public class VehicleValidationRules {
	public static Date startDate, endDate;
	static {
		try {
			startDate = sdf.parse("1-4-2021");
			endDate = sdf.parse("31-3-2022");
		} catch (ParseException e) {
			System.out.println("err in static init block " + e);
		}
	}

//add public static method to chk for dup chasis no
	public static void checkForDup(ArrayList<Vehicle> vehicles, int newChasisNo)// pass by value i.e a copy is made
			throws VehicleHandlingException {
		Vehicle newVehicle = new Vehicle(newChasisNo);
//		for (Vehicle v : vehicles)// uses Iterator internally 
//			if (v != null)
//				if (v.equals(newVehicle))// int ---> Integer ---> Object
//					// =>dup detected --> throw cust exc
//					throw new VehicleHandlingException("Dup chasis no detected!!!!!");
//		// =>no dups
//		System.out.println("no dup detected!!!!");
		if(vehicles.contains(newVehicle))
			throw new VehicleHandlingException("Dup Chasis No Found!!!!!");
		
	}

	// add public static method for category validation
	public static Category validateCategory(String category)  {
		return Category.valueOf(category.toUpperCase());//if user supplies unknown category : JVM will throw
		//java.lang.IllegalArgumentExc : un chked exc.
	}

	// add static method :to validate manufactureDate : in this financial year (1st
	// Apr 2021 to 31Mar 2022)
	public static Date parseAndValidateDate(String date) throws ParseException, VehicleHandlingException {
		// parsing
		Date d1 = sdf.parse(date);
		// => parsing success , proceed to validation
		if (d1.before(startDate) || d1.after(endDate)) // => err
			throw new VehicleHandlingException("Invalid date!!!!!");
		// => validations success
		return d1;
	}

	// add static method to invoke all validation rules n throw exc in case of
	// failures or ret Vehicle instance to the caller
	public static Vehicle validateAllInputs(int chasisNo, String color, double price, String manufactureDate,
			String category, ArrayList<Vehicle> showroom) throws VehicleHandlingException, ParseException {
		checkForDup(showroom, chasisNo);
		Date d1 = parseAndValidateDate(manufactureDate);
		Category validatedCategory = validateCategory(category);
		// => all i/ps are valid
		return new Vehicle(chasisNo, color, price, d1, validatedCategory);
	}
	//add a static method to check if vehicle exists by chasis no : finder method : findByChasisNo
	//Hint : indexOf , get
	public static Vehicle findByChasisNo(int chasisNo, ArrayList<Vehicle> vehicles) throws VehicleHandlingException
	{
		Vehicle v1=new Vehicle(chasisNo);
//		for(Vehicle v : vehicles)
//			if (v != null )
//				if(v.equals(v1)) //=> found : int --->Integer --> Object
//					return v;
//		//=> vehicle not found
//		throw new VehicleHandlingException("Invalid chasis no!!!!!");	
		int index=vehicles.indexOf(v1);//O(n) : time complexity
		if(index == -1)
			throw new VehicleHandlingException("Invalid chasis no!!!!!");
		return vehicles.get(index);//O(1)
			
	}

}
