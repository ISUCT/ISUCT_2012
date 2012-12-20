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
		// Объявляем и инициализируем переменные
		double chisl = 0;
		double znamen = 0;
		double y = 0;
		// Создаем 2мерный массив для хранения результатов
		double[][] result = new double[2][arrayX.length];
		int i = 0;
		for (double x : arrayX) {
			chisl = (a) * Math.pow((x), (1 / 2)) - (b) * Math.log(x)/ Math.log(5);
                        znamen = Math.log(x - 1) / Math.log(10);	
         y = chisl / znamen;
			result[0][i] = x;
			result[1][i] = y;
			i++;
                        //Сохраняем результат
                }
		return result;
	}

	/**
	 * Решение задачи А
	 */
	public double[][] taskA() {
		// Объявляем и инициализируем переменные
		double chisl = 0;
		double znamen = 0;
		double y = 0;
		//при создании вычисляем сколько будет элементов
		int nElem = (int) Math.floor(((xk-xn)/dx));

		double[][] result = new double[2][nElem+1];
		int i=0;
		for (double x = xn; x <= xk; x += dx) {
			chisl = (a) * Math.pow((x), (1 / 2)) - (b) * Math.log(x)/ Math.log(5);
                        znamen = Math.log(x - 1) / Math.log(10);	
         y = chisl / znamen;
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
	 * @param b
	 */
	public double[][] taskA(double a, double b, double xn, double dx, double xk) {
		// Объявляем и инициализируем переменные
		double chisl = 0;
		double znamen = 0;
		double y = 0;
		//при создании вычисляем сколько будет элементов
		int nElem = (int) Math.floor(((xk-xn)/dx));
		double[][] result = new double[2][nElem+1];
		int i=0;

		for (double x = xn; x <= xk; x += dx) {
			chisl = (a) * Math.pow((x), (1 / 2)) - (b) * Math.log(x)/ Math.log(5);
                        znamen = Math.log(x - 1) / Math.log(10);	
         y = chisl / znamen;
			// Выводим результат
			result[0][i]=x;
			result[1][i]=y;
			i++;
		}
		return result;
	}

}