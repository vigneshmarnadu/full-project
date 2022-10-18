package Oops3;

public class MachineOperator extends Worker {
	public String name(String name) {
		return "Name"+name;
	}
	public String calculateSalaryPerday(int salaryPerHour,int workingHour)
	 {
		return "Salary"+salaryPerHour*workingHour;
	}

}
