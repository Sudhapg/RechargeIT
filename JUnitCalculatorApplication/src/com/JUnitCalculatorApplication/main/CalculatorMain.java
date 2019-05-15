package com.JUnitCalculatorApplication.main;

import com.JUnitCalculatorApplication.services.CalculatorServices;

public class CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number1 = 45;
		int number2 = 30;
		
		CalculatorServices cs = new CalculatorServices();
		cs.Add(number1, number2);
		cs.Subtract(number1, number2);
		cs.Multiply(number1, number2);
		cs.Divide(number1, number2);

	}

}
