package tester;

import com.cdac.core.*;
import java.util.*;

public class TestBox {

	public static void main(String[] args) {
		// USES-A relationship
		{
			Scanner sc = new Scanner(System.in);
//			System.out.println("Enter Box dims : w d h");
//			Box b1;// ref type var : class type of the ref. ,local var : mem allocated on stack :
//					// 4/8/16 bytes as per JVM's spec., no objects of type Box created so far
//			// System.out.println(b1);//javac err
//			b1 = new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
//			// print the address : hashcode
//			System.out.println("b1's hashcode" + b1.hashCode());
//			// display dims n volume
//			System.out.println(b1.getBoxDetails());
//			System.out.println(b1.getComputedVolume());
			
			System.out.println("How many Box You want To create");
			int n = sc.nextInt();
			Box[] arr = new Box[n];
			for (int i = 0; i < arr.length; i++) {
				System.out.println("Enter Box Dims (w d h)");
				arr[i] = new Box(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
			}
			for (Box p : arr) {
				if(p.getComputedVolume()>100) {
					p.setWidth(p.getWidth()*2);
					System.out.println(p.getBoxDetails());
				}
			}
			sc.close();
		}

	}

}
