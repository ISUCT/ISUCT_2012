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
       
             double a = 2.0f;
             double b = 0.95f;
       for (double x=1.25;x<2.75;x=(x+0.3)){
            double chisl=1+ Math.pow(Math.log10(x/a),2);
            double znamen=b-Math.pow(Math.E,x/a);
            double y=chisl/znamen;
       System.out.println("x="+x+" y="+y);
       }
       } 
        }



