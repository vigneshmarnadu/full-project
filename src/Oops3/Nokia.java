package Oops3;

public class Nokia implements SmartPhone{
	public String videoCall(boolean a) {
		return "Video Call:"+a;
	}
	public String voiceCall(boolean b) {
		return "Voice Call:"+b;
	}
	public String connectivity(boolean c) {
		return "Connectivity:"+c;
	}
	public void cameraFunction(String function) {
		switch (function) {
		case("Single Tapping"):
			System.out.println("Single Shot");
		    break;
		case("Double Tapping"):
			System.out.println("Zoom");
		     break;
		case("Continuos Tapping"):
			System.out.println("Continuous Shot");
		     break;
		default:
			System.out.println("Invalid Input");
			break;
		
		
		}
	}



}
