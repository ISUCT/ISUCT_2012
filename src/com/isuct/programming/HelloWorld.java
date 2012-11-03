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
       
       /**
     * @param args the command line arguments
     */
   
        public static void main(String[] args) {
        // TODO code application logic here
       
                double xn = 3.5f;
		double dx=0.6;
		double xk=6.5;
		double a = -2.5f;
		double b = 3.4f;
		double Chisl=0;
		double Znamen=0;
		double y=0;
       
                   /*Для первого уравнения системы.*/ 
        
        for(double x=3.5; x<=6.5; x=(x + 0.6)){  
            if(x<5){
            
               Chisl = Math.pow(Math.log10(x), 2)*((Math.pow(a, 2))+x);
               Znamen = Math.pow((x+a), 2);
               y = Chisl / Znamen;
        
        
                  /*Для второго уравнения системы.*/
       }else{
               Chisl=Math.pow((a+(b*x)), 2.5);
               Znamen=1.8+ Math.pow((Math.cos(a*x)),3);
               y = Chisl / Znamen;
              
          }    
        System.out.println("x=" + x + "y=" + y);
    
    }
}
        }



