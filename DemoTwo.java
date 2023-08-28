package exceptionHandling;


public class DemoTwo {
public static void main(String[] args) {
	System.out.println("Welcome");
	String m=null;
	try {
	System.out.println(m.toUpperCase());
	}
	catch(NullPointerException e) {
		System.out.println("Do not give the null");
	}
	finally {
		System.out.println("Do not give the null value");
	}
	System.out.println("Thank you");
}
}
