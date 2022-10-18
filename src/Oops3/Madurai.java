package Oops3;

public class Madurai implements City {
	public String areaName(String name) {
		return "Area Name"+name;
	}
	public String population(int population) {
		return "Populations"+population;
	}
	public void isTastyFood(boolean isTastyFood) {
		if(isTastyFood==true) {
			System.out.println("Konar Mess");
			
		}
		else {
			System.out.println("Invalid");
		}
	}

}
