package Oops2;

public class Bank {
	//method over loading
	public int loanAvailability(String name) {
		return 50000;
	}
	public int loanAvailability(String name,int salary) {
		return 50000+salary;
	}
	public int loanAvailability(String name,int salary,int noOfProperties) {
		return 50000+salary*noOfProperties;
	}
	
	

}
