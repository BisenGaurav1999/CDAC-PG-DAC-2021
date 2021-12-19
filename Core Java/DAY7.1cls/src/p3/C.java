package p3;
//same method names with different signature
public class C implements A,B{

	@Override
	public double add(double d1, double d2) {

		return d1+d2;
	}
	@Override
	public double add(int d1, int d2) {

		return d1+d2;
	}
	
}
