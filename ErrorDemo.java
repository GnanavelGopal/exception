package exceptionHandling;

public class ErrorDemo {
	public void findA() {
		findB();
	}
	public void findB() {
		findA();
	}
	public static void main(String[] args) {
		ErrorDemo ed=new ErrorDemo();
		ed.findA();
		ed.findB();
	}
}
