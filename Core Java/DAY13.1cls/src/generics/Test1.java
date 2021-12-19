package generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Test1 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		ArrayList<Emp> emps=new ArrayList<>();
		ArrayList<Mgr> mgrs=new ArrayList<>();
		LinkedList<Mgr> mg = new LinkedList<Mgr>();
	//	emps=mgrs;//ArrayList<Emp> Is not a super type of AL<Mgr>
		ArrayList<Object> objs=new ArrayList<>();
		ArrayList<Temp> objs1=new ArrayList<>();
	//	objs=emps;//javac err
	//	objs=mgrs;//javac err
		// ? : wild card in generics , un bounded wild , CAN BE replaced by ANY type
		ArrayList<?> anyList=emps;
		anyList=mgrs;
		anyList=objs;
		//ArrayList<E> anyList2; --> invalid syntax
		List<?> anyList2=new Vector<String>();
		anyList2=new LinkedList<Mgr>();
		anyList2=mg;
		anyList2=objs1;
		
	}

}
