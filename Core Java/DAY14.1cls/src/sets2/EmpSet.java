package sets2;

import java.util.HashSet;

public class EmpSet {

	public static void main(String[] args) {
		HashSet<Emp> emps=new HashSet<>();
		System.out.println("Added" +emps.add(new Emp(101, "a1", "rnd", 1000)));
		System.out.println("Added" +emps.add(new Emp(10, "a1", "rnd", 1000)));
		System.out.println("Added" +emps.add(new Emp(101, "a1", "prod", 1000)));
		System.out.println("Added" +emps.add(new Emp(90, "a1", "finance", 1000)));
		System.out.println("Added" +emps.add(new Emp(101, "a1", "rnd", 1000)));
		System.out.println(emps);
		System.out.println(emps.size());

	}

}
