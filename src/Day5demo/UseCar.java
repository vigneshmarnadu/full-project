package Day5demo;

public class UseCar {
	public static void main (String[]args) {
		Car car1 = new Car();
		car1.brand="Volvo";
		car1.color="Red";
		car1.price=2000000;
		car1.taxAmount=2000;
		car1.discountAmount=4000;
		car1.netPrice=car1.price+car1.taxAmount-car1.discountAmount;
		
		Car car2 = new Car();
		car2.brand="EEE";
		car2.color="Black";
		car2.price=500000;
		car2.taxAmount=3000;
		car2.discountAmount=5000;
		car2.netPrice=car2.price+car2.taxAmount-car2.discountAmount;
		
		Car car3 = new  Car();
		car3.brand="RrR";
		car3.color="Red";
		car3.price=600000;
		car3.taxAmount=4000;
		car3.discountAmount=3000;
		car3.netPrice=car3.price+car3.taxAmount-car3.discountAmount;
		
		System.out.println(car1.brand.toUpperCase()+" "+car1.color.charAt(0)+" "+car1.netPrice);
		System.out.println(car2.brand.toUpperCase()+" "+car2.color.charAt(0)+" "+car2.netPrice);
		System.out.println(car3.brand.toUpperCase()+" "+car3.color.charAt(0)+" "+car3.netPrice);
		
		
				
		
	}
	

}
