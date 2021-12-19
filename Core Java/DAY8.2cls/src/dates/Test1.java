package dates;

import java.util.Date;

public class Test1 {

	public static void main(String[] args) {
		Date d1=new Date();//d1 ----> date cls instance => curnt date
		System.out.println(d1);
		Date d2=new Date(5000);//d2 ----> date cls instance => epoch + 5 secs
		System.out.println(d2);
		System.out.println(d1.compareTo(d2));// +ve 1
		System.out.println(d1.before(d2));//f
		System.out.println(d1.after(d2));//t
		System.out.println(d1.equals(d2));//f : content inequality

	}

}
