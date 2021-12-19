package generic;

//Create a Holder class to hold ANY type of the data type(prim / ref type)
public class Holder<T> { //parameterized class : generic class
	private T reference;// state : heap

	public Holder(T reference) {
		super();
		this.reference = reference;
	}
	// getter

	public T getReference() {
		return reference;
	}

}
