package p1;

public class ConsolePrinter implements Printer{
	@Override
	public void print(String msg) {
		System.out.println("Printing a msg on the console: "+msg);
	}
}
