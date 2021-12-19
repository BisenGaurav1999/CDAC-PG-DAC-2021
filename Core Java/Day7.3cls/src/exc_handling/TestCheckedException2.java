package exc_handling;

public class TestCheckedException2 {
	public static void main(String[] args)throws InterruptedException {
		System.out.println("Before Sleep");
		// thread class : public static void sleep(lond msec) throws InterruptedExc :
		// checked exec
		// javac forces handling of checked exec.
		Thread.sleep(5000);
		System.out.println("end of try");

		System.out.println("after sleep...");
	}
}
