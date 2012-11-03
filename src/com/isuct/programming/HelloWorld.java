package com.isuct.programming;

public class HelloWorld {

	public static void main(String [] args){
            double xn = 0.11f;
            double dx=0.05;
            double xk=0.36;
            double y=0;
		for(double x=0.11;x<=0.36;x=(x+0.05)){
                 y=(Math.pow(Math.sin(x),3)+(Math.pow(Math.cos(x),3))*Math.log10(x));
                    System.out.println("x=" + x + "y=" + y);
		
		}
	}
}
