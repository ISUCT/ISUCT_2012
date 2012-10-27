/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isuct.programming;

/**
 *
 * @author User
 */
public class HelloWorld{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        float a=2.0f;
    float b=0.95f;
    float x=2.2f;
    double chisl;
    chisl=1+Math.log10(x/a);
    double znamen;
    znamen=b-Math.pow(Math.E,x/a);
    double y=chisl/znamen;
    System.out.println("x="+x+"y="+y);
   
    x=3.78f;
    chisl=1+Math.log10(x/a);
    znamen=b-Math.pow(Math.E,x/a);
    y=chisl/znamen;
    System.out.println("x="+x+"y="+y);
    
    x=4.51f;
    chisl=1+Math.log10(x/a);
    znamen=b-Math.pow(Math.E,x/a);
    y=chisl/znamen;
    System.out.println("x="+x+"y="+y);
    
    
    x=6.58f;
    chisl=1+Math.log10(x/a);
    znamen=b-Math.pow(Math.E,x/a);
    y=chisl/znamen;
    System.out.println("x="+x+"y="+y);
    
    x=1.2f;
    chisl=1+Math.log10(x/a);
    znamen=b-Math.pow(Math.E,x/a);
    y=chisl/znamen;
    System.out.println("x="+x+"y="+y);
    
    }
}
