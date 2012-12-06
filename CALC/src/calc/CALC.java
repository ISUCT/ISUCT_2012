/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;

/**
 *
 * @author Алена
 */

public class CALC {
    
        private double xn;
	private double dx;
	private double xk;
	private double a;


	public CALC(){
	}


	public CALC(double aA, double aXn, double aDx, double aXk) {
		xn = aXn;
		dx = aDx;
		xk = aXk;
		a = aA;
	}
        
	public void taskB(double b) {
            
                double a = 0.1f;
		double y;
		double[] Xarray = new double[] { 0.2,0.3,0.44,0.6,0.56  };
		for (double x : Xarray) {		
                    y=(float) (a+Math.pow(Math.tan(b*x),2)/ b+Math.pow(Math.tan(a*x),2));      
                        System.out.println("x="+x+"  y="+y);

		}
	}

	public void taskA(double b) {
		double y;
		for (double x = xn; x <= xk; x += dx) {
			y=(float) (a+Math.pow(Math.tan(b*x),2)/ b+Math.pow(Math.tan(a*x),2)); 
                         System.out.println("x="+x+"  y="+y);

		}
	}

	public void taskA(double a, double xn, double dx, double xk, double b) {	
		double y;             
                for (double x = xn; x <= xk; x += dx) {
			 y = y=(float) (a+Math.pow(Math.tan(b*x),2)/ b+Math.pow(Math.tan(a*x),2)); 
                         System.out.println("x="+x+"  y="+y);
		}
	}
}
