package tester;
import static utils.StudentCollectionUtils.*;
import java.util.Map;
import java.util.Scanner;

import com.app.core.Student;
import com.app.core.Subject;

/*
6 Print names of  failures for the specified subject chosen  from user.
(gpa < 5 : failed case)
*/

public class Test6 {

	public static void main(String[] args) {
		//Display average all Student details from a list
		try(Scanner sc = new Scanner(System.in)){
			Map<String, Student> map = populateMap(populateList()); 
			map.forEach((k,v)->System.out.println(v));
			System.out.println("Eneter subject");
			
			Subject subject=Subject.valueOf(sc.next().toUpperCase());
			map.values().
			stream().
			filter(a->a.getSubject()==subject && a.getGpa()<5).
			forEach(System.out::println);
			
		}
	}

}
