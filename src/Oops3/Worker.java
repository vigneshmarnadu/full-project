package Oops3;

public  abstract class Worker   {
	
	int salaryPerHour;
	int workingHour;
	public abstract String name(String name);
	public String getWork(String job)
	{
		return job;
	}
	public abstract String calculateSalaryPerday(int salaryPerHour,int workingHour);
	
	
	

}
