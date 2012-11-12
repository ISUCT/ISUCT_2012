package com.isuct.programming;

public class HelloWorld {


	public static void main(String [] args){
		 double x;
                double xn=0.11f;
                double xk=0.36f;
                double dx=0.05;
                double a=2.0;
                double b=3.0;
		double y;
                for( x=xn;x<=xk;x=x+dx){
                        y =Math.asin(Math.pow(x, a)) + Math.acos(Math.pow(x, b));
                        System.out.println("x="+x+ " y="+y);
                    }
		}
}
