package custom_exc;

@SuppressWarnings("serial")
public class LibraryExcHandler extends Exception{
	public LibraryExcHandler(String mesg) {
		System.out.println(mesg);
	}
}
