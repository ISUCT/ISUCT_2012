/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isuct.programming;

public class Calc {
    /**
     * Закрытые поля класса
     */
	private double xn;
	private double dx;
	private double xk;

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
    public Calc(double aXn, double aDx, double aXk) {
	// Устанавливаем значения закрытых полей
	xn = aXn;
	dx = aDx;
	xk = aXk;

	}

	/**
	 * Решение задачи B */
    
	public double[][] taskB(double[] arrayX) {
		// Объявляем и инициализируем переменные
		double y = 0;
		// Создаем 2мерный массив для хранения результатов
		double[][] result = new double[2][arrayX.length];
		int i = 0;
		for (double x : arrayX) {
                    y=Math.pow((Math.pow(Math.asin(x),2)+Math.pow(Math.acos(x),4)),3);
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
                        y=Math.pow((Math.pow(Math.asin(x),2)+Math.pow(Math.acos(x),4)),3);			// Выводим результат
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
	  */
	public double[][] taskA(double xn, double dx, double xk) {
		// Объявляем и инициализируем переменные
		double y = 0;
		//при создании вычисляем сколько будет элементов
		int nElem = (int) Math.round((xk-xn)/dx+1);
		double[][] result = new double[2][nElem];
		int i=0;
                
		for (double x = xn; x < xk; x += dx) {
                         y=Math.pow((Math.pow(Math.asin(x),2)+Math.pow(Math.acos(x),4)),3);                  
			// Выводим результат
			result[0][i]=x;
			result[1][i]=y;
			i++;
		}
		return result;
	}
}
