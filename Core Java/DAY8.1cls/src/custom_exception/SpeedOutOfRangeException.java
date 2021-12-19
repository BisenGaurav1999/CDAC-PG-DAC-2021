package custom_exception;

@SuppressWarnings(value = {"serial"})
public class SpeedOutOfRangeException extends RuntimeException{
	public SpeedOutOfRangeException(String errMesg) {
		super(errMesg);//init err mesg
	}
}
