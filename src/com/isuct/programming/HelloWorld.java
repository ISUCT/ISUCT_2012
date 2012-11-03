package com.isuct.programming;

public class HelloWorld {

	public static void main(String [] args){
    float a = 0.05f;
    float b = 0.06f;
    for(double x=0.2f;x<=0.95;x+=0.15){
        double chisl;
    chisl = Math.acos((x-b)*(x+b));
    double znamen;
    znamen = Math.asin((x-a)*(x+a));
    double y = chisl/znamen;
    System.out.println("ответ x="+x+"y="+y);
    }
    }
}

    
    
    