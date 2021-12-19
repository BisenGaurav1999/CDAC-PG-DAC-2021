package p3;
interface Formula {
    double calculate(double a);//public n abstract
	//public 
    default double sqrt(double a,double b) {
        return Math.sqrt(a+b);
    }
    //static methods , implicit keyword : public
    static void print(String mesg)
    {
    	System.out.println("Printing a mesg "+mesg+" from the i/f's static method");
    }
}