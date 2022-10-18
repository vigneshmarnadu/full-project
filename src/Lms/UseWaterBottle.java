package Lms;

public class UseWaterBottle {
	public static void main (String[]args) {
		String[] name=args[0].split("@");
		WaterBottle waterBottle=new WaterBottle();
		
		waterBottle.brand=name[0];
		waterBottle.volume=Float.parseFloat(name[1]);
		waterBottle.isRecyclable=Boolean.parseBoolean(name[2]);
		waterBottle.price=Integer.parseInt(name[3]);
		waterBottle.color=name[4];
		System.out.println("Brand = "+waterBottle.brand.toUpperCase()+","+"Volume = "+waterBottle.volume+","+"Is Recyclable = "+waterBottle.isRecyclable+","+"Price = "+","+"Color = "+waterBottle.color.toUpperCase());
		
		
	}

}

class WaterBottle{
	String brand;
	float volume;
	boolean isRecyclable;
	int price;
	String color;
	
}