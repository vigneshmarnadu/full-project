package Oops1;

public class UseCar {
	public static void main(String[]args) {
		Engine eng=new Engine();
		eng.setBrand("BMW");
		eng.setPrice(800000);
		eng.setNoOfPistons(5);
		
		Car car=new Car();
		car.setBrand("BMW");
		car.setPrice(4000000);
		car.setColor("Black");
		car.setEngine(eng);
		
		
		
		System.out.println(car.getBrand());
		System.out.println(car.getPrice());
		System.out.println(car.getColor());
		System.out.println(car.getEngine().getBrand());
		System.out.println(car.getEngine().getPrice());
	}

}
