package Oops3;

public class UseSportsCar {
	public static void main(String[]args) {
		SportsCar s=new SportsCar();
		s.brand="Rcc";
		s.color="Blue";
		System.out.println(s.getMileage(80));
		System.out.println(s.showEngineCc(60));
		System.out.println(s.showSpeed(220));
		
	}

}
