package tester;

import java.util.Scanner;
import com.app.core.*;
public class Tester1 {
	public static void main(String[] args) {
		boolean exit = false;
		boolean stkchosen=false;
		FixedStack fs=null ;
		GrowableStack gs=null;
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("\n*****************************");
		System.out.println("1 ---- Choose Fixed Stack");
		System.out.println("2 ---- Choose Growable Stack");
		System.out.println("3 ---- Push Data");
		System.out.println("4 ---- Pop Data & Display");
		System.out.println("5 ---- Exit");
		System.out.println("*****************************\n");
		
		
		switch (sc.nextInt()) {
		case 1:
			if(stkchosen==false) {
				stkchosen=true;
				System.out.println("You have Choosen for Fixed size Stack");
				fs=new FixedStack();
				System.out.println("Now Choose from Option 3 , 4, 5");
			}else
				System.out.println("Stack already Choosen");
			
			break;
		case 2:
			if(stkchosen==false) {
				System.out.println("You have Choosen for Fixed size Stack");
				gs=new GrowableStack();
				System.out.println("Now Choose from Option 3 , 4, 5");
			}else
				System.out.println("Stack already Choosen");
			
			break;
		case 3:
			if(fs==null && gs==null)
				System.out.println("You Havnt Choosen any stack!!!");
			else {
			System.out.println("\nEnter the Employee details : ID Name Salary");
			if(fs==null) {
				gs.push(new Emp(sc.nextInt(), sc.next(), sc.nextDouble()));
			}else
				fs.push(new Emp(sc.nextInt(), sc.next(), sc.nextDouble()));}
			break;
		case 4:
			if(fs==null && gs==null)
				System.out.println("You Havnt Choosen any stack!!!");
			else {
			if(fs==null)
				System.out.println(gs.pop());
			else
				System.out.println(fs.pop());}
			break;
		case 5:
			System.out.println("Sayonara!!!");
			exit = true;
			break;

		default:
			System.out.println("Invalid Input !!!");
			break;
		}}
		while(!exit);

		sc.close();
	}
}
