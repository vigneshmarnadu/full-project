package Day5demo;

public class Demo {
	public static void main(String[]args) {
		String a = "onesoft";
		String b =  "Technologies";
		String c=a.toUpperCase();
		String d=a.toLowerCase();
		int  e=a.length();
		String f=a.concat(b);
		boolean g=a.contains(b);
		boolean h=a.startsWith("on");
		boolean i=a.endsWith("ft");
		boolean j=a.equals(b);
		boolean k=a.equalsIgnoreCase(b);
		int l=a.indexOf("o");
		char m=a.charAt(5);
		String n=a.substring(2);
		char []o=a.toCharArray();
		String p[]=a.split("s");
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
		System.out.println(m);
		System.out.println(n);
		System.out.println(o[1]);
		System.out.println(p[0]);
		
	}

}
