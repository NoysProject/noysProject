package com.noyproj.javacourse;

public class MathManager {

	public String getResult(){
		int radius = 50;

		int angleB = 30;
		int hypotenuse = 50;
		
		int base = 20;
		int exp = 13;
		
		String line1 = new String("<strong>calculation 1:</strong> Area of circle with radius " + radius + " square-cm, is: " + Calculator.areaOfCircle(radius));
		String line2 = new String("<strong>calculation 2:</strong> Length of opposite where angle B is " + angleB + " degrees and Hypotenuse length is: " + hypotenuse + " cm ,is: " + Calculator.opposite(angleB, hypotenuse)) + " cm";
		String line3 = new String("<strong>calculation 3:</strong> Power of " + base + " with exp of " + exp + " is: " + Calculator.power(base, exp));
		
		String resultStr = line1 + "<br>" + line2 + "<br>" +line3;
		
		return resultStr;
	}
}
