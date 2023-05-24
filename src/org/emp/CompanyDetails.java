package org.emp;
//polymorphism sample
public class CompanyDetails {

	private void CompanyInfo(String name) {
		// TODO Auto-generated method stub
		System.out.println(name);
		this.CompanyInfo("aboo ", "aboo02290@gmail.com");
	}
	private void CompanyInfo(String name,String email) {
		// TODO Auto-generated method stub
		System.out.println("Employee name is: "+name+"\n"+"employee email is:" +email);
	}
	private void CompanyInfo() {
		// TODO Auto-generated method stub
        System.out.println("*   *"+"\n"+"* *"+"\n"+"**  "+"\n"+"* *"+"\n"+"*   *");
	}
	public static void main(String[] args) {
		CompanyDetails a = new CompanyDetails();
		a.CompanyInfo("Aaysha");
		a.CompanyInfo();
				
	}
}
