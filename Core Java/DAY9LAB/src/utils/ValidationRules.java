package utils;

import custom_exception.CustomerHandlingException;

import java.text.ParseException;
import java.util.Date;

import com.app.core.Customer;
import com.app.core.CustomerType;

import static com.app.core.Customer.sdf;

public class ValidationRules {
	public static Date stdDob;
	static {
		try {
			stdDob = sdf.parse("1-1-1995");
		} catch (Exception e) {
			System.out.println("Error in static init." + e);
		}
	}

	public static void ValidateEmail(String newEmail, Customer[] costomers) throws CustomerHandlingException {
		Customer obj = new Customer(newEmail);
		for (Customer ele : costomers) {
			if (ele != null) {
				if (ele.equals(obj))
					throw new CustomerHandlingException("Dupli. Email Found,,,User Already Exist");
			}
		}
		if(newEmail.endsWith(".com")&&newEmail.contains("@")) {
		}else
			throw new CustomerHandlingException("Email format invalid");
		System.out.println("Valid Email");
	}
	public static void ValidatePassword(String newPassword) throws CustomerHandlingException{
		if(newPassword.length()<4 || newPassword.length()>10)
			throw new CustomerHandlingException("Password length Should be of 4-10");
	}
	public static Date DobValidation(String date) throws CustomerHandlingException, ParseException{
		Date d1 = sdf.parse(date);
		if(d1.after(stdDob))
			throw new CustomerHandlingException("DOB should be before 01-01-1995");
		return d1;
	}
	public static CustomerType ValidatePlan(String type) throws CustomerHandlingException {
		CustomerType c1;
		try {
			c1=CustomerType.valueOf(type.toUpperCase());
			return c1;

		} catch (IllegalArgumentException e) {
			throw new CustomerHandlingException("invalid customer plan");
		}
	}
	
	
	public static Customer ValidateAllInputs(String name, String email, String password, double registrationAmount, String dob, String type,Customer[] costomers) throws CustomerHandlingException, ParseException {
		ValidateEmail(email, costomers);
		ValidatePassword(password);
		Date d1=DobValidation(dob);
		CustomerType plan = ValidatePlan(type);
		return new Customer(name, email, password, registrationAmount, d1,plan);
	}
	
}
