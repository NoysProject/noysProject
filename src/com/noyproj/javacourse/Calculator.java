package com.noyproj.javacourse;

public class Calculator {
	private static double pi = Math.PI;
	
	public static double areaOfCircle(int radius){	
		double result = radius * radius * pi;
		return result;
	}
	
	public static double opposite(int angleB, int hypotenuse){
		double radian = ((double)angleB / 180) * pi;
		double sin = Math.sin(radian);
		double result = hypotenuse * sin;
		return result;
	}
	
	public static double power (int base, int exp){
		double result= java.lang.Math.pow(base, exp);
		return result;
	}
}
