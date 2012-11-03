/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isuct.programming;

/**
 *
 * @author User
 */
public class HelloWorld {

  public static void main(String[] args) {
        // TODO code application logic here
        
		
        float a = 2.0f;		
        float b = 1.1f;		
     		
        for(double x=0.08;x<=1.08;x=(x+0.2)){		  
             double chisl=(Math.log(Math.abs(Math.pow(b,2)-Math.pow(x, 2))) / Math.log(a))*Math.abs(Math.pow(b, 2)-Math.pow(x, 2));
             double znamen=Math.pow((Math.abs(Math.pow(x,2)-Math.pow(a,2))), 1 / 5f);
             double y=chisl/znamen;
                System.out.println("x="+x+"y="+y);
                
                
                
                
            }
        
            
        
        
        
    }
}
