package utils;

import java.io.FileWriter;
import java.io.IOError;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.stream.Stream;

import com.app.core.Product;

public interface IOUtils {
//add static method to read seq of products from the stream n store it in text file using buffer
	static void storeProductDetails(Stream<Product> products, String fileName) throws IOException{
		// Attach i/o streams Java App ---> PW (triggers for PW to send data in buffer
		// --> next strm : buf full / flush /close/auto flush on new line) --> FW -->
		// text file
		try(PrintWriter pw=new PrintWriter(new FileWriter(fileName)))
		{
			products.forEach(pw::println);
		}//JVM invokes pw.close ---> flush out data from buffer --> FW --> file ---close pw , close file handle
	}
}
