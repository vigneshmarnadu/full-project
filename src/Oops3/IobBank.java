package Oops3;

public class IobBank implements Bank {
	public String findRateOfInterest(int amount) {
		return "Rate Of Interest is"+amount*15/100;
	}

}
