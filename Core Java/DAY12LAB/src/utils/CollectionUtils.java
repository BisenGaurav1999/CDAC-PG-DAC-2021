package utils;

import java.text.ParseException;
import java.util.ArrayList;
import static utils.ValidationRules.*;
import com.app.cms.Customer;
import com.app.cms.CustomerType;

import custom_exception.CustomerHandlingException;

public class CollectionUtils {
	public static ArrayList<Customer> populateList() throws ParseException, CustomerHandlingException {
		ArrayList<Customer> list = new ArrayList<>();
		list.add( new Customer("Rama", "rama@gmail.com","12345",CustomerType.SILVER,validateDob("01/01/1990"),500));
		list.add( new Customer("Vija", "vija@gmail.com","12345",CustomerType.GOLD,validateDob("01/01/1991"),1000));
		list.add( new Customer("Chandra", "chandra@gmail.com","12345",CustomerType.DIAMOND,validateDob("01/01/1940"),1500));
		list.add( new Customer("Kamal", "kamal@gmail.com","12345",CustomerType.PLATINUM,validateDob("01/01/1987"),2000));
		list.add( new Customer("Roshan", "roshan@gmail.com","12345",CustomerType.SILVER,validateDob("01/01/1926"),500));
		list.add( new Customer("Manas", "manas@gmail.com","12345",CustomerType.GOLD,validateDob("01/01/1970"),1000));
		list.add( new Customer("Kaushal", "kaushal@gmail.com","12345",CustomerType.DIAMOND,validateDob("01/01/1943"),1500));
		list.add( new Customer("Vikas", "vikas@gmail.com","12345",CustomerType.PLATINUM,validateDob("01/01/1990"),2000));
		return list;
	}

}
