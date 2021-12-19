package enums;

public enum Color {
	RED(40), GREEN(25), BLUE(35);
	//state : preference
	private int preference;
	//ctor
	 Color(int preference) {
		this.preference=preference;
	}
	 //can you add methods : setters / getters /B.L : YESS
//	 //setter
	 public void setPreference(int preference)
	 {
		 this.preference=preference;
	 }
	 //getter
	 public int getPreference()
	 {
		 return preference;
	 }	
	//toString
	@Override
	public String toString()
	{
		return name().toLowerCase();
	}	
}
