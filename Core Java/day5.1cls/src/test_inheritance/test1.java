package test_inheritance;
import inheritance.Student;
import inheritance.Faculty;
public class test1 {
	public static void main(String[] args) {
		//create Student instances
		Student s1=new Student("a1","b1",2020,"pd-dac",80,123456);
		System.out.println(s1);//s1.toString
		//create faculty instances
		Faculty f1=new Faculty("f1","f2",5,"Engineer");
		System.out.println(f1.toString());
	}
	
}
