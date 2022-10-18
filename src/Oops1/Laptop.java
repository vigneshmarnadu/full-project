package Oops1;

public class Laptop {
	private String brand;
	private int price;
	private boolean isTouchScreen;
	private Processor processor;
	
	public Laptop (String brand,int price,boolean isTouchScreen,Processor processor) {
		this.brand=brand;
		this.price=price;
		this.isTouchScreen=isTouchScreen;
		this.processor=processor;
	}
	public String toString() {
		return brand+" "+price+" "+isTouchScreen+" "+processor;
	}

}
