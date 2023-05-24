package org.payilagam;                                           //POLYMORPHISM-->    Method OverLoading

public class EmployeeInfo extends org.emp.Employee {

	public static void main(String[] args) {
		
		EmployeeInfo a = new EmployeeInfo();
		a.FillForm("satish",5428,"hhjk@gmail.com");
		a.FillForm("Bob",80900000, 0, "sgafa@gmail.com");
	}

	public void FillForm(String name, int phone, int j, String string2) {
		// TODO Auto-generated method stub
		System.out.println(name+"\t"+phone+"\t"+j+"\t"+string2);
		
	}

	private void FillForm(String Name, int id, String email) {
		// TODO Auto-generated method stub		
		System.out.println(Name+"\t"+id+"\t"+email);
	}
}
