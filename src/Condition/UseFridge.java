package Condition;

public class UseFridge {
	public static void main(String[]args) {
		Fridge fridge = new Fridge();
		fridge.brand="Samsung";
		fridge.price=25000;
		fridge.color="Black";
		Fridge fridge1=new Fridge();
		fridge1.brand="Lernd";
		fridge1.price=30000;
		fridge1.color="Red";
		Fridge fridge2=new Fridge();
		fridge2.brand="ubfre";
		fridge2.price=40000;
		fridge2.color="White";
		Fridge fridge3=new Fridge();
		fridge3.brand="Hjtrg";
		fridge3.price=35000;
		fridge3.color="Yellow";
		if(fridge.price>fridge1.price&&fridge.price>fridge2.price&&fridge.price>fridge3.price) {
			System.out.println(fridge.brand.charAt(0));
		}
		else if(fridge1.price>fridge.price&&fridge1.price>fridge2.price&&fridge1.price>fridge3.price) {
			System.out.println(fridge1.brand.charAt(0));
		}
		else if(fridge2.price>fridge1.price&&fridge2.price>fridge.price&&fridge2.price>fridge3.price) {
			System.out.println(fridge2.brand.charAt(0));
		}
		else if(fridge3.price>fridge.price&&fridge3.price>fridge2.price&&fridge3.price>fridge.price) {
			System.out.println(fridge.brand.charAt(0));
		}
		
		
		
	}

}
