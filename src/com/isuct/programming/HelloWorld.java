package com.isuct.programming;

public class HelloWorld {


	public static void main(String [] args){
		float b = 2.5f;
for(double x=1.28f;x<=3.28;x=(x+0.4)){
double chisl = 1+Math.pow(Math.sin(Math.pow(b,3)+Math.pow(x,3)),2);
double znamen = Math.pow((Math.pow(b,3)+Math.pow(x,3)), 1/3);
double y = chisl/znamen;
System.out.println("x"+x+"y"+y);
		}
        }
}

