package com.isuct.programming;

public class Calc {
	/**
	 * Закрытые поля класса
	 */
	private double xn;
	private double dx;
	private double xk;
	private double a;
	

	/**
	 * Конструктор по умолчанию
	 */
	public Calc() {

	}

	/**
	 * Конструктор, в котором можно передать параметры
	 * @param aXn - начальное значение X
	 * @param aDx - дельта
	 * @param aXk - конечное значение Х
	 */
	public Calc(double aA, double aXn, double aDx, double aXk) {
		// Устанавливаем значения закрытых полей
		xn = aXn;
		dx = aDx;
		xk = aXk;
		a = aA;
		
	}

	/**
	 * Решение задачи B
	 */
	public double[][] taskB(double[] arrayX) {
		// Объявляем и инициализируем переменные
                double a = 2.25f;
		double y = 0;
		// Создаем 2мерный массив для хранения результатов
		double[][] result = new double[2][arrayX.length];
		int i = 0;
		for (double x : arrayX) {
			y = Math.pow(a, (x*x-1))-Math.log(x*x-1)/Math.log(10)+Math.pow((x*x-1), (1/3f));
			// Сохраняем результат
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
		// Объявляем и инициализируем переменные
            
		double y = 0;
		//при создании вычисляем сколько будет элементов
		int nElem = (int) Math.round((xk-xn)/dx+1);
                
		double[][] result = new double[2][nElem];
		int i=0;
		for (double x = xn; x < xk; x += dx) {
			y = Math.pow(a, (x*x-1))-Math.log(x*x-1)/Math.log(10)+Math.pow((x*x-1), (1/3f));
			// Выводим результат
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
	 */
	public double[][] taskA(double a, double xn, double dx, double xk) {
		// Объявляем и инициализируем переменные
		double y = 0;
		//при создании вычисляем сколько будет элементов
		int nElem = (int) Math.round((xk-xn)/dx+1);
		double[][] result = new double[2][nElem];
		int i=0;
                
		for (double x = xn; x < xk; x += dx) {
                        y = Math.pow(a, (x*x-1))-Math.log(x*x-1)/Math.log(10)+Math.pow((x*x-1), (1/3f));                       
			// Выводим результат
			result[0][i]=x;
			result[1][i]=y;
			i++;
		}
		return result;
	}

}