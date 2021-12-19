package wrappers;

import java.util.Date;

public class Test1 {

	public static void main(String[] args) {
	//	Integer i1=new Integer(100);//boxing
		Integer i1=Integer.valueOf(1234);//boxing (int --->Integer : expl)
		int data=i1.intValue();//un boxing (Integer --> int)
		i1=12345;//auto boxing : done by javac i1=Integer.valueOf(12345);
		data=i1;//auto un boxing (Integer--->int) : done by javac
		String s="45678";
//		s++;
//		s += 10;
//		Date d1=new Date();
//		d1 += 10;	//The operator += is undefined for the argument type(s
		i1++;//auto un boxing(int tmp=i1.intValue()) , tmp++ , auto boxing i1=Integer.valueOf(tmp)
		System.out.println(i1);
		double d1=data;//javac impl : widening (int ---> double)
//		Double d2=data;//javac : auto boxing int--->Integer ----X--- Double
		Double d2=(double)data;//double ---> Double (auto boxing)
	//    d2=123.456F;//javac : auto boxing float--->Float ----X--- Double
		Number n=123.456F;//auto box float ---Float --upcasting --> Number
		System.out.println("class loaded "+n.getClass().getName());//java.lang.Float
		n=1234.56;//double ---> Double --> Number 
		System.out.println("class loaded "+n.getClass().getName());//java.lang.Double
		Object o=100;//byte/int ---> Byte/Integer ---> Number ---> Object
		System.out.println(o.getClass());
		o=true;
		o="fghgf";
		o='c';
		o=new Date();
		System.out.println(o.getClass());

		//Can Object type of the ref DIRECTLY refer to ANY data type in java ? YES
		
	}

}
