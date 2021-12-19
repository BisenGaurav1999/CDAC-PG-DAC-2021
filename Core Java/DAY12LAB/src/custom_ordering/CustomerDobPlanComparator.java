package custom_ordering;

import java.util.Comparator;

import com.app.cms.Customer;

public class CustomerDobPlanComparator implements Comparator<Customer>{

	@Override
	public int compare(Customer o1, Customer o2) {
		{
			int retVal=o2.getDob().compareTo(o1.getDob());
			if(retVal==0) {
				return o1.getPlan().compareTo(o2.getPlan());
			}else
				return retVal;
		}
	}

}
