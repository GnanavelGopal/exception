package exceptionHandling;

public class DemoFive {
public static void main(String[] args) {
	System.out.println("Welcome");
	String[] a= {"Gnanavel","Saran","Raja"};
	try{
		for(int i=0;i<a.length;i++) {
		System.out.println(a[8]);
	}
	}
		catch(ArrayIndexOutOfBoundsException d) {
			System.out.println("Do give it");
		}
	System.out.println("Thank You");
}
}
