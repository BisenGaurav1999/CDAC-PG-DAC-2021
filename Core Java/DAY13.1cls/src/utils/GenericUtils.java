package utils;

import java.util.List;

import generics.Emp;

/*
 * 3. Write a static method in GenericUtils class : to print elements of ANY List(AL/LL/Vector) of ANY type

1. Add a method printElements to print the elements of ANY List of ANY type , on separate lines.
1.1 Try it with T : parameter Type (lab work!)
1.2 Try it with ?
Any difference ? 
Which seems easier to use ? 
 */
public class GenericUtils {
	public static void printList(List<?> list) {
		for (Object e : list)
			System.out.println(e);

	}

	/*
	 * Add static method which can accept ANY List(AL/LL/Vector) of any type of
	 * emps(Emp /Mgr / SalesMgr / Worker/ TempWorker) & compute salary.
	 */
	public static void computeEmpSalary(List<? extends Emp> emps) {
		for (Emp e : emps)
			e.computeSalary();
	}

	// Can you call above method with :
	/*
	 * 1. Vector<Emp> : no err 
	 * 2. AL<Emp> : no err 
	 * 3. HS<Emp> : javac err : HS IS Not a List
	 * 4. LHS <Emp> javac err : LHS IS Not a List 
	 * 5. AL<Mgr> : no err
	 * 6.LL<SalesMgr> : no err 
	 * 7. Vector<Worker> : no err 
	 * 8. LL <TempWorker> :no err
	 */
	
}
