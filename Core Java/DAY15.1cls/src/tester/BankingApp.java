package tester;

import static utils.CollectionUtils.findByAccountNo;
import static utils.CollectionUtils.populateMap;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import static com.app.banking.AccountType.valueOf;

import com.app.banking.AccountType;
import com.app.banking.BankAccount;

import custom_exception.BankingException;

public class BankingApp {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// init phase
			// create suitable D.S
			HashMap<Integer, BankAccount> accounts = populateMap();
			boolean flag = false;
			while (!flag) {
				System.out.println("\tOptions \n1. Create A/C\n2. Display\n3. Get A/C Summary\n4. Fund Transfer\n5. Close A/C\n6. Display A/c category Wise\n7. Search acount by balance\n8. Remove all Loan A/C\n100. Exit\n");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println(
								"Enter Account details : A/C no., Account Type, Balance, DateOfCreation, CustomerName");
						int acNo = sc.nextInt();
						if (!accounts.containsKey(acNo)) {
							accounts.put(acNo, new BankAccount(acNo, valueOf(sc.next().toUpperCase()), sc.nextDouble(),
									LocalDate.parse(sc.next()), sc.next()));
							System.out.println("Account created");
						} else
							throw new BankingException("Account No already exist!!!");
						break;
					case 2:
						System.out.println("All A/C details");
						for (BankAccount a : accounts.values()) {
							System.out.println(a);
						}
						break;
					case 3:
						System.out.println("Enter Account no");
						System.out.println(findByAccountNo(sc.nextInt(), accounts));
						 
						break;
					case 4:
						System.out.println("Enter SRC , DEST A/C number And Amount");
						BankAccount src = findByAccountNo(sc.nextInt(), accounts);
						BankAccount dest = findByAccountNo(sc.nextInt(), accounts);
						//src n dest a/c exist
						src.transferFunds(dest, sc.nextDouble());
						break;
					case 5:
						System.out.println("Enter A/C number");
						int ac = sc.nextInt();
						if(accounts.remove(ac)==null)
							throw new BankingException("Account closing Failed: Invalid A/C no!!!");
						System.out.println("A/C number "+ac+" removed Successfully");
						break;
					case 6:
						System.out.println("Enter Account Type");
						AccountType acType =valueOf(sc.next().toUpperCase());
						System.out.println("Acc of Type "+acType);
						for (BankAccount a : accounts.values()) {
							if(a.getAcType()==acType)
								System.out.println(a);
						} 
						break;
					case 7:
						System.out.println("Enter min balance");
						int minBal = sc.nextInt();
						System.out.println("Acc with min balance "+minBal);
						for (BankAccount a : accounts.values()) {
							if(a.getBalance()>minBal)
								System.out.println(a);
						} 
						break;
					case 8:
						/*"***************************************"*/
						Iterator<BankAccount> itr = accounts.values().iterator();
						System.out.println("Removing loan acc");
						/*
						 * for(BankAccount a : collection) if(a.getAcType()==AccountType.LOAN)
						 * collection.remove(a);
						 */
						while(itr.hasNext()) {
							if(itr.next().getAcType()==AccountType.LOAN) {
								itr.remove();
							}
						}
						/*"***************************************"*/
						System.out.println("Wipe data Successfull");
						break;
					case 100:
						flag = true;
						break;
					default:

						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				sc.nextLine();
			}

		}
	}
}
