package custom_exception;

@SuppressWarnings("serial")
public class VehicleHandlingException extends Exception {
	public VehicleHandlingException(String message) {
		super(message);
	}
}
