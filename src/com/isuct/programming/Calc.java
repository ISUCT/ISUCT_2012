package com.isuct.programming;


public class Calc {
	/**
	 * Закрытые поля класса
	 */
	private double xn;
	private double dx;
	private double xk;
	private double a;
	private double b;

	
	public Calc() {

	}

	/**
	 * Конструктор, в котором можно передать параметры
	 * @param aXn - начальное значение X
	 * @param aDx - дельта
	 * @param aXk - конечное значение Х
	 */
	public Calc(double aA, double aB, double aXn, double aDx, double aXk) {
		// Устанавливаем значения закрытых полей
		xn = aXn;
		dx = aDx;
		xk = aXk;
		a = aA;
		b = aB;
	}

	/**
	 * Решение задачи B
	 */
	public double[][] taskB(double[] arrayX) {
		
		double chisl ;
		double znamen ;
		double y;
		
		double[][] result = new double[2][arrayX.length];
		int i = 0;
		for (double x : arrayX) {
			if (x < 5) {
                    chisl =Math.pow(Math.log10(x), 2)*((Math.pow(a, 2))+x);
                    znamen = Math.sin(Math.pow(x, 2));
                    y = chisl / znamen;
                } else {
                    chisl=Math.pow((a+(b*x)), 2.5);
                    znamen =1.8+ Math.pow((Math.cos(a*x)),3);
                    y = chisl / znamen;
                    }  
			
			result[0][i] = x;
			result[1][i] = y;
			i++;
		}
		return result;
	}

	/**
	 * Решение задачи А
	 */
	public double[][] taskA() {
		
		double chisl ;
		double znamen ;
		double y ;
		
		int nElem = (int) Math.floor(((xk-xn)/dx));

		double[][] result = new double[2][nElem+1];
		int i=0;
		for (double x = xn; x <= xk; x += dx) {
			if (x < 5) {
                    chisl =Math.pow(Math.log10(x), 2)*((Math.pow(a, 2))+x);
                    znamen = Math.sin(Math.pow(x, 2));
                    y = chisl / znamen;
                } else {
                    chisl=Math.pow((a+(b*x)), 2.5);
                    znamen =1.8+ Math.pow((Math.cos(a*x)),3);
                    y = chisl / znamen;
                    }  
			
			result[0][i]=x;
			result[1][i]=y;
			i++;
		}
		return result;
	}

	/**
	 * Перегруженный метод вычисления задачи, с возможностью
	 * передачи параметров
	 * @param xn
	 * @param dx
	 * @param xk
	 * @param a
	 * @param b
	 */
	public double[][] taskA(double a, double b, double xn, double dx, double xk) {
		
		double chisl ;
		double znamen;
		double y ;
		
		int nElem = (int) Math.floor(((xk-xn)/dx));
		double[][] result = new double[2][nElem+1];
		int i=0;

		for (double x = xn; x <= xk; x += dx) {
			if (x < 5) {
                    chisl =Math.pow(Math.log10(x), 2)*((Math.pow(a, 2))+x);
                    znamen = Math.sin(Math.pow(x, 2));
                    y = chisl / znamen;
                } else {
                    chisl=Math.pow((a+(b*x)), 2.5);
                    znamen =1.8+ Math.pow((Math.cos(a*x)),3);
                    y = chisl / znamen;
                    }  
			
			result[0][i]=x;
			result[1][i]=y;
			i++;
		}
		return result;
	}

}










