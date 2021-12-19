package inheritance;

public class Student extends Person {
	// student specific state =non static data members(instance vars) = properties =
	// atribuutes
	private int gradYear;
	private String courseName;
	private int marks;
	private int fees;

	public Student(String fn, String ln, int yr, String courseName, int marks, int fees) {
		super(fn, ln);// invoking explicitly ,immediate super cls'Matching ctor
		//System.out.println("2");
		this.gradYear = yr;
		this.courseName = courseName;
		this.fees = fees;
		this.marks = marks;
	}

	public String toString() {
		return "Student "+super.toString() + gradYear + " Course " + courseName + " Marks " + marks + " fees "
				+ fees;
	}
	
	//add student specific func: "study" : prints : last name of student studying in coursename
	public void study() {
		System.out.println(getlName()+" Studing in "+courseName);
	}
}
