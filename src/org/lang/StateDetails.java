package org.lang;

public class StateDetails extends LanguageInfo {
	
	private void southIndia() {
		// TODO Auto-generated method stub
System.out.println("TamilNadu, Kerala");
	}
	private void northIndia() {
		// TODO Auto-generated method stub
System.out.println("Delhi, Bombay, Kolkata");
	}
	public static void main(String[] args) {
		StateDetails x = new StateDetails();
		x.northIndia();
		x.southIndia();
		x.tamilLanguage();
		x.englishLanguage();
		x.hindiLanguage();
		x.empAddress();
		x.empname();
		x.empEmail();
		x.empPhone();
		x.empDob();
	}

}
