package test_inheritance;

import inheritance.Person;
import inheritance.Student;

public class Test2 {

	public static void main(String[] args) {
		// super cls ref,super cls instance, sub cls ref, sub cls obj(person, student,
		// faculty)
		Person p;// super cls ref
		p = new Person("a1", "b1");// lhs:super cls ref --> super cls instance,:DIRECT refrencing
		p = new Student("a2", "b2", 2020, "pd-dac", 80, 123456);// lhs:super cls ref --> sub cls intsnce
		// Why no javac err:because of extends : Student IS-A Person---> Hence UP-CASTING ://implicitly done by compilor
		Object o;//o:universal super cls ref
		o=p;
		System.out.println(p);
		System.out.println(o);
	}

}
