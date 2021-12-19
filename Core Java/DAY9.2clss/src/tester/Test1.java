package tester;

import java.util.Date;

import com.app.vehicles.Vehicle;

import custom_exception.VehicleHandlingException;

import static utils.VehicleValidationRules.checkForDup;

public class Test1 {

	public static void main(String[] args) throws VehicleHandlingException{
		Vehicle v1 = new Vehicle(12345, "silver", 456789, new Date(), "petrol");
		Vehicle v2 = new Vehicle(12347, "silver", 456789, new Date(), "petrol");
	//	Vehicle v3 = new Vehicle(12346, "silver", 456789, new Date(), "petrol");
		Vehicle[] vehicles= {v1,v2};
		checkForDup(vehicles, 12340);
		
	}

}
