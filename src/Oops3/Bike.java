package Oops3;

public abstract class Bike {
	public String brand(String name) {
		return "Brand:"+name;
		
	}
	public String price(int price) {
		return "Price:"+price;
	}
	public abstract String speed(int speed);

}
