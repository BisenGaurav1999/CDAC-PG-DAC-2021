package non_generic;

//Create a Holder class to hold ANY type of the data type(prim / ref type)
public class Holder {
	private Object reference;// state : heap

	public Holder(Object reference) {
		super();
		this.reference = reference;
	}
	// getter

	public Object getReference() {
		return reference;
	}

}
