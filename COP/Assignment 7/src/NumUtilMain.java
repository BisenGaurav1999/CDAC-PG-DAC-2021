
public class NumUtilMain {
	static double getPower(double x, int n) {
		double d = Math.pow(x, n);
		return d;
	}

	static long getFactorial(int num) {
		long d = 1;
		for (int i = 1; i <= num; i++) {
			d = d * i;
		}
		return d;
	}

	static boolean isPrime(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	static boolean isEven(int num) {

		if (num % 2 == 0) {
			return true;
		}
		return false;
	}

	static boolean isOdd(int num) {
		if (num % 2 == 1) {
			return true;
		}
		return false;
	}
}
