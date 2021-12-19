package tester;

import static utils.CollectionUtils.*;
import static utils.IOUtils.storeProductDetails;

import java.util.Arrays;
import java.util.Scanner;

import com.app.core.Category;

public class TestCollectionIOIntegration {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter file name , to store product details");
			String fileName = sc.nextLine();
			System.out.println("Valid Catgeories : " + Arrays.toString(Category.values()));
			System.out.println("Choose category ");
			// get populated map from collection utils
			storeProductDetails(filterAndSortProducts
					(populateMapFromList
							(populateData()), sc.next()), fileName);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
