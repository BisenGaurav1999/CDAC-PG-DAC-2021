package p1;
import static p1.Printer.DATA;
public class Tester1 {

	public static void main(String[] args) {
		// create instance of console printer
		//direct ref.
		ConsolePrinter printer = new ConsolePrinter();
		printer.print("some message!!!");
		//dirc. ref. (type of thr ref nd type of the obj : SAME )
		FilePrinter filePrinter = new FilePrinter();
		filePrinter.print("another message!!!");
		System.out.println(DATA);
	}

}
