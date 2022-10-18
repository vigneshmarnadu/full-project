package Condition;

public class UseMobile {
	public static void main (String[]args) {
		Mobile mobile = new Mobile();
		mobile.brand="Samsung";
		mobile.price=20000;
		mobile.color="Red";
		Mobile mobile1 = new Mobile();
		mobile.brand="Lenovo";
		mobile.price=19000;
		mobile.color="Black";
		if(mobile.price>mobile1.price) {
			System.out.println(mobile.brand.substring(1,mobile.brand.length()-1));
	}
	else {
		System.out.println(mobile1.brand.substring(1,mobile1.brand.length()-1));
	}
	}

}
