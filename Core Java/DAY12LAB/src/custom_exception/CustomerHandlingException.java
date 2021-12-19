package custom_exception;

@SuppressWarnings("serial")
public class CustomerHandlingException extends Exception {
	public CustomerHandlingException(String errMsg) {
		super(errMsg);
	}

}

