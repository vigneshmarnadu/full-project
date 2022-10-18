package Oops1;

public class UseCar1 {
	public static void main(String[]args) {
		Car1 car=new Car1(500000,"TYREF");
		car.setBrand("TATA");
		car.setColor("Black");
		
		System.out.println(car);
		System.out.println(car.getBrand()+","+car.getColor());
		
	}

}
