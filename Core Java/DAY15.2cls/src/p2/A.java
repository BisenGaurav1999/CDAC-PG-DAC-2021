package p2;

public interface A {
//implicit keywords added by javac : public , abstract
	double calc(double a, double b);

	// def method imple
	// implicit keyword added by javac : public
	default void show() {
		System.out.println("1");
	}

}
