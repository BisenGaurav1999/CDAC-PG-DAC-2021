package char_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class BufferedTextFileRead {
	public static void main(String[] args) {
		System.out.println("Enter file name along with path to read data");
		//E:\GAURAV\cdac\Notes\core java\Notes\Day17\day17-data\eclipse-projects\day17.1\new.txt 
		try (Scanner sc = new Scanner(System.in);
				// Java App <----BR <----FR <---Text file
				BufferedReader br = new BufferedReader(new FileReader(sc.nextLine()))) {
			// => chaining of I/O strms successful!

			// API of BR : public String readLine() throws IOException , rets : null @ End
			// of stream (file)
			String line = null;
			while ((line = br.readLine()) != null)
				System.out.println(line);
			System.out.println("data read over....");

		} catch (Exception e) {
			e.printStackTrace();
		//	System.out.println(e);
		}
		System.out.println("main over....");

	}


}
