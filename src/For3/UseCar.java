package For3;

public class UseCar {
	public static void main(String[]args) {
		Car car1 =new Car();
		car1.brand="Hyundai";
		car1.price=200000;
		car1.color="Red";
		
		Car car2 =new Car();
		car2.brand="Honda";
		car2.price=250000;
		car2.color="Blue";
		
		Car car3 =new Car();
		car3.brand="Yamaha";
		car3.price=267990;
		car3.color="Black";
		
		Car car4 =new Car();
		car4.brand="Good";
		car4.price=205000;
		car4.color="Yellow";
		
	 Car []cars=new Car[4];
	 cars[0]=car1;
	 cars[1]=car2;
	 cars[2]=car3;
	 cars[3]=car4;
	 int max=cars[0].price;
	 int index=0;
	 for(int i=0;i<cars.length;i++) {
		 if(cars[i].price>=max) {
			 max=cars[i].price;
			 index=i;
		 }
	 }
	 System.out.println(max);
	 System.out.println(cars[index].brand+","+cars[index].price+","+cars[index].color);
		
		}

}
