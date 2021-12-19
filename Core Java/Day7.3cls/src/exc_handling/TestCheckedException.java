package exc_handling;

public class TestCheckedException {
	public static void main(String[] args) {
		System.out.println("Before Sleep");
		//thread class : public static void sleep(lond msec) throws InterruptedExc : checked exec
		//javac forces handling of checked exec.
		try {
			Thread.sleep(5000);
			System.out.println("end of try");
		} catch (InterruptedException e) {
			System.out.println("exc occured");
		}
		System.out.println("after sleep...");
	}
}
