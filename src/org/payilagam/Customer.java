package org.payilagam;

public class Customer {
	
	public static void main(String[] args) {
		
		Bank value = new Bank(); // if u call the other class method, U have to create the object with other class name.
		value.Deposit(5,10);	  // it is work without extends keyword
		value.Maths();
		System.out.println(value.abc);
	}

}
