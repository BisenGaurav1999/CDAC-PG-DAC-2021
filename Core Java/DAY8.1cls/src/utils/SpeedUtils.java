package utils;

import custom_exception.SpeedOutOfRangeException;

public class SpeedUtils {
	public static final int MIN_SPEED;
	public static final int MAX_SPEED;
	static {
		MIN_SPEED=40;
		MAX_SPEED=80;
	}
	//add static method to validate the speed of the vehicle
	public static void validateSpeed(int speed)throws SpeedOutOfRangeException{
		if(speed<MIN_SPEED) {
			throw new SpeedOutOfRangeException("You Are Driving Too Slow!!!");
		}
		if(speed>MAX_SPEED) {
			throw new SpeedOutOfRangeException("You Are Driving Too Fast,, Slow Down!!!");
		}
		//=>Speed is Within the Range
	}
}
