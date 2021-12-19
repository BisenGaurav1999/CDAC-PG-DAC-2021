package custom_ordering;

import java.util.Comparator;

import com.app.cms.Customer;

public class CustomerDobDescComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		if((o1.getDob()).before(o2.getDob())) return 1;
		if((o1.getDob()).compareTo(o2.getDob()) == 0) return 0;
		return -1;

	}

}
