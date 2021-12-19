package inheritance;

public class Person {
	private String fName, lName;

	public Person(String fName, String lName) {
		// System.out.println("1");
		this.fName = fName;
		this.lName = lName;
	}

	public String toString() {
		return fName + " " + lName + "\n";
	}

	public String getlName() {
		return lName;
	}

	public String getfName() {
		return fName;
	}
}
