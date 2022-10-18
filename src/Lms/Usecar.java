package Lms;

public class Usecar {
	public static void main(String[]args) {
		String []name=args[0].split("#");
		Car car1 = new Car();
		car1.brand=name[0];
		car1.price=Integer.parseInt(name[1]);
		car1.color=name[2];
		car1.taxPercentage=Integer.parseInt(name[3]);
		car1.discountPercentage=Integer.parseInt(name[4]);
		car1.taxAmount=car1.price+(car1.price*car1.taxPercentage/100);
		car1.discountAmount=car1.price-(car1.price*car1.discountPercentage/100);
		car1.netPrice=car1.price+car1.taxAmount-car1.discountAmount;
		String[]name1=args[1].split("#");
		Car car2 = new Car();
		car2.brand=name1[0];
		car2.price=Integer.parseInt(name1[1]);
		car2.color=name1[2];
		car2.taxPercentage=Integer.parseInt(name1[3]);
		car2.discountPercentage=Integer.parseInt(name1[4]);
		car2.taxAmount=car2.price+(car2.price*car2.taxPercentage/100);
		car2.discountAmount=car2.price-(car2.price*car2.discountPercentage/100);
		car2.netPrice=car2.price+car2.taxAmount-car2.discountAmount;
		
		System.out.println("BRAND : "+car1.brand+" , "+car2.brand);
		System.out.println("COLOR : "+car1.color.charAt(0)+" , "+car2.color.charAt(0));
		System.out.println("NET PRICE : "+car1.netPrice+" , "+car2.netPrice);
		
		
		
		
		
	}

}
class Car {
	String brand;
	int price;
	String color;
	int taxPercentage;
	int discountPercentage;
	int netPrice;
	int taxAmount;
	int discountAmount;
	
}