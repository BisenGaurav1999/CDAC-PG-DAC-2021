package utils;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Map;

import com.app.core.Product;

public interface SerDeSerUtils {
	// add a static method to store collection(Map) of product details in bin file :
	// using Serialization(OOS)
	static void storeProductDetails(Map<Integer, Product> map, String fileName) throws IOException{
		// attach data strms
		// Java App ---> OOS : ser. --> bin stream(state + meta data) --> FOS (bin file)
		// : .ser
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
			out.writeObject(map);
		}
	}

}
