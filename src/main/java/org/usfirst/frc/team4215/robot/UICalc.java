package org.usfirst.frc.team4215.robot;
/*
 * this is an abstraction of all the calculation the user interface needs to do
 */
public class UICalc {

	static double[] conditionDriveStick(double xMove, double yMove, double zMove){
		double[] conditionedValues = { 0, 0, 0,};
		
		//TODO conditioning algorithm
		conditionedValues[0] = xMove;
		conditionedValues[1] = yMove;
		conditionedValues[2] = zMove;
		
		return conditionedValues;
	}

	static double[] conditionThirdStick(double[] thirdStickInputs){
		double[] conditionedValues;
		
		//TODO conditioning algorithm
		conditionedValues = thirdStickInputs;
		
		return conditionedValues;
	}
}
