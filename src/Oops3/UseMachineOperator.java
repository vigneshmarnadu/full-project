package Oops3;

public class UseMachineOperator {
	public static void main(String[]args) {
		MachineOperator mac=new MachineOperator();
         mac.salaryPerHour=200;
         mac.workingHour=8;
		System.out.println(mac.calculateSalaryPerday(mac.salaryPerHour, mac.workingHour));
		
	}

}
