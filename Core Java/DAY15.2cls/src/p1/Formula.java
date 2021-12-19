package p1;
interface Formula {
    double calculate(double a);//public n abstract
	//public 
    default double sqrt(double a,double b) {
        return Math.sqrt(a+b);
    }
}