package Oops3;

public abstract class Laptop implements Electronics {
	public String name(String name) {
		return "Brand:"+name;
	}
	public abstract String isTouchScreen(boolean b);
	
}
