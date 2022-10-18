package For3;

public class UseWatch {
	public static void main(String[]args) {
		Watch watch1=new Watch();
		watch1.brand="Titan";
        watch1.price=2000;
        watch1.color="Red";
        watch1.isWaterProof=true;
        Watch watch2=new Watch();
        watch2.brand="Tootan";
        watch2.price=4000;
        watch2.color="Black";
        watch2.isWaterProof=false;
        Watch watch3=new Watch();
        watch3.brand="Tiut";
        watch3.price=5000;
        watch3.color="Yellow";
        watch3.isWaterProof=true;
        Watch watch4=new Watch();
        watch4.brand="Yoer";
        watch4.price=6000;
        watch4.color="Grey";
        watch4.isWaterProof=false;
        Watch watch5=new Watch();
        watch5.brand="Unioi";
        watch5.price=7000;
        watch5.color="White";
        watch5.isWaterProof=true;
        Watch watch6=new Watch();
        watch6.brand="Yerin";
        watch6.price=8000;
        watch6.color="Red";
        watch6.isWaterProof=false;
        
        
        Watch[]watches= {watch1,watch2,watch3,watch4,watch5,watch6};
        for(int i=0;i<watches.length;i++) {
        	if(watches[i].isWaterProof==true) {
        		System.out.println(watches[i].brand+","+watches[i].price+(watches[i].price*5/100));
        	}
        	else {
        		System.out.println(watches[i].brand+","+watches[i].price+(watches[i].price*3/100));
        	}
        }
	}

}
