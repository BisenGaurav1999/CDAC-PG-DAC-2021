package var_args;

public class Test1 {

	public static void main(String... args) {
		System.out.println("no args");
		testMe();
		System.out.println("array arg");
		testMe(new Animal[] {new Dog(),new Cat()});
		System.out.println(", separated list of args");
		testMe(new Cat(),new Dog(),new Cat());
	}

	// add a static method to test var-args
	private static void testMe(Animal... animals) {
		for (Animal a : animals)
			System.out.println(a);
	}

}

class Animal {

}

class Cat extends Animal {

}

class Dog extends Animal {

}
