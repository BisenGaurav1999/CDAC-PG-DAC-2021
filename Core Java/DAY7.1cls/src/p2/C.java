package p2;
//will you face ambiguity issue with exact duplicate behavior ? : NO
public class C implements A,B{

	@Override
	public double add(double d1, double d2) {
		System.out.println(A.DATA+B.DATA);
		return d1+d2;
	}
	
}
