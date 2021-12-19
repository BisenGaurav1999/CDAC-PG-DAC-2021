package generics;

import static utils.GenericUtils.computeEmpSalary;

import java.util.ArrayList;
import java.util.Arrays;

public class Test4 {

	public static void main(String[] args) {
		/*
		 * AL<Mgr> : javac err : AL<Mgr> is not a sub type of List<Emp>
		 */
		ArrayList<Mgr> mgr = new ArrayList<>(Arrays.asList(new Mgr(1000), new SalesMgr(2000), new Mgr(3000)));
		computeEmpSalary(mgr);

	}

}
