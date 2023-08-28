package exceptionHandling;

public class DemoFour {
public static void main(String[] args) {
	System.out.println("Welcome");
	String a="Gnanavel";
	char c=a.charAt(9);
	try {
	System.out.println(c);
	}
	catch(StringIndexOutOfBoundsException b) {
		b.printStackTrace();
	}
	System.out.println("Thank you");
}
}
