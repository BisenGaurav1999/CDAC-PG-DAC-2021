package tester;

import java.util.Scanner;
import static utils.ValidationRules.ValidateAllInputs;
import com.app.core.Customer;
import static utils.ValidationRules.LoginValidation;
import static utils.ValidationRules.LinkAdharloc;

public class Tester1 {
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Customer capacity");
			Customer[] cust = new Customer[sc.nextInt()];
			int counter = 0;
			boolean exit = false;
			while (!exit) {
				System.out.println("*******************************");
				System.out.println("\tWelecome to the System");
				System.out.println("1. Add Customer ");
				System.out.println("2. Display details of all registered customers");
				System.out.println("3. Login");
				System.out.println("4. Link Your Aadhar");
				System.out.println("5. Exit");
				System.out.println("*******************************");
				try {
					switch (sc.nextInt()) {
					case 1:
						if(counter<cust.length) {
							System.out.println(
									"Enter Customer Details :\n Name,  Email, Password, RegistrationAmount, DOB, CustomerPlan");
							cust[counter++] = ValidateAllInputs(sc.next(), sc.next(), sc.next(), sc.nextDouble(), sc.next(),
									sc.next(), cust);
						}else
							System.out.println("Customer size is full!!");

						break;
					case 2:
						for (Customer ele : cust) {
							if (ele != null) {
								System.out.println(ele);
							}
						}
						break;
					case 3:
							System.out.println("*******************************");
							System.out.println("\tWelcome to Login Page");
							System.out.println("Enter Login id : \nPassword       :");
							LoginValidation(sc.next(),sc.next(),cust);
						break;
					case 4:
						System.out.println("Enter Email Id");
						LinkAdharloc(sc.next(), cust, sc);
						break;

					default:
						System.out.println("Invalid Input");
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
