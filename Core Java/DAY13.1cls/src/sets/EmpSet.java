package sets;

import java.util.HashSet;

public class EmpSet {

	public static void main(String[] args) {
		// empty HS<Emp>
		HashSet<Emp> emps=new HashSet<>();
		Emp e1=new Emp(101, "abc", 1000);
		Emp e2=new Emp(101, "abc", 1000);
		Emp e3=new Emp(10, "abc2", 2000);
		System.out.println("Added e1 "+emps.add(e1));//t
		System.out.println("Added e2 "+emps.add(e2));//t
		System.out.println("Added e3 "+emps.add(e3));//t
		System.out.println("size "+emps.size());//3
		for(Emp e : emps)
			System.out.println(e);//dup elems!!!!!!

	}

}
