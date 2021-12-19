package prim_arrays;

import java.util.*;

public class Test1 {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);//sc-->class type of ref referreing to class obj.
		System.out.println("How many Num(Double) Youwant to enter ?");
		double[] data;// data: ref type of a var, array type of ref,--->4/8/16 bytes on stack for
						// Storing the ref.---> for storing array of primitive
		data = new double[sc.nextInt()];//1.[D class will be loaded in method area,array obj in heap,
		//display array contents : def inited contents
		//for-each
		System.out.println("def contents of double[]:");
		for(double d : data)//d=data[0],d=data[1],...d=data[data.length-1]
			System.out.println(d);
		//display name of the loaded class for this double[]
		System.out.println("Name of the cls loaded class "+data.getClass());//[D: compilor created class
		double[] data2 = new double[100];//no new cls loading, new array obj created -->data2
		System.out.println("Name of the cls loaded class "+data2.getClass());//[D
		double[][] data3=new double[3][4];//new cls loaded :[[D
		System.out.println("Name of the cls loaded class "+data3.getClass());
		//Accept data from  User(Scanner)& store in the array :
		for (int i = 0; i < data.length; i++) {
			System.out.println("Enter array data");
			data[i]=sc.nextDouble();
		}
		//display:for each
		System.out.println("contents of double[] after init :");
		for(double d:data)//d=data[0],..
		{
			System.out.println(d);
		}
		System.out.println("Array contents via Array.toString:"+ Arrays.toString(data));
		sc.close();
	}

}
