package generics;
import static utils.GenericUtils.printList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

/*
 * Test it with tester : AL<Integer> , LinkedList<Mgr>
 */
public class Test3 {

	public static void main(String[] args) {
		ArrayList<Integer> list1=new ArrayList<>(Arrays.asList(1,2,3,5,6,8));
		printList(list1);
		LinkedList<Mgr> list2=new LinkedList<>(Arrays.asList(new Mgr(1000),new Mgr(3000),new Mgr(2500)));
		printList(list2);

	}

}
