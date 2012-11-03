package com.isuct.programming;

    public class HelloWorld {    
    public static void main(String [] args){  
        /**
         * Задание 1
         */
        float x = 1.31f; 
	float a = 2.25f;
        double y = Math.pow(a, (x*x-1))-Math.log(x*x-1)/Math.log(10)+Math.pow((x*x-1), (1/3f));
        System.out.println("x(1)="+x+"  y(1)="+y);
    
        x=1.39f;
        y = Math.pow(a, (x*x-1))-Math.log(x*x-1)/Math.log(10)+Math.pow((x*x-1), (1/3f));
        System.out.println("x(2)="+x+"  y(2)="+y);
    
        x=1.44f;
        y = Math.pow(a, (x*x-1))-Math.log(x*x-1)/Math.log(10)+Math.pow((x*x-1), (1/3f));      
        System.out.println("x(3)="+x+"  y(3)="+y);
    
        x=1.56f;
        y = Math.pow(a, (x*x-1))-Math.log(x*x-1)/Math.log(10)+Math.pow((x*x-1), (1/3f));
        System.out.println("x(4)="+x+"  y(4)="+y);
    
        x=1.92f;
        y = Math.pow(a, (x*x-1))-Math.log(x*x-1)/Math.log(10)+Math.pow((x*x-1), (1/3f));
        System.out.println("x(5)="+x+"  y(5)="+y);
        
       /**
        * Задание 2
        */
        for (x=1.2f; x<=2.7; x+=0.3){
        y = Math.pow(a, (x*x-1))-Math.log(x*x-1)/Math.log(10)+Math.pow((x*x-1), (1/3f));
        System.out.println("x="+x+"  y="+y);
    }
    }
    
}