package utils;

import static com.app.banking.AccountType.SAVING;
import static com.app.banking.AccountType.LOAN;
import java.time.LocalDate;
import java.util.HashMap;

import com.app.banking.BankAccount;

import custom_exception.BankingException;

public class CollectionUtils {
//add static method for populating map with sample data
	public static HashMap<Integer, BankAccount> populateMap(){
		HashMap<Integer, BankAccount> map = new HashMap<>();
		System.out.println(map.put(101, new BankAccount(101, SAVING, 11000, LocalDate.parse("2020-01-01"), "Rama")));
		System.out.println(map.put(102, new BankAccount(102, LOAN, 2000, LocalDate.parse("2020-01-01"), "Rama")));
		System.out.println(map.put(103, new BankAccount(103, SAVING, 500, LocalDate.parse("2020-01-01"), "Rama")));
		System.out.println(map.put(104, new BankAccount(104, LOAN, 15000, LocalDate.parse("2020-01-01"), "Rama")));
		System.out.println(map.put(105, new BankAccount(105, SAVING, 50000, LocalDate.parse("2020-01-01"), "Rama")));
		return map;
	}
	// add static method to accept a/c no n return a/c ref in case of success o.w
		// throw exc.
		public static BankAccount findByAccountNo(int acctNo, HashMap<Integer, BankAccount> map) throws BankingException {
			BankAccount a = map.get(acctNo);
			if (a == null)
				throw new BankingException("Invalid acct no !!!!");
			return a;
		}

}
