package Collections;
import java.util.ArrayList;

public class UseCity {

	public static void main(String[] args) {
		City c1=new City("Thalapakatti",350,"Chennai");
		City c2=new City("Bukari",600,"Adyar");
		City c3=new City("Temple city",399,"Manthavelli");
		City c4=new City("Rajasthani",700,"chrompet");
		City c5=new City("Yashni",600,"Crnis");
		City c6=new City("Thangam Grand",350,"Madurai");
		
		ArrayList<City> cities=new ArrayList<>();
		cities.add(c1);
		cities.add(c2);
		cities.add(c3);
		cities.add(c4);
		cities.add(c5);
		cities.add(c6);
		
		cities.forEach(x->System.out.println(x.getHotelName()+x.getHotelRent()));
		



		



	}

}
