package tester;
import static utils.StudentCollectionUtils.*;
import java.util.List;
import com.app.core.Student;

/*1. Display all student details from a list
eg : Iterable's forEach (lambda expr / method ref)
*/

public class Test1 {

	public static void main(String[] args) {
		//Display all Student details from a list
		List<Student> studentList = populateList();
		System.out.println("Using Method ref");
		studentList.forEach(System.out::println);
		
					//OR
		System.out.println("\nUsing Lambda Exp");
		studentList.forEach(i-> System.out.println(i));

	}

}
