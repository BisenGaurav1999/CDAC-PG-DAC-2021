

/*
  1. Create a class Emp with fields like empId, name,dept,salary,address.
  Write required constructors for initialization
  Write a method displayEmpDetails() in the same class.
  
  Write another test class , where you have to take emp details from user using Scanner and create object and call methods.*/
public class Emp {
		private int empId;
		private String empName;
		private String deptName;
		private double salary;
		
		
			Emp (int id, String empName, String d, double s) {
			this.empId = id;
			this.empName = empName;
			this.deptName = d;
			this.salary = s;
		}
			
		public void displayEmpDetails() {
			System.out.println();
	        System.out.println();
	        System.out.println("===============================================================");
	        System.out.println("Employ Details");
	        System.out.println("===============================================================");
	        System.out.println(String.format("EmpId       : %d",empId));
	        System.out.println(String.format("Name        : %s",empName));
	        System.out.println(String.format("Department  : %s",deptName));
	        System.out.println(String.format("Salary      : Rs %.2f",salary));
	      
		}
		
		
}
