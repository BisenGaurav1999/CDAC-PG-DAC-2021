package char_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class BufferedTextFileCopy {

	public static void main(String[] args) {
		System.out.println("Enter src n dest file names on separate lines , to copy data");
		try (Scanner sc = new Scanner(System.in);
				// Java App <----BR <----FR <--- src Text file
				BufferedReader br = new BufferedReader(new FileReader(sc.nextLine()));
				// Java App ---> PW : buffering strm ---> FW : node strm---> dest text file
				PrintWriter pw = new PrintWriter(new FileWriter(sc.nextLine(), true))) {
			// => chaining of I/O strms successful!

			// Functional API of BR : public Stream<String> lines()
			br.lines() // Stream<String>
					.forEach(s -> pw.println(s));//pw::println
			System.out.println("data copy over....");

		} catch (Exception e) {
			e.printStackTrace();
			// System.out.println(e);
		}
		System.out.println("main over....");

	}

}
