package For3;

public class UseBag {
	public static void main(String[] args) {
		Bag bag1=new Bag();
		bag1.brand="Unit";
		bag1.price=1500;
		bag1.color="Red";
		Bag bag2=new Bag();
		bag2.brand="Un";
		bag2.price=150;
		bag2.color="Black";
		Bag bag3=new Bag();
		bag3.brand="Ut";
		bag3.price=1200;
		bag3.color="Yellow";
		Bag []bags= {bag1,bag2,bag3};
		Bag mini=bags[0];int mini1=bags[0].price;
		for(int i=0;i<bags.length;i++) {
			if(bags[i].price<=mini.price) {
			      mini=bags[i];
			}
		}
		System.out.println(mini.brand+","+mini.price+","+mini.color);
		
		
	}

}
