package sets;

import java.util.HashSet;

public class TestEmpSet2 {

	public static void main(String[] args) {
		//create empty HS<Emp> 
		//PK : emp id
		
		HashSet<Emp> emps=new HashSet<>();
		Emp e1=new Emp("rnd-001", "abc", 10000);
		Emp e2=new Emp("rnd-002", "abc2", 20000);
		Emp e3=new Emp("rnd-001", "abc3", 10000);
		Emp e4=new Emp("rnd-009", "abc4", 10000);
		Emp e5=new Emp("rnd-006", "abc2", 20000);
		Emp e6=new Emp("rnd-005", "abc7", 10000);
		System.out.println("Added "+emps.add(e1));//t , hC
		System.out.println("Added "+emps.add(e2));//t , hC , eq :1
		System.out.println("Added "+emps.add(e3));//f  , hC , eq : 1
		System.out.println("Added "+emps.add(e4));//t hC , eq 2
		System.out.println("Added "+emps.add(e5));//t hC , eq 3
		System.out.println("Added "+emps.add(e6));//t hC , eq 4
		System.out.println(emps);//[...]
		System.out.println("size "+emps.size());//5
 		
		//Contract : Mandatory : Equal objects MUST produce SAME hashcode
		

	}

}
