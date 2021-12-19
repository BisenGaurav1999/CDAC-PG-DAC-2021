package tester;

import static utils.StudentCollectionUtils.*;

import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;

import com.app.core.Student;
import com.app.core.Subject;

/*
9. Display student details from the map , 
sorted as per student's roll no.

10. Display student details from the map , sorted as per student's dob.10. Display student details from the map , 
sorted as per student's dob.

11.  Display student details from the map , 
sorted as per student's roll no. (desc)

12. Print names  of first 3 specified subject  toppers
(filter, sorted , limit)
*/

public class Test8 {

	public static void main(String[] args) {
		// Display average all Student details from a list
		try (Scanner sc = new Scanner(System.in)) {
			Map<String, Student> map = populateMap(populateList());
			map.forEach((k, v) -> System.out.println(v));
			System.out.println("\nSorted data as per rollno");
			map.values().stream().sorted((a1, a2) -> a1.getRollNo().compareTo(a2.getRollNo()))
					.forEach(System.out::println);

			System.out.println("\nSorted data as per dob");
			map.values().stream().sorted((a1, a2) -> a1.getDob().compareTo(a2.getDob())).forEach(System.out::println);

			System.out.println("\nSorted data as per rollno(desc)");
			map.values().stream().sorted((a1, a2) -> a2.getRollNo().compareTo(a1.getRollNo()))
					.forEach(System.out::println);

			System.out.println("\nEnter subject");
			Subject subject = Subject.valueOf(sc.next().toUpperCase());
			System.out.println("\nfirst 3 specified subject  toppers");
			map.values().stream().filter(a->a.getSubject()==subject).
			sorted(Comparator.comparing(Student::getGpa).reversed()).
			limit(3)
			.forEach(System.out::println);
		}
	}

}
