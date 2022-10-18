package Collections;

public class Shirt {
	private String brand;
	private int price;
	private boolean isChecked;
	
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getbrand() {
		return "Brand:"+brand;
	}
	public void setprice(int price) {
		this.price=price;
	}
	public String getPrice() {
		return "Price:"+price;
	}
	public void setIsChecked(boolean isChecked) {
		this.isChecked=isChecked;
	}
	public boolean getIsChecked() {
		return isChecked;
	}
	public Shirt (String brand,int price,boolean isChecked) {
		this.brand=brand;
		this.price=price;
		this.isChecked=isChecked;
	}
	public String toString() {
		return "Brand:"+brand+" "+"Price:"+price+","+"IsChecked:"+isChecked;
	}
	

}
