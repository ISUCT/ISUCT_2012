package com.isuct.programming;

public class Calc {

	private double xn;
	private double dx;
	private double xk;
	private double a;
	private double b;

	/**
	 * Конструктор без параметров отсутствовал
	 */
	public Calc(){
		
	}
	
	/**
	 * Конструктор с параметрами
	 */
	public Calc(double aA, double aB, double aXn, double aDx, double aXk) {
		xn = aXn;
		dx = aDx;
		xk = aXk;
		a = aA;
		b = aB;
	}

	public void taskB() {
		double a = 4.1f;
		double b = 2.7f;
		double chisl = 0;
		double znamen = 0;
		double y = 0;
		double[] Xarray = new double[] { 1.9, 2.15, 2.34, 2.73, 3.16 };
		for (double x : Xarray) {
			chisl = (a) * Math.pow((x), (1 / 2)) - (b) * Math.log(x)
					/ Math.log(5);
			znamen = Math.log(x - 1) / Math.log(10);
			y = chisl / znamen;
			System.out.println("Икс равен= " + x + "Игрек равен = " + y);
		}
	}

	public void taskA() {
		double chisl = 0;
		double znamen = 0;
		double y = 0;
		for (double x = xn; x <= xk; x += dx) {
			chisl = (a) * Math.pow((x), (1 / 2)) - (b) * Math.log(x)
					/ Math.log(5);
			znamen = Math.log(x - 1) / Math.log(10);
			y = chisl / znamen;
			System.out.println("Икс равен= " + x + "Игрек равен = " + y);
		}
	}

	public void taskA(double a, double b, double xn, double dx, double xk) {

		double chisl = 0;
		double znamen = 0;
		double y = 0;
		// Ошибку писал из-за лишней скобки
		//for (double x = 1.2; x <= 5.2; x += 0.8  ----)-----    ) {
		//Если указывать числа - 1.2, 5.2 - то теряется смысл пользователю
		//передавать что либо сюда - поэтому правильно нужно использовать 
		//те параметры, которые пользователь передал
		//а использование числовых констант вообще зло
		for (double x = xn; x <= xk; x += dx) {
			chisl = (a) * Math.pow((x), (1 / 2)) - (b) * Math.log(x)
					/ Math.log(5);
			znamen = Math.log(x - 1) / Math.log(10);
			y = chisl / znamen;
			System.out.println("Икс равен= " + x + "Игрек равен = " + y);
		}
	}
}
