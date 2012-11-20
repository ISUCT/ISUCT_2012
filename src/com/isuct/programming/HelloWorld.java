package com.isuct.programming;
public class HelloWorld {
    public static void main(String[] args) {

float a = 0.1f;
float b = 0.5f;

float Xn = 0.15f;
float Xk = 1.37f;
float dX = 0.25f;
float y;
 for(double x=0.15;x<=1.37;x=(x+0.25)){             
            y=(float) (a+Math.pow(Math.tan(b*x),2)/ b+Math.pow(Math.tan(a*x),2));            
            System.out.println("x=" + x + "y=" + y);	
        }	
    }
} 
