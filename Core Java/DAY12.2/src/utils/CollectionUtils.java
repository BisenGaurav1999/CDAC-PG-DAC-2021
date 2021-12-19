package utils;

import java.text.ParseException;
import java.util.ArrayList;

import com.app.vehicles.Vehicle;

import custom_exception.VehicleHandlingException;

import static utils.VehicleValidationRules.*;
/*
 * sample data
12342 red 45678 2-6-2021 petrol
12343 white 45890 2-6-2021 petrol
12340 black 55678 2-6-2021 ev
12347 red 43679 2-6-2021 petrol
 */

public class CollectionUtils {
//add a static method to return populated AL<Vehicle> 
	public static ArrayList<Vehicle> populateVehicleList() throws ParseException, VehicleHandlingException {
		ArrayList<Vehicle> vehicles = new ArrayList<>();
		vehicles.add(new Vehicle(12342, "red", 45691, parseAndValidateDate("2-6-2021"), validateCategory("petrol")));
		vehicles.add(new Vehicle(12333, "black", 65678, parseAndValidateDate("2-7-2021"), validateCategory("ev")));
		vehicles.add(
				new Vehicle(12346, "white", 55678, parseAndValidateDate("12-10-2021"), validateCategory("petrol")));
		vehicles.add(new Vehicle(12348, "red", 45679, parseAndValidateDate("2-6-2021"), validateCategory("diesel")));
		vehicles.add(new Vehicle(12340, "white", 45699, parseAndValidateDate("2-6-2021"), validateCategory("petrol")));

		return vehicles;//rets populated AL to the caller
	}
}
