package org.company;

public class companyInfo {

	public void compName() {
		System.out.println("company details");
	}
	
	public void compName( String name ) {
		System.out.println("company name:"+name);
	}
	
	public void compName( String name ,String place) {
		System.out.println("company name:"+name);
		System.out.println("company name:"+place);
	}
	
	public static void main(String[] args) {
		 companyInfo c =new companyInfo();
		 c.compName();
		 c.compName("tcs");
		 c.compName("infy"," chn");
	}
}
