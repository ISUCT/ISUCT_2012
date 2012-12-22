/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

/**
 *
 * @author Alexandra
 */
public class JavaApplication13 {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args){
    float x=0.1f;
    double y;
    y=Math.acos(x);  
    System.out.println("x="+x+" y="+y);
    
    x=0.9f;
    y=Math.acos(x);
    System.out.println("x="+x+" y="+y);
   
    x=1.2f;
    y = Math.pow(1.2,x)-Math.pow(x,1.2);
    System.out.println("x="+x+" y="+y);
      
    x=1.5f;
    y = Math.pow(1.2,x)- Math.pow(x,1.2);
    System.out.println("x="+x+" y="+y);
      
    x=2.3f;
    y = Math.pow(1.2,x)- Math.pow(x,1.2);
    System.out.println("x="+x+" y="+y);
    }

}