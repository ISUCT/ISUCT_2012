/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ccalc;

/**
 *
 */

public class CCalc{
    
        private double xn;
	private double dx;
	private double xk;
	private double a;


	public CCalc(){
	}


	public CCalc(double aA, double aXn, double aDx, double aXk) {
		xn = aXn;
		dx = aDx;
		xk = aXk;
		a = aA;
	}
        
	public void taskB(double b) {
            
                double a = 2.0f;
		double y;
		double[] Xarray = new double[] { 0.08,0.26,0.35,0.41,0.53  };
		for (double x : Xarray) {		
                      y=(float) (Math.pow(Math.asin(x),a)+Math.pow(Math.acos(x),b));
                        System.out.println("x="+x+"  y="+y);

		}
	}

	public void taskA(double b) {
		double y;
		for (double x = xn; x <= xk; x += dx) {
			y=(float) (Math.pow(Math.asin(x),a)+Math.pow(Math.acos(x),b));
                         System.out.println("x="+x+"  y="+y);

		}
	}

	public void taskA(double a, double xn, double dx, double xk, double b) {	
		double y;             
                for (double x = xn; x <= xk; x += dx) {
			y=(float) (Math.pow(Math.asin(x),a)+Math.pow(Math.acos(x),b));
                         System.out.println("x="+x+"  y="+y);
		}
	}
}

