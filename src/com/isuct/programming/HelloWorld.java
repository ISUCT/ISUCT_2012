package com.isuct.programming;

public class HelloWorld {

	public static void main(String [] args){
    float x = 0.15f;
    float a = 0.05f;
    float b = 0.06f;
    double chisl;
    chisl = Math.acos((x-b)*(x+b));
    double znamen;
    znamen = Math.asin((x-a)*(x+a));
    double y = chisl/znamen;
    System.out.println("x="+x+"y="+y);
    
    x = 0.26f;
    chisl = Math.acos((x-b)*(x+b));
    znamen = Math.asin((x-a)*(x+a));
    y = chisl/znamen;
    System.out.println("x="+x+"y="+y);
    
    x = 0.37f;
    chisl = Math.acos((x-b)*(x+b));
    znamen = Math.asin((x-a)*(x+a));
    y = chisl/znamen;
    System.out.println("x="+x+"y="+y);
    
    x = 0.48f;
    chisl = Math.acos((x-b)*(x+b));
    znamen = Math.asin((x-a)*(x+a));
    y = chisl/znamen;
    System.out.println("x="+x+"y="+y);
    
    x = 0.56f;
    chisl = Math.acos((x-b)*(x+b));
    znamen = Math.asin((x-a)*(x+a));
    y = chisl/znamen;
    System.out.println("x="+x+"y="+y);
    
    
    }

    
    
    
}
