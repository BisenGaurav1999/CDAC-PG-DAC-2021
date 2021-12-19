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
									// :FilePrinter's obj : run time poly(=dynmic method dispatch)
		
		if(p instanceof FilePrinter) {
			((FilePrinter)p).closeFileHandler();}//prog. : explicit downcast, no runtime err. method exec : succeeds!!
		else
			System.out.println("Err2: not a FilePrinter...");
		p=new ConsolePrinter();//upCAsting
		p.print("Something is on ...");//DMD:dyn method dispatch
		//((FilePrinter)p).closeFileHandler();//fooling compilor :run time err..: ClassCastExc.: ConsolePrinter can't be cast into FilePrinter : Soln. Use instanceof
		if(p instanceof FilePrinter) {
			((FilePrinter)p).closeFileHandler();
			}
		else
			System.out.println("Err2: not a FilePrinter...");
		
	}

}
