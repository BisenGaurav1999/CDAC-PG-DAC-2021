package sets;

public class Emp {
	private String id;
	private String name;
	private double salary;

	public Emp(String id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public boolean equals(Object o) {
		System.out.println("in emp equals");
		if (o instanceof Emp)
			return id.equals(((Emp) o).id);
		return false;
	}
	public String getId() {
		return id;
	}

	@Override
	public int hashCode()
	{
		System.out.println("in hashCode");
		return id.hashCode();
	}

}
