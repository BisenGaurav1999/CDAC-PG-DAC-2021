package p2;

public interface B {
	//def method imple
	//implicit keyword added by javac : public
	default void show()
	{
		System.out.println("2");
	}

}
