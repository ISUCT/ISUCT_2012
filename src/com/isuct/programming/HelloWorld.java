package com.isuct.programming;

public class HelloWorld {

	public static void main(String[] args){
float x = 1.88f;
float a = 0.8f;
float b = 0.4f;
double chisl;
chisl = Math.pow(Math.pow(x-2,2), 1/3)+Math.pow(Math.abs(x+b),(1/5));
double znamen;
znamen = Math.pow((Math.pow(x,2)-Math.pow((a+b),2)),1/9);
double y = chisl/znamen;
System.out.println("x="+x+"y="+y);

x = 2.26f;
chisl = Math.pow(Math.pow(x-2,2), 1/3)+Math.pow(Math.abs(x+b),(1/5));
znamen = Math.pow((Math.pow(x,2)-Math.pow((a+b),2)),1/9);
y = chisl/znamen;
System.out.println("x="+x+"y="+y);

x = 3.84f;
chisl = Math.pow(Math.pow(x-2,2), 1/3)+Math.pow(Math.abs(x+b),(1/5));
znamen = Math.pow((Math.pow(x,2)-Math.pow((a+b),2)),1/9);
y = chisl/znamen;
System.out.println("x="+x+"y="+y);

x = 4.55f;
chisl = Math.pow(Math.pow(x-2,2), 1/3)+Math.pow(Math.abs(x+b),(1/5));
znamen = Math.pow((Math.pow(x,2)-Math.pow((a+b),2)),1/9);
y = chisl/znamen;
System.out.println("x="+x+"y="+y);

x = -6.21f;
chisl = Math.pow(Math.pow(x-2,2), 1/3)+Math.pow(Math.abs(x+b),(1/5));
znamen = Math.pow((Math.pow(x,2)-Math.pow((a+b),2)),1/9);
y = chisl/znamen;
System.out.println("x="+x+"y="+y);
}

}