package utils;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;

import com.app.core.Category;
import com.app.core.Product;

public interface BinIOUtils {
	// add static method to store 1 product details in the bin file , in buffered
	// manner
	static void storeProductDetails(Product product, String fileName) throws IOException {
		// chain of I/O streams
		// Java App ---> DOS : conversion from prim types / strings : binary ---> BOS
		// ---> FOS (bin file device)
		try (DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(fileName)))) {
			// product details : (int id, String name, Category productCatgeory, LocalDate
			// manufactureDate, double price)
			out.writeInt(product.getId());// id
			out.writeUTF(product.getName());// name
			out.writeUTF(product.getProductCatgeory().toString());// category
			out.writeUTF(product.getManufactureDate().toString());// date
			out.writeDouble(product.getPrice());// price
		} // JVM invokes out.close ---buf data --> file , file handle(descriptor)
	}

	// add static method to re store 1 product details from the bin file , in
	// buffered manner
	static Product restoreProductDetails(String fileName) throws IOException {
		// API of java.io.File : class represents abstract path to a file / folder
		// first validate : if file exists ,is it file or folder , read permissions? :
		// YES --continue to attaching the i/o strms
		// 1 . create File class instance
		File file = new File(fileName);
		// validation
		if (file.canRead()) {

			// chain of I/O streams
			// Java App <---- DIS <---- BIS <---- FIS (bin file)
			try (DataInputStream in = new DataInputStream(
					new BufferedInputStream(new FileInputStream(fileName)))) {
				return new Product(in.readInt(), in.readUTF(), Category.valueOf(in.readUTF()),
						LocalDate.parse(in.readUTF()), in.readDouble());
			}
		} else
			System.out.println("Invalid file name!!!!!");
		return null;
	}

}
