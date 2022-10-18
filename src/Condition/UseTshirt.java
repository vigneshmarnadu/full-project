package Condition;

public class UseTshirt {
	public static void main (String[]args) {
		Tshirt tshirt = new Tshirt ();
		tshirt.brand="Fly";
		tshirt.price=4000;
		tshirt.color="Black";
		tshirt.isChecked=true;
		if(tshirt.isChecked) {
			System.out.println(tshirt.price+5000);
		}
		else {
			System.out.println(tshirt.price-2000);
		}
	}

}
