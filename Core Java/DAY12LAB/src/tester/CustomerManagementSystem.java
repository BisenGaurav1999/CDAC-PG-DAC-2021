package tester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;
import com.app.cms.Customer;
import com.app.cms.CustomerType;

import custom_exception.CustomerHandlingException;
import custom_ordering.CustomerDobDescComparator;
import custom_ordering.CustomerDobPlanComparator;

import static utils.ValidationRules.*;
import static utils.CollectionUtils.populateList;

public class CustomerManagementSystem {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			ArrayList<Customer> customers = populateList();
			boolean exit = false;
			do {
				System.out.println("");
				System.out.println("**************************************");
				System.out.println("Enter a choice from the following: \n");
				System.out.println("1) Customer Registration ");
				System.out.println("2) Customer Login");
				System.out.println("3) Link Aadhar Card");
				System.out.println("4) Change Password");
				System.out.println("5) Upgrade all senior citizens with Diamond plan to Platinum");
				System.out.println("6) Remove all customers under Silver plan");
				System.out.println("7) Sort customer details as per email(desc)"); // using natural sorting order
				System.out.println("8) Sort customer details as per Dob(desc)"); // using custom sorting order using
																					// separate class
				System.out.println("9) Sort customer details as per Dob(desc) and Plan(customer type)"); 
				// using custom	sorting	order using	anonymous inner	class																		// 																							
				System.out.println("10) Exit");
				System.out.println("**************************************");
				try {

					switch (sc.nextInt()) {

					case 1:// Customer Registration

						System.out.println(
								"Enter Customer details: Name, Email, Password,Customer Type, Date of Birth(dd/MM/yyyy),Registration Amount \n");
						Customer c1 = validateAll(sc.next(), sc.next().toLowerCase(), sc.next(), sc.next(), sc.next(),
								sc.nextDouble(), customers);
						customers.add(c1);
						System.out.println("Customer details added successfully.");
						break;

					case 2:// Customer Login
						System.out.println("Enter Username(email) and Password: ");
						findCustomerAndCheckPassword(sc.next(), sc.next(), customers);
						break;

					case 3:// Link Aadhar Card
						System.out.println("Enter Email : ");
						Customer c = findEmail(sc.next(), customers);
						// Linking aadhar card details via inner class --> AadharDetails, (Composition)
						System.out.println("Enter Aadhar Card Details: Aadhar Number(12 digits), Location");
						c.setAadharDetails(sc.next(), sc.next());
						System.out.println("Aadhar details stored Successfully.");

						// we used Composition above because without existence of Customer, Aadhar
						// details cannot exist.
						break;

					case 4:// Change Password
						System.out.println("Enter your email and old password :");
						Customer c2 = findCustomerAndCheckPassword(sc.next(), sc.next(), customers);
						System.out.println("Enter NEW password : ");
						String password = sc.next();
						validatePassword(password);
						if (c2.getAadhar() != null) {
							c2.setPassword(password);
							System.out.println("Pasword Updated!!");
						} else
							throw new CustomerHandlingException("No Aadhar Details found!! ");
						break;

					case 5:// Upgrade all senior citizens with Diamond plan to Platinum

						Date d1 = new Date();
						for (Customer c3 : customers) {
							long difference_In_Time = d1.getTime() - c3.getDob().getTime();
							long difference_In_Years = (difference_In_Time / (1000l * 60 * 60 * 24 * 365));

							if (difference_In_Years >= 60 && c3.getPlan() == CustomerType.DIAMOND) {
								c3.setType(CustomerType.PLATINUM);
							}
						}
						System.out.println("Upgraded all senior citizens with Diamond plan to Platinum!!");
						
						for(Customer c4 : customers)
						{
							System.out.println(c4);
						}
						break;

					case 6:// Remove all customers under Silver plan
						Iterator<Customer> customerItr= customers.iterator();
						while(customerItr.hasNext())
						{
							if(customerItr.next().getPlan()==CustomerType.SILVER)
							{
								customerItr.remove();
							}
						}
						System.out.println("List after removing customers under Silver :");
						
						for(Customer c4 : customers)
						{
							System.out.println(c4);
						}
						break;

					case 7:// Sort customer details as per email(desc) using natural sorting order
						Collections.sort(customers);
						System.out.println("List after sorting acc to email is:");
						for(Customer c4 : customers)
						{
							System.out.println(c4);
						}
						break;

					case 8:// Sort customer details as per Dob(desc) using custom sorting order using
							// separate class
						Collections.sort(customers,new CustomerDobDescComparator());
						System.out.println("List after sorting acc to Dob(desc) is:");
						for(Customer c4 : customers)
						{
							System.out.println(c4);
						}
						break;

					case 9:// Sort customer details as per Dob(desc) and Plan(customer type) using custom
							// sorting order using anonymous inner class
						Collections.sort(customers, new Comparator<Customer>() //instance of the class
						 {

							@Override
							public int compare(Customer o1, Customer o2)
							{
								System.out.println(this.getClass());
								int retVal=o2.getDob().compareTo(o1.getDob());
								if(retVal==0) {
									return o1.getPlan().compareTo(o2.getPlan());
								}else
									return retVal;
							}
							 /*{
							if((o1.getDob()).before(o2.getDob())) return 1;
							if((o1.getDob()).compareTo(o2.getDob()) == 0) {
								if(o1.getPlan().getRegAmount()<o2.getPlan().getRegAmount()) return -1;
								if(o1.getPlan().getRegAmount()==o2.getPlan().getRegAmount()) return 0;
								else return 1;
							}
							return -1;
						}	*/
						});
						
						//custom method 
						//Collections.sort(customers,new CustomerDobPlanComparator());
						
						System.out.println("List after sorting acc to Dob(desc) and Customer Type(asc) is:");
						for(Customer c4 : customers)
						{
							System.out.println(c4);
						}
						break;

					case 10:
						System.out.println("Exiting....Good Bye!!");
						exit = true;
						break;

					default:
						System.out.println("Invalid choice!!");
					}
				} catch (Exception e) {
					e.printStackTrace();
					System.out.println(e.getMessage());
				}
				sc.nextLine(); // to clear the buffer of scanner
			} while (!exit);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
