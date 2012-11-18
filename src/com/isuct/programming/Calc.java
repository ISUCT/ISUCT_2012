/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isuct.programming;

/**
 *
 * @author Алена
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

	public void taskB() {
            
		double a = 2.25f;
		double y;
		double[] Xarray = new double[] { 1.31,1.39,1.44,1.56,1.92 };
		for (double x : Xarray) {			
			y = Math.pow(a, (x*x-1))-Math.log(x*x-1)/Math.log(10)+Math.pow((x*x-1), (1/3f));
                        System.out.println("x="+x+"  y="+y);
			
		}
	}

	public void taskA() {
		double y;
		for (double x = xn; x <= xk; x += dx) {
			 y = Math.pow(a, (x*x-1))-Math.log(x*x-1)/Math.log(10)+Math.pow((x*x-1), (1/3f));
                         System.out.println("x="+x+"  y="+y);
			
		}
	}

	public void taskA(double a, double xn, double dx, double xk) {	
		double y;             
                for (double x = xn; x <= xk; x += dx) {
			 y = Math.pow(a, (x*x-1))-Math.log(x*x-1)/Math.log(10)+Math.pow((x*x-1), (1/3f));
                         System.out.println("x="+x+"  y="+y);
		}
	}
}