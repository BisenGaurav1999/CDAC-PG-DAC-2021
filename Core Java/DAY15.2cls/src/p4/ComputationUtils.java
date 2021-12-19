package p4;

public interface ComputationUtils {
//add static method to invoke any operation on double args.
	//higher order function / method 
	static double computeResult(double a,double b,Operation op)
	{
		return op.performAnyOperation(a, b);
	}
}
