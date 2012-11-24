/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isuct.programming;

/**
 *
 * @author Stud_5
 */
public class Calc {
  
	private double xn;
	private double dx;
	private double xk;
	private double a;
	private double b;
	
	public Calc(){
		
	}
    
	public Calc(double aA, double aB,double aXn,double aDx, double aXk){
	
		xn=aXn;
		dx=aDx;
		xk=aXk;
		a=aA;
		b=aB;
	}
    
	public void taskB(){
		
		double chisl ;
		double znamen ;
		double y ;
		double[] Xarray = new double[]{1.0,1.3,1.6,1.9,2.1,2.3,7.1,8.5,9.9};
		for (double x : Xarray) {
			 {
	
				chisl =(Math.log(Math.abs(Math.pow(b,2)-Math.pow(x, 2))) / Math.log(a))*Math.abs(Math.pow(b, 2)-Math.pow(x, 2));
				
				znamen = Math.pow((Math.abs(Math.pow(x,2)-Math.pow(a,2))), 1 / 5f);
			
				y = chisl / znamen;
			
		System.out.println("Икс равен = " + x + " Игрек равен = " + y);
		}
                         {
                         }
                         }
        }
	
	public void taskA(){
  
		
		double chisl;
		double znamen;
		double y;
		for(double x=0.08;x<=1.08;x+=0.2){
                    {
			
			chisl =(Math.log(Math.abs(Math.pow(b,2)-Math.pow(x, 2))) / Math.log(a))*Math.abs(Math.pow(b, 2)-Math.pow(x, 2));
			
			znamen = Math.pow((Math.abs(Math.pow(x,2)-Math.pow(a,2))), 1 / 5f);
			
			y= chisl/znamen;
	 	System.out.println("x=" + x+ " y=" + y);
                
                    }

	   }
        }
	public void taskA(double a, double b,double xn,double dx, double xk){
		
		double chisl;
		double znamen;
		double y;
		for(double x=xn;x<=xk;x+=dx){
		    {
			
			chisl =(Math.log(Math.abs(Math.pow(b,2)-Math.pow(x, 2))) / Math.log(a))*Math.abs(Math.pow(b, 2)-Math.pow(x, 2));
		
			znamen = Math.pow((Math.abs(Math.pow(x,2)-Math.pow(a,2))), 1 / 5f);
			
		   
			y= chisl/znamen;
		System.out.println("Икс равен = "+x+" Игрек равен = "+y);
		}
	}
	
}

}