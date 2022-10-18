package For3;

public class UseLaptop {
	public static void main(String[]args) {
		Laptop lap1=new Laptop();
		lap1.brand="DELL";
		lap1.price=20000;
		lap1.color="Red";
		lap1.isTouchScreen=true;
		Laptop lap2=new Laptop();
		lap2.brand="Lenovo";
		lap2.price=30000;
		lap2.color="Blue";
		lap2.isTouchScreen=true;
		Laptop lap3=new Laptop();
		lap3.brand="Toon";
		lap3.price=40000;
		lap3.color="WHITE";
		lap3.isTouchScreen=false;
		Laptop lap4=new Laptop();
		lap4.brand="Hp";
		lap4.price=35000;
		lap4.color="Yellow";
		lap4.isTouchScreen=true;
		Laptop []laps= {lap1,lap2,lap3,lap4};
		for(int i=0;i<laps.length;i++) {
			if(laps[i].brand==laps[i].brand.toUpperCase()) {
				System.out.println(laps[i].brand+","+laps[i].price+","+laps[i].color+","+laps[i].isTouchScreen);
			}
		}
	}

}
