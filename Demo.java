package exceptionHandling;

public class Demo {
public static void main(String[] args) {
	System.out.println("Welcome");
	int a=10;
	int b=2;
	int c=0;
	try {
	System.out.println(a/c);
	}
	catch(ArithmeticException e) {
		System.out.println("Do not divided by zero");
	}
	finally {
		System.out.println("No");
	}
	System.out.println(a/b);
	System.out.println("Thank you all");
	System.out.println("meet you soon");
}
}
