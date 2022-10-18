package Condition;

public class UseWatch {
	public static void main(String[]args) {
		Watch watch=new Watch();
		watch.brand="TIN";
		watch.price=2000;
		watch.color="Red";
		watch.strapType="Leather";
		watch.isWaterproof=true;
		Watch watch1=new Watch();
		watch1.brand="Toyota";
		watch1.price=2500;
		watch1.color="Black";
		watch1.strapType="Plastic";
		watch1.isWaterproof=false;
		String b=watch.brand.toLowerCase();
		if(b.contains("a")|b.contains("e")||b.contains("i")||b.contains("o")||b.contains("u")) {
			System.out.println("It Contains Vowels");
		}
		else {
			System.out.println("Not Contains Vowels");
			
		}
		if(watch1.isWaterproof==true) {
			System.out.println(watch1.price-(watch1.price*5/100));
		}
		else {
			System.out.println(watch1.price+(watch1.price*5/100));
		}
		if(watch.brand.length()>4) {
			System.out.println(watch.brand.substring(1,watch.brand.length()-1));
		}
		else {
			System.out.println(watch.brand.charAt(0)+" "+watch.brand.charAt(watch.brand.length()-1));
		}
		
	}

}
