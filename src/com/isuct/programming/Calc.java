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


	public Calc(){
	}


	public Calc(double aA, double aXn, double aDx, double aXk) {
		xn = aXn;
		dx = aDx;
		xk = aXk;
		a = aA;
	}
        
	public void taskB(double b, double currX) {
            
                double a = 1.35f;
		double y;
		double[] Xarray = new double[] { 0.35,1.28,3.51,5.21,4.16  };
		for (double x : Xarray) {		
                y = (float) ((float) Math.pow(a * currX + b, 1.f / 3.f) / (float) Math.pow(Math.log10(currX), 2));
       System.out.println("x="+x+"  y="+y);
                        
		}
	}

	public void taskA(double b, double currX) {
		double y;
		for (double x = xn; x <= xk; x += dx) {
			y = (float) ((float) Math.pow(a * currX + b, 1.f / 3.f) / (float) Math.pow(Math.log10(currX), 2)); 
                         System.out.println("x="+x+"  y="+y);

		}
	}

	public void taskA(double a, double xn, double dx, double xk, double b, double currX) {	
		double y;             
                for (double x = xn; x <= xk; x += dx) {
			 y = (float) ((float) Math.pow(a * currX + b, 1.f / 3.f) / (float) Math.pow(Math.log10(currX), 2));
                         System.out.println("x="+x+"  y="+y);
		}
	}
}
