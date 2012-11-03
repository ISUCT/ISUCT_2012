
package com.isuct.programming;
public class HelloWorld {	
    public static void main(String [] args){         
        double xn = 0.26f;            
        double dx=0.08;         
        double xk=0.66;      
        double y=0;		
        for(double x=0.26;x<=0.66;x=(x+0.08)){             
            y=Math.pow((Math.pow(Math.asin(x),2)+Math.pow(Math.acos(x),4)),3);            
            System.out.println("x=" + x + "y=" + y);	
        }	
    }
} 
