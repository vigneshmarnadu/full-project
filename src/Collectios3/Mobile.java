package Collectios3;

public class Mobile {
	String brand;
	int price;
	String color;
	String model;
	boolean isWarranty;
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public String getColor() {
		return color;
	}
	public void setModel(String model) {
		this.model=model;
	}
	public String getModel() {
		return model;
	}
	public void setIsWarranty(boolean isWarranty) {
		this.isWarranty=isWarranty;
	}
	public boolean getIsWarranty() {
		return isWarranty;
	}
	public Mobile(String brand,int price,String color,String model,boolean isWarranty) {
		this.brand=brand;
		this.price=price;
		this.color=color;
		this.model=model;
		this.isWarranty=isWarranty;
	}
	public String toString() {
		return brand+" "+price+" "+color+" "+model+" "+isWarranty;
	}
	
	}
	
	


