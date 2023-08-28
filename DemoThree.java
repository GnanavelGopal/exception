package exceptionHandling;

public class DemoThree {
public static void main(String[] args) {
	System.out.println("Welcome");
	String a="TN07";
	try {
		int b=Integer.parseInt(a);
		System.out.println(b);
	}
//	catch(ArithmeticException e) {
//		System.out.println("Do not change the String");
//	}
//	catch(NullPointerException f) {
//		System.out.println("Do not do this");
//	}
	catch(NumberFormatException g) {
		System.out.println("No");
	}
//	catch(Exception j) {
//		System.out.println("Don't give");
//	}
	System.out.println(a);
	System.out.println("Thank You");
}
}
