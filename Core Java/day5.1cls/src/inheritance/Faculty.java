package inheritance;

public class Faculty extends Person{
	private int expInYrs;
	private String sme;
	public Faculty(String fn,String ln, int expInYrs, String sme){
		super(fn, ln);
		//System.out.println("3");
		this.sme=sme;
		this.expInYrs=expInYrs;
	}
	public String toString() {
		return super.toString()+"\nSubject Matter Expertise "+sme+"\nExperience "+expInYrs;
	}
	//add new func: teach : Fname teaching courses under sme
	public void teach() {
		System.out.println(getfName()+" teaching courses under "+sme);
	}
}
