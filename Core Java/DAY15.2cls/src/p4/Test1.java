package p4;

import static p4.ComputationUtils.computeResult;

public class Test1 {

	public static void main(String[] args) {
		// invoke method : to add 2 numbers. : 1st : create separate class that imple.
		// Operation n pass it's instance

		System.out.println(computeResult(10, 20, new Operation() {

			@Override
			public double performAnyOperation(double a, double b) {
				// TODO Auto-generated method stub
				System.out.println(this.getClass());
				return a + b;
			}
		}));
		// invoke method : to subtract 2 numbers
		System.out.println(computeResult(10, 20, new Operation() {
			
			@Override
			public double performAnyOperation(double a, double b) {
				// TODO Auto-generated method stub
				System.out.println(this.getClass());
				return a - b;
			}
		}));
		//Can func i/f ref be substituted by lambda expr ? YES
		//( a,  b) -> a*b
		System.out.println(computeResult(10, 20,(d1,d2) -> d1*d2));

	}

}
