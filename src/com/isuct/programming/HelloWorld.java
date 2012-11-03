package com.isuct.programming;

public class HelloWorld {

	public static void main(String[] args){
float x = 0.2f;
float a = 0.1f;
float b = 0.5f;
double chisl;
chisl= a+Math.pow(Math.tan(b*x),2);
double znamen;
znamen= b+Math.pow(Math.tan(a*x),2);
double y=chisl/znamen;
System.out.println("X = "+x+" Y = "+y);

x=0.3f;
chisl= a+Math.pow(Math.tan(b*x),2);
znamen= b+Math.pow(Math.tan(a*x),2);
y=chisl/znamen;
System.out.println("X = "+x+" Y = "+y);

x=0.44f;
chisl= a+Math.pow(Math.tan(b*x),2);
znamen= b+Math.pow(Math.tan(a*x),2);
y=chisl/znamen;
System.out.println("X = "+x+" Y = "+y);

x=0.6f;
chisl= a+Math.pow(Math.tan(b*x),2);
znamen= b+Math.pow(Math.tan(a*x),2);
y=chisl/znamen;
System.out.println("X = "+x+" Y = "+y);

x=0.56f;
chisl= a+Math.pow(Math.tan(b*x),2);
znamen= b+Math.pow(Math.tan(a*x),2);
y=chisl/znamen;
System.out.println("X = "+x+" Y = "+y);


        }  

}
