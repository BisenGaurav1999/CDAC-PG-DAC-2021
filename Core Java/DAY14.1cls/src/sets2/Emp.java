package sets2;

public class Emp {
	private int id;
	private String name;
	private String deptId;
	private double salary;

	public Emp(int id, String name, String deptId, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.deptId = deptId;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", deptId=" + deptId + ", salary=" + salary + "]";
	}
	
	@Override
	public boolean equals(Object o) {
		System.out.println("In emp equals");
		if(o instanceof Emp) {
			Emp e = ((Emp)o);
			return this.id==((Emp)o).id && deptId.equals(e.deptId);
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		System.out.println("In Emp hashCode");
		return 17*(id+deptId.hashCode()); 
	}
	
	
}
