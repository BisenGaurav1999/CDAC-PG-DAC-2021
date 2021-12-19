package tester;
import static utils.CollectionUtils.*;
import static utils.SerDeSerUtils.storeProductDetails;

import java.util.Scanner;

public class TestSerialization {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)) {
			System.out.println("Enter file name for storing details (.ser)");
			storeProductDetails(populateMapFromList(populateData()),sc.nextLine());
			System.out.println("product details stored....");
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
