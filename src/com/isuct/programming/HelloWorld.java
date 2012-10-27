package com.isuct.programming;

    public class HelloWorld {    
    public static void main(String [] args){  
        
        float x = 1.31f; 
	float a = 2.25f;
        double y = Math.pow(a, (x*x-1))-Math.log(x*x-1)/Math.log(10)+Math.pow((x*x-1), (1/3f));
        System.out.println("x="+x+"  y="+y);
    
        x=1.39f;
        y = Math.pow(a, (x*x-1))-Math.log(x*x-1)/Math.log(10)+Math.pow((x*x-1), (1/3f));
        System.out.println("x="+x+"  y="+y);
    
        x=1.44f;
        y = Math.pow(a, (x*x-1))-Math.log(x*x-1)/Math.log(10)+Math.pow((x*x-1), (1/3f));      
        System.out.println("x="+x+"  y="+y);
    
        x=1.56f;
        y = Math.pow(a, (x*x-1))-Math.log(x*x-1)/Math.log(10)+Math.pow((x*x-1), (1/3f));
        System.out.println("x="+x+"  y="+y);
    
        x=1.92f;
        y = Math.pow(a, (x*x-1))-Math.log(x*x-1)/Math.log(10)+Math.pow((x*x-1), (1/3f));
        System.out.println("x="+x+"  y="+y);
        
    }
    
}