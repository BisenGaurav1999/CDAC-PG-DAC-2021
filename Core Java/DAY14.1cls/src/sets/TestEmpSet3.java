package sets;

import java.util.HashSet;

public class TestEmpSet3 {

	public static void main(String[] args) {
		//create empty HS<Emp> 
		//PK : emp id
		////BBBB AaBB AaAa BBAa
		HashSet<Emp> emps=new HashSet<>();
		Emp e1=new Emp("BBBB", "abc", 10000);
		Emp e2=new Emp("AaBB", "abc2", 20000);
		Emp e3=new Emp("AaAa", "abc3", 10000);
		Emp e4=new Emp("BBAa", "abc4", 10000);
		Emp e5=new Emp("BBAa", "abc2", 20000);
	
		System.out.println("Added "+emps.add(e1));//t , h 
		System.out.println("Added "+emps.add(e2));//t , h , eq : 1
		System.out.println("Added "+emps.add(e3));//t , h , eq : 2
		System.out.println("Added "+emps.add(e4));//t , h , eq 3
		System.out.println("Added "+emps.add(e5));//f , h eq 3
		
		System.out.println(emps);//[...]
		System.out.println("size "+emps.size());

		
		//Contract : Mandatory : Equal objects MUST produce SAME hashcode
		

	}

}
