
package com.isuct.programming;

public class Calc {

	private double xn;
	private double dx;
	private double xk;
	private double a;
	private double b;


	public Calc() {

	}

	public Calc(double aA, double aB, double aXn, double aDx, double aXk) {
		// Устанавливаем значения закрытых полей
		xn = aXn;
		dx = aDx;
		xk = aXk;
		a = aA;
		b = aB;
	}

	
	public double[][] taskB(double[] arrayX) {

		double chisl ;
		double znamen ;
		double y=0;

		double[][] result = new double[2][arrayX.length];
		int i = 0;
		for (double x : arrayX) {
			if (x < 5) {
                chisl = 1 + Math.pow(Math.log10(x / a), 2);
                znamen = b - Math.pow(Math.E, x / a);
                y = chisl / znamen;
                    }  

			result[0][i] = x;
			result[1][i] = y;
			i++;
		}
		return result;
	}

	
	public double[][] taskA() {

		double chisl ;
		double znamen ;
		double y=0 ;

		int nElem = (int) Math.floor(((xk-xn)/dx));

		double[][] result = new double[2][nElem+1];
		int i=0;
		for (double x = xn; x <= xk; x += dx) {
			if (x < 5) {
                chisl = 1 + Math.pow(Math.log10(x / a), 2);
                znamen = b - Math.pow(Math.E, x / a);
                y = chisl / znamen;
                    }  

			result[0][i]=x;
			result[1][i]=y;
			i++;
		}
		return result;
	}

	
	public double[][] taskA(double a, double b, double xn, double dx, double xk) {

		double chisl ;
		double znamen;
		double y=0 ;

		int nElem = (int) Math.floor(((xk-xn)/dx));
		double[][] result = new double[2][nElem+1];
		int i=0;

		for (double x = xn; x <= xk; x += dx) {
			if (x < 5) {
                chisl = 1 + Math.pow(Math.log10(x / a), 2);
                znamen = b - Math.pow(Math.E, x / a);
                y = chisl / znamen;
                    }  

			result[0][i]=x;
			result[1][i]=y;
			i++;
		}
		return result;
	}

}