package com.isuct.programming;

/**
 * Выносим реализацию задач в отдельный класс
 * @author Nastya
 *   
 */
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
	public Calc(double aA,  double aXn, double aDx, double aXk) {
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

		double y = 0;
		// Создаем 2мерный массив для хранения результатов
		double[][] result = new double[2][arrayX.length];
		int i = 0;
		for (double x : arrayX) {
			if (x < 5) {
				 for (x = 1.2f; x <= 3.7; x += 0.5) {
            y = (Math.pow((a), (x + 1) * (x - 1)) - (Math.log((x - 1) * (x + 1)) / Math.log(10)) + Math.pow(((x - 1) * (x + 1)), (1 / 3)));
			// Сохраняем результат
			result[0][i] = x;
			result[1][i] = y;
			i++;
		}
                        }

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
		int nElem = (int) Math.floor(((xk-xn)/dx+1));

		double[][] result = new double[2][nElem+1];
		int i=0;
		for (double x = xn; x <= xk; x += dx) {
			if (x < 5) {
				// вычисляем числитель Math.pow(число, степень)
				 for (x = 1.2f; x <= 3.7; x += 0.5) {
            y = (Math.pow((a), (x + 1) * (x - 1)) - (Math.log((x - 1) * (x + 1)) / Math.log(10)) + Math.pow(((x - 1) * (x + 1)), (1 / 3)));
			}
			// Выводим результат
			result[0][i]=x;
			result[1][i]=y;
			i++;
		}
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
		int nElem = (int) Math.floor(((xk-xn)/dx+1));
		double[][] result = new double[2][nElem+1];
		int i=0;

		for (double x = xn; x <= xk; x += dx) {
			if (x < 5) {
				 for (x = 1.2f; x <= 3.7; x += 0.5) {
            y = (Math.pow((a), (x + 1) * (x - 1)) - (Math.log((x - 1) * (x + 1)) / Math.log(10)) + Math.pow(((x - 1) * (x + 1)), (1 / 3)));
			// Выводим результат
			result[0][i]=x;
			result[1][i]=y;
			i++;
		}
                        }
                }
		return result;
	}
        }
