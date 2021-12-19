package test_inheritance;

import java.util.Scanner;

import inheritance.Faculty;
import inheritance.Person;
import inheritance.Student;

public class EventOrganiser {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter even capacity");
		// create suitaable DS to hold diff type of participants details
		Person[] participants = new Person[sc.nextInt()];// array holder obj:that can hold Person Type refs
		// which can later refer to either students or faculty type of object: thanks to
		// upcasting
		boolean exit = false;
		int counter = 0;
		while (!exit) {
			System.out.println("Options 1. Register Student 2.Faculty Registration 3. Displat info 4. Invooke Specific functionality 100.Exit");
			System.out.println("Choose");
			switch (sc.nextInt()) {
			case 1:// Student registration
				if (counter < participants.length) {
					System.out.println("Enter Student Details: fn, ln,  yr,  courseName,  marks,  fees");
					participants[counter++] = new Student(sc.next(), sc.next(), sc.nextInt(), sc.next(), sc.nextInt(),
							sc.nextInt());

				} else
					System.out.println("Event Full!!");

				break;
			case 2:// Faculty Registration
				if (counter < participants.length) {
					System.out.println("Enter Faculty Details: fn, ln,  expInYrs,  sme");
					participants[counter++] = new Faculty(sc.next(), sc.next(), sc.nextInt(), sc.next());

				} else
					System.out.println("Event Full!!");

				break;
			case 3:// Display info:for-each
				for (Person p : participants) // p=participants[]...p=participants[participants.length-1]
				{
					if (p != null)
						System.out.println(p);// {s11.s2.s3.s4,null,null....}=>run time poly
				}
				break;
			case 4:
				System.out.println("Enter seat No.");
				int index=sc.nextInt()-1;
				if(index>=0 && index <counter) {
					if(participants[index] instanceof Student) {
						((Student)participants[index]).study();
					}else if(participants[index] instanceof Faculty)
						((Faculty)participants[index]).teach();
				}else
					System.out.println("Invalid seat no!!");
				break;
			case 100:
				exit = true;
				break;
			}
		}
		sc.close();
	}

}
