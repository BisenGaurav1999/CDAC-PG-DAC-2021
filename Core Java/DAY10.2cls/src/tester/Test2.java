package tester;

import com.app.vehicles.DeliveryAddress;

public class Test2 {

	public static void main(String[] args) {
		DeliveryAddress adr = new DeliveryAddress("Mumbai", "MH", "India", "45367");// => aggregation between Vehicle n
																					// DeliveryAddress
		// replace this by Composition where : 3rd party code SHOULD NOT be allowed to
		// create adr instance w/o owning/enclosing entity : Vehicle
		//In core java : nested classes
		//In hibernate : will be done using annotation (@Embeddable)

	}

}
