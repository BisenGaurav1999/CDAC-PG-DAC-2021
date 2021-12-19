package inheritance;

public class Person { 
	private String fName, lName;
	public Person(String fName, String lName){
		System.out.println("1");
		this.fName=fName;
		this.lName=lName;
	}
//	public Person() {
//		
//	}
	public String toString() {
		return fName+ " "+lName;
	}
}
