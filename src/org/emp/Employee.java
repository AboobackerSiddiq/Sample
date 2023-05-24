package org.emp;

public class Employee {

	public void empID() {
			}
	public void empname() {
		// TODO Auto-generated method stub
         System.out.println("empname = bob");
	}
	public void empDob() {
		// TODO Auto-generated method stub
         System.out.println("DOB = 23");
	}
	public void empPhone() {
		// TODO Auto-generated method stub
        System.out.println("phone number= 345765435");
	}
	public void empEmail() {
		// TODO Auto-generated method stub
         System.out.println("email= aboo@gmail.com");
	}
	public void empAddress() {
		// TODO Auto-generated method stub
System.out.println("17f, Ganesh Nagar, kodungaiyur, chennai-600118");
	}
	public static void main(String[] args) {
		Employee data = new Employee();
		data.empID();
		data.empname();
		data.empDob();
		data.empPhone();
		data.empEmail();
		data.empAddress();
	}
	
}
