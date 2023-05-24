package org.emp;

public class AxisBank extends ICICIBank {
	
	@Override
	public void savings() {
		System.out.println("Axis savings: 9%");
		super.savings();
	}
	@Override
	public void deposit() {
		System.out.println("Axis Deposit: 12%");
		super.deposit();
	}
	public static void main(String[] args) {
		AxisBank x = new AxisBank();
		x.deposit();
		x.savings();
	}

}
