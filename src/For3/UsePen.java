package For3;

public class UsePen {
	public static void main(String[]args) {
		Pen pen1=new Pen();
		pen1.brand="Heli";
		pen1.price=80;
		pen1.color="Red";
		pen1.isBAllPoint=true;
		Pen pen2=new Pen();
		pen2.brand="Google";
		pen2.price=100;
		pen2.color="Black";
		pen2.isBAllPoint=false;
		Pen pen3=new Pen();
		pen3.brand="Jin";
		pen3.price=120;
		pen3.color="Grey";
		pen3.isBAllPoint=true;
		Pen pen4=new Pen();
		pen4.brand="Celo";
		pen4.price=150;
		pen4.color="Yellow";
		pen4.isBAllPoint=true;
		Pen []pens= {pen1,pen2,pen3,pen4};
		for(Pen p:pens) {
			if(p.brand.length()>4) {
			System.out.println(p.brand.substring(1,p.brand.length()-1));
		}
			else {
				System.out.println(p.brand.charAt(0)+","+p.brand.charAt(p.brand.length()-1));
			}
		}
		
	}

}
