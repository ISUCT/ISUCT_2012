package com.isuct.programming;

public class HelloWorld {

   public static void main(String[] args) {
       float a = 4.1f;
        float b = 2.7f; 
    for(double x=1.2; x<=5.2; x=(x + 0.8)){          
        double chisl = (a) * Math.pow((x), (1 / 2)) - (b) * Math.log(x) / Math.log(5);
           double  znamen = Math.log(x - 1) / Math.log(10);
           double y = chisl / znamen;
    System.out.println("x=" + x + "y=" + y);
    }
}
}