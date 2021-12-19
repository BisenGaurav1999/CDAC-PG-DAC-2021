package custom_exception;

@SuppressWarnings("serial")
public class StudentExceptHandling extends Exception {
	public StudentExceptHandling(String mesg) {
		super("mesg");
	}
}
