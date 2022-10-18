package Oops1;

public class Car1 {
	private String brand;
	private String color;
	int price;
	String model;
	
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getBrand() {
		return brand;
	}
    public void setColor(String color) {
		this.color=color;
	}
	public String getColor() {
		return color;
	}
	public Car1 (int price,String model) {
		this.price=price;
		this.model=model;
	}
	public String toString() {
		return brand+","+color+","+price+","+model;
	}

}
