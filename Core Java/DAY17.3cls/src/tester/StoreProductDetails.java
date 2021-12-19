package tester;

import java.time.LocalDate;
import java.util.Scanner;

import com.app.core.Category;
import com.app.core.Product;

import static utils.BinIOUtils.storeProductDetails;

public class StoreProductDetails {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println(
					"Enter product details :  id,  name,  productCatgeory,  manufactureDate(yr-mon-day),  price");
			Product p1 = new Product(sc.nextInt(), sc.next(), Category.valueOf(sc.next().toUpperCase()),
					LocalDate.parse(sc.next()), sc.nextDouble());
			//read off pending new line : nextLine
			sc.nextLine();
			System.out.println("Enter file name");
			//invoke IOUtils ' method for storing the product details
			storeProductDetails(p1, sc.nextLine());
			System.out.println("stored product details");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
