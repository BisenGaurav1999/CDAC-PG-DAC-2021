package utils;

import static com.app.cms.Customer.sdf;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import com.app.cms.Customer;
import com.app.cms.CustomerType;

import custom_exception.CustomerHandlingException;

public class ValidationRules {

	private static Date START_DATE;
	static {
		try {
			START_DATE = sdf.parse("01/01/1995");
		} catch (ParseException e) {
			System.out.println("Incorrect parsing of date in static block.");
			e.printStackTrace();
		}
	}

	public static void validateEmail(String email) throws CustomerHandlingException {
		if (!email.matches("\\w+@[a-z]+\\.com$"))
			throw new CustomerHandlingException("Email must contain @ and should be from .com domain.");
	}

	public static void validatePassword(String password) throws CustomerHandlingException {
		if (password.length() < 4 || password.length() > 10)
			throw new CustomerHandlingException("Password must be minimum 4 characters and maximum 10 characters.");
	}

	public static Date validateDob(String dob) throws ParseException, CustomerHandlingException {
		Date birthdate = sdf.parse(dob);
		if (birthdate.after(START_DATE))
			throw new CustomerHandlingException("Date of Birth should be before 1st Jan 1995.");
		return birthdate;
	}

	public static CustomerType validateType(String type) throws CustomerHandlingException {
		CustomerType t;
		try {
			t = CustomerType.valueOf(type.toUpperCase());
			return t;
		} catch (IllegalArgumentException e) {
			throw new CustomerHandlingException("Customer Type should be : " + Arrays.toString(CustomerType.values()));
		}
	}

	public static void validateCustomerDetailsDuplicate(String email, ArrayList<Customer> customers)
			throws CustomerHandlingException {

		Customer c1 = new Customer(email);
		if(customers.contains(c1)) throw new CustomerHandlingException("Duplicate Entry found!!");

	}

	public static void validateRegAmount(double registrationAmount, CustomerType cust)
			throws CustomerHandlingException {
		if (cust.getRegAmount() != registrationAmount)
			throw new CustomerHandlingException("Invalid Registration Amount submitted.For " + cust.name()
					+ " membership " + cust.getRegAmount() + " should be submitted.");
	}

	public static Customer validateAll(String name, String email, String password, String type, String dob,
			double registrationAmount, ArrayList<Customer> customers) throws CustomerHandlingException, ParseException {
		validateEmail(email);
		validatePassword(password);
		Date birthdate = validateDob(dob);
		CustomerType cust = validateType(type);
		validateCustomerDetailsDuplicate(email, customers);
		validateRegAmount(registrationAmount, cust);
		return new Customer(name, email, password, cust, birthdate, registrationAmount);
	}

	public static Customer findCustomerAndCheckPassword(String e1, String password, ArrayList<Customer> customers)
			throws CustomerHandlingException {
		validateEmail(e1);
		Customer c1 = new Customer(e1);
		int index = customers.indexOf(c1);
		if(index==-1) throw new CustomerHandlingException("Invalid Username(email).....Retry Login.");
		else if(password.equals(customers.get(index).getPassword())) 
			{
			System.out.println("Login Success!!");
			return customers.get(index);
			}
		else throw new CustomerHandlingException("Password does not match.....Retry Login.");
	}
	
	public static Customer findEmail(String e1,ArrayList<Customer> customers)
			throws CustomerHandlingException {
		validateEmail(e1);
		Customer c1 = new Customer(e1);
		int index= customers.indexOf(c1);
		if(index == -1) throw new CustomerHandlingException("Invalid Email.....Retry.");
		return customers.get(index);
	}

}
