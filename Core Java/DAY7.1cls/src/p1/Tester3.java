package p1;

public class Tester3 {

	public static void main(String[] args) {
		// arrayof i/f type of refs
		Printer[] printers = {new FilePrinter(),new ConsolePrinter(),new NetworkPrinter()};
		for(Printer p: printers)//p=printers[0],p=printer[1],p=printers[2]
		{
			p.print("Test msg...");//run time poly(DMD)
			if(p instanceof FilePrinter) {
				((FilePrinter)p).closeFileHandler();
			}else
				System.out.println("not a printer");
		}
	}

}
