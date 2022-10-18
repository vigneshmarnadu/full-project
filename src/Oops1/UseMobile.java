package Oops1;

public class UseMobile {
	public static void main(String[]args) {
		Battery batt=new Battery();
		batt.brand="Prith";
		batt.price=2000;
		batt.capacity="500MAH";
		
		Mobile mob=new Mobile();
		mob.brand="SAMSUNG";
		mob.price=20000;
		mob.color="BLack";
		mob.battery=batt;
		
		Battery batt1=new Battery();
		batt1.brand="Pryut";
		batt1.price=1000;
		batt1.capacity="400MAH";
		
		Mobile mob1=new Mobile();
		mob1.brand="LENOVO";
		mob1.price=25000;
		mob1.color="Blue";
		mob1.battery=batt1;
		
		Battery batt2=new Battery();
		batt2.brand="Uith";
		batt2.price=3000;
		batt2.capacity="1000MAH";
		
		Mobile mob2=new Mobile();
		mob2.brand="MOtorolo";
		mob2.price=30000;
		mob2.color="White";
		mob2.battery=batt2;
		
		
		System.out.println(mob2.brand);
		System.out.println(mob1.battery.brand);
		
	}

}
