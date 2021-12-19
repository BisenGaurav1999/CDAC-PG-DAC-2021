package tester;

import static utils.StudentCollectionUtils.populateList;
import static utils.StudentCollectionUtils.populateMap;

import java.util.Map;
import java.util.Scanner;

import com.app.core.Student;
import com.app.core.Subject;

//Write a tester to print sum of  gpa of students from Map , for the specified subject
public class Test3 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// get populated student map
			Map<String, Student> map = populateMap(populateList());
			System.out.println("Student data");
			//print the map entries
			map.forEach((k,v) -> System.out.println(v));
			// convert Map --> Collection<Student> : values() --> Stream<Student> : stream()
			// --> filter : subject wise --> mapToDouble : Function : s--> GPA  --> sum
			System.out.println("Enter subject");
			Subject subject=Subject.valueOf(sc.next().toUpperCase());
			System.out.println("Sum of marks of students enrolled in subject "+subject+" "+
					map.values()
			.stream()
			.filter(s -> s.getSubject()==subject)
			.mapToDouble(Student :: getGpa)
			.sum());

		}

	}

}
