package com.kk.sj1.p2;

public class PrintVariables {

	//global variables
	
//	private static int gtrd = 23;
	
	public static void main(String[] args) {

		//local variables & its a variable definition
//		Write a Java program to print an int, a double and a char on screen
		int salary = 5437;
		double pi1 = 3.2222;
		char gendre = 'm';
		float i = 2.123f;
		String name = "str";
	
//		String data; -- variable declaration
		
		System.out.println("print the variables using decloration & definitions");
		System.out.println("int : "+ salary);
		System.out.println("pi1 : "+ pi1);
		System.out.println("gendre: "+ gendre);
		System.out.println("i : "+ i);
		System.out.println("name : "+ name);
		
		System.out.println("print the variables using direct values");
		System.out.println("int : "+ 23455);
		System.out.println("pi1 : "+ 5.5456);
		System.out.println("gendre: "+ 'm');
		System.out.println("i : "+ 3.123f);
		System.out.println("name : "+ "kk");
	
		System.out.println("print the variables using return statements");
		System.out.println("int : "+ getIntVariable(salary));//Argument passing
		System.out.println("int : "+ getInt());//Argument passing
		System.out.println("pi1 : "+ getDoubleVariable(pi1));
		System.out.println("pi1 : "+ getDouble());
		System.out.println("gendre : "+ getCharVariable(gendre));
		System.out.println("gendre : "+ getChar());
		System.out.println("float : "+ getFloatVariable(i));
		System.out.println("float : "+ getFloat());
		System.out.println("String : "+ getStringVariable("kk"));
		System.out.println("String : "+ getString());
		
	}
	//method with parameter & return type

	public static int getIntVariable(int num) { //parameter
		num = 45;
		return num;
	}
	
	//method without parameter & with return type
		
	public static int getInt() {
		return 23;
	}
	
	public static double getDoubleVariable(double k) {
		k =2.2345;
		return k;
	}
	
	public static double getDouble() {
		return 25678;
	}

	public static char getCharVariable(char gendre) {
		gendre = 'm';
		return gendre;
	}
	public static char getChar() {
		return 'm';
	}
	public static float getFloatVariable(float i) {
		i = 4.567f;
		return i;
	}
	public static float getFloat() {
		return 3.456f;
	}
	public static String getStringVariable(String name) {
		//name= "str";
		return name;
	}
	public static String getString() {
		return "str";
	}
	
	
}


