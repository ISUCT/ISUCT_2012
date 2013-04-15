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
	public Calc(double aA, double aB, double aXn, double aDx, double aXk) {
		// Устанавливаем значения закрытых полей
		xn = aXn;
		dx = aDx;
		xk = aXk;
		
	}

	/**
	 * Решение задачи B
	 */
	public double[][] taskB(double[] arrayX) {
		// Объявляем и инициализируем переменные
		
		double y = 0;
		// Создаем 2мерный массив для хранения результатов
		double[][] result = new double[2][arrayX.length];
		int i = 0;
		for (double x = xn; x < xk; x += dx) {
			 if(Math.abs(x)>=1){
                y = Math.pow(1.2, x) - Math.pow(x, 1.2) ;
            }
			 if(Math.abs(x)<1){
             y = Math.acos(x);
            }
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
	public double[][] taskA() throws ArrayIndexOutOfBoundsException {
		// Объявляем и инициализируем переменные
		
		double y = 0;
		//при создании вычисляем сколько будет элементов
		int nElem = (int) Math.floor(((xk-xn)/dx));

		double[][] result = new double[2][nElem+1];
		int i=0;
		for (double x = xn; x < xk; x += dx) {
			 if(Math.abs(x)>=1){
                y = Math.pow(1.2, x) - Math.pow(x, 1.2) ;
            }
			 if(Math.abs(x)<1){
             y = Math.acos(x);
            }
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
	 */
	public double[][] taskA(double xn, double dx, double xk) throws ArrayIndexOutOfBoundsException{
		// Объявляем и инициализируем переменные
		
		double y = 0;
		//при создании вычисляем сколько будет элементов
		int nElem = (int) Math.floor(((xk-xn)/dx));
		double[][] result = new double[2][nElem+1];
		int i=0;

		for (double x = xn; x < xk; x += dx) {
			 if(Math.abs(x)>=1){
                y = Math.pow(1.2, x) - Math.pow(x, 1.2) ;
            }
			 if(Math.abs(x)<1){
             y = Math.acos(x);
            }
			// Выводим результат
			result[0][i]=x;
			result[1][i]=y;
			i++;
		}
		return result;
	}

}