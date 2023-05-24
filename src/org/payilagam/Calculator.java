package org.payilagam;

public class Calculator {

	public static void main(String[] args) {
		
		Calculator casio = new Calculator();
		int total= casio.add();
		System.out.println("now the value of total is :"+total);
		casio.sub(total);
		casio.divide(total);
		
		
	}

	private void divide(int input) {
		// TODO Auto-generated method stub
		input = input/5;
		System.out.println("after divide the value is:"+input);
		
	}

	private void sub(int input) {
		// TODO Auto-generated method stub);
		input= input-5;
		System.out.println("input is :" +input);
	  
		
	}

	private int add() { //<---- Method signature
		// TODO Auto-generated method stub
		int a = 10, b = 20;
		int c = a+b;
		System.out.println("the value of c is :"+c);
		return c;// return statement kudtha value ah call pana vaikudhu
		         //* return must be the last and end code of the program
		
	}
}
