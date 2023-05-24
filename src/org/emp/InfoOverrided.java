package org.emp;

import org.payilagam.EmployeeInfo;

public class InfoOverrided extends EmployeeInfo {
	@Override
	public void FillForm(String name, int phone, int j, String string2) {
		int b = phone+j;
		System.out.println(b);
		super.FillForm(name, phone, j, string2);
	}
	@Override
	public void empID() {
		System.out.println("Emp Id is : 132343");
		super.empID();
	}
	public static void main(String[] args) {
		InfoOverrided a = new InfoOverrided();
		a.FillForm("aboo",45678767,3, "Aaysh");
		a.empID();
	}
}
