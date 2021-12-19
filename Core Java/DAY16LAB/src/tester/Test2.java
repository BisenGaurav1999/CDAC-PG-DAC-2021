package tester;
import static utils.StudentCollectionUtils.*;
import static java.util.Comparator.*;
import java.util.Comparator;
import java.util.List;
import com.app.core.Student;

/*2. Display all student details(list) sorted as per GPA : (using single java statement)
eg : list --> seq stream --> sorting(comp : func literal) --->forEach
*/

public class Test2 {

	public static void main(String[] args) {
		//Display all Student details from a list sorted as per gpa
		List<Student> studentList = populateList();
		Comparator<Student> studComparator = (s1,s2)-> ((Double)s1.getGpa()).compareTo(s2.getGpa());
		studentList.stream().
		sorted(studComparator).
		forEach(System.out::println);
		
				//or
		
		studentList.stream().
		sorted(comparing(Student::getGpa)).
		forEach(System.out::println);

	}

}
