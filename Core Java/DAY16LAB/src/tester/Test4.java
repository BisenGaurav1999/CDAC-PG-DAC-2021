package tester;
import static utils.StudentCollectionUtils.*;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.Scanner;

import com.app.core.Student;
import com.app.core.Subject;

/*4. Write a tester to print average of  gpa of students for the specified subject
(Hint : filter,map,average,optional)
*/

public class Test4 {

	public static void main(String[] args) {
		//Display average all Student details from a list
		try(Scanner sc = new Scanner(System.in)){
			Map<String, Student> map = populateMap(populateList()); 
			System.out.println("Eneter subject");
			Subject subject=Subject.valueOf(sc.next().toUpperCase());
			OptionalDouble average = map.values().
			stream().
			filter(a->a.getSubject()==subject).
			mapToDouble(Student::getGpa).
			average();
			if(average.isPresent())
				System.out.println(average.getAsDouble());
			else {
				System.out.println("Empty avg");
			}
		}
	}

}
