package Day3test;

public class UseFruits {
	public static void main(String []args) {
		Fruits f1=new Fruits();
		f1.name="Apple";
		f1.color="Red";
		Fruits f2=new Fruits();
		f2.name="Orange";
		f2.color="Yellow";
		Fruits f3=new Fruits();
		f3.name="Banana";
		f3.color="Yellow";
		Fruits [] fruits=new Fruits[3];
		fruits[0]=f1;
		fruits[1]=f2;
		fruits[2]=f3;
		Fruits[]f=new Fruits[fruits.length];
		for(int i=0;i<fruits.length;i++) {
			f[i]=fruits[i];
		
	System.out.println(f[i].color);
		}
		
	}

}
