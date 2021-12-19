/*
 2. Create a class Circle, it will have only one constructor which accepts radius as an argument. Write two methods in the class - calcuateArea(), calculatePermiter(). 
Write test class to test method calls.

class Circle{
  int rad;
  Circle(int r){this.rad = r;}
  double calArea(){}
  double calPerimeter(){}
*/
public class Circle {
	 private int rad;
	 Circle(int r){
		 this.rad = r;
	 }
	 
	 public void calArea() {
		 double ar = Math.PI*rad*rad ;
		 System.out.println(String.format("Marks in Physics = %.2f",ar));
	 }
	 
	 public void calPerimeter() {
		double pm = Math.PI*rad*2;
		System.out.println(String.format("Marks in Physics = %.2f",pm));
	 }
}
