package tester;

import java.util.Scanner;

import custom_exception.SpeedOutOfRangeException;

import static utils.SpeedUtils.validateSpeed;
public class TestCustomException {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
		System.out.println("Enter Speed");
		validateSpeed(sc.nextInt());
		System.out.println("Within Speed range");	
		}//sc.close();
		catch (SpeedOutOfRangeException e) {
			e.printStackTrace();
		}
	}

}
