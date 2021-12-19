package inheritance;

public class Faculty extends Person{
	private int expInYrs;
	private String sme;
	public Faculty(String fn,String ln, int expInYrs, String sme){
		super(fn, ln);
		System.out.println("3");
		this.sme=sme;
		this.expInYrs=expInYrs;
	}
}
