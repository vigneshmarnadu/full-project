package Collections;

public class City {
	String hotelName;
	int hotelRent;
	String hotelLocation;
	
	public void setHotelName(String hotelName) {
		this.hotelName=hotelName;
	}
	public String getHotelName() {
		return "Hotel Name:"+hotelName;
	}
	public void setHotelRent(int hotelRent) {
		this.hotelRent=hotelRent;
	}
	public int getHotelRent() {
		return hotelRent;
	}
	public void setHotelLocation(String hotelLocation) {
		this.hotelLocation=hotelLocation;
	}
	public String getHotelLocation() {
		return "Hotel Location:"+hotelLocation;
	}
	public City(String hotelName,int hotelRent,String hotelLocation) {
		this.hotelName=hotelName;
		this.hotelRent=hotelRent;
		this.hotelLocation=hotelLocation;
	}
	public String toString() {
		return "Hotel Name"+hotelName+","+"Hotel Price"+hotelRent+","+"Hotel Location"+hotelLocation;
	}
	

}
