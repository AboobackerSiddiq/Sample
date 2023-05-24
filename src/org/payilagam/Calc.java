package org.payilagam;

import java.util.Scanner;

public class Calc {
	
	 public static void main(String[] args) {
	        Scanner a = new Scanner(System.in);

	        System.out.println("Enter first number:");
	        double num1 = a.nextDouble();

	        System.out.println("Enter second number:");
	        double num2 = a.nextDouble();

	        System.out.println("Enter an operator (+, -, *, /):");
	        char operator = a.next().charAt(0);

	        double result;

	        switch (operator) {
	            case '+':
	                result = num1 + num2;
	                break;
	            case '-':
	                result = num1 - num2;
	                break;
	            case '*':
	                result = num1 * num2;
	                break;
	            case '/':
	                if (num2 == 0) {
	                    System.out.println("Error: Cannot divide by zero.");
	                    return;
	                }
	                result = num1 / num2;
	                break;
	            default:
	                System.out.println("Error: Invalid operator.");
	                return;
	        }

	        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
	    }

}
