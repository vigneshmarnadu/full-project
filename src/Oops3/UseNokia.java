package Oops3;

public class UseNokia {
	public static void main(String[]args) {
		Nokia no=new Nokia();
		System.out.println(no.videoCall(false));
		System.out.println(no.voiceCall(false));
		System.out.println(no.connectivity(false));
		no.cameraFunction("Single Tapping");
	}

}
