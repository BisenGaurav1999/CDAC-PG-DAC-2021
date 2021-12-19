package tester;
import static utils.StudentCollectionUtils.*;
import java.util.Map;
import java.util.Scanner;

import com.app.core.Student;
import com.app.core.Subject;

/*
7. How many distinctions for a specific subject?
(gpa > 7.5 : distinction)
filter,count

*/

public class Test7 {

	public static void main(String[] args) {
		//Display average all Student details from a list
		try(Scanner sc = new Scanner(System.in)){
			Map<String, Student> map = populateMap(populateList()); 
			map.forEach((k,v)->System.out.println(v));
			System.out.println("Eneter subject");
			
			Subject subject=Subject.valueOf(sc.next().toUpperCase());
			System.out.println(map.values().
			stream().
			filter(a->a.getSubject()==subject && a.getGpa()>7.5).
			count());
			
		}
	}

}
