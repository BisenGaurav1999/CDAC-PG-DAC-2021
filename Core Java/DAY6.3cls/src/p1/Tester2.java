package p1;

public class Tester2 {

	public static void main(String[] args) {
		Printer p;// P:i/f type of the ref.: located in Stack : how many bytes : as per JVM spec
		// System.out.println(p);
		// p = new Printer();
		// can i/f ref directly(without type casting) refer to concrete imple. class
		// instance? YES
		p = new FilePrinter();// IS-A : implements : Up casting
		p.print("Something ...");// no javac err : since print(): declared in Printer i/f, JVM invokes print
									// :FilePrinter's obj
		((FilePrinter)p).closeFileHandler();
		p=new ConsolePrinter();//upCAsting
		p.print("Something is on ...");
	}

}
