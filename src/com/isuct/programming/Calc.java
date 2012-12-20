package com.isuct.programming;

/**
 * Выносим реализацию задач в отдельный класс
 * @author jskonst
 *     2
 *    x + кубический корень из (x+b)
 * y=-------------------------------
 *    log(a+x)по основанию 2
 *    
 * если x<5
 * 
 *     3
 *    x + a + b
 * y=-------------------------------
 *         2
 *    sin(x  )
 *    
 *    a=1.1
 *    b=2
 */
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
			if (x < 5) {
				// вычисляем числитель Math.pow(число, степень)
				chisl = Math.pow(x, 3) + a + b;
				// вычисляем знаменатель Логарифм числа по основанию = (натуральный логарифм числа)/ (натуральный
				// логарифм основания)
				znamen = Math.sin(Math.pow(x, 2));
				// вычисляем y
				y = chisl / znamen;
			} else {
				// вычисляем числитель Math.pow(число, степень)
				chisl = Math.pow(x, 2) + Math.pow((x + b), (1 / 3f));
				// вычисляем знаменатель Логарифм числа по основанию = (натуральный логарифм числа)/ (натуральный
				// логарифм основания)
				znamen = Math.log(a + x) / Math.log(2);
				// вычисляем y
				y = chisl / znamen;
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
		double chisl = 0;
		double znamen = 0;
		double y = 0;
		//при создании вычисляем сколько будет элементов
		int nElem = (int) Math.floor(((xk-xn)/dx));

		double[][] result = new double[2][nElem+1];
		int i=0;
		for (double x = xn; x <= xk; x += dx) {
			if (x < 5) {
				// вычисляем числитель Math.pow(число, степень)
				chisl = Math.pow(x, 3) + a + b;
				// вычисляем знаменатель Логарифм числа по основанию = (натуральный логарифм числа)/ (натуральный
				// логарифм основания)
				znamen = Math.sin(Math.pow(x, 2));
				// вычисляем y
				y = chisl / znamen;
			} else {
				// вычисляем числитель Math.pow(число, степень)
				chisl = Math.pow(x, 2) + Math.pow((x + b), (1 / 3f));
				// вычисляем знаменатель Логарифм числа по основанию = (натуральный логарифм числа)/ (натуральный
				// логарифм основания)
				znamen = Math.log(a + x) / Math.log(2);
				// вычисляем y
				y = chisl / znamen;
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
	 * @param a
	 * @param b
	 */
	public double[][] taskA(double a, double b, double xn, double dx, double xk) throws ArrayIndexOutOfBoundsException{
		// Объявляем и инициализируем переменные
		double chisl = 0;
		double znamen = 0;
		double y = 0;
		//при создании вычисляем сколько будет элементов
		int nElem = (int) Math.floor(((xk-xn)/dx));
		double[][] result = new double[2][nElem+1];
		int i=0;

		for (double x = xn; x <= xk; x += dx) {
			if (x < 5) {
				// вычисляем числитель Math.pow(число, степень)
				chisl = Math.pow(x, 3) + a + b;
				// вычисляем знаменатель Логарифм числа по основанию = (натуральный логарифм числа)/ (натуральный
				// логарифм основания)
				znamen = Math.sin(Math.pow(x, 2));
				// вычисляем y
				y = chisl / znamen;
			} else {
				// вычисляем числитель Math.pow(число, степень)
				chisl = Math.pow(x, 2) + Math.pow((x + b), (1 / 3f));
				// вычисляем знаменатель Логарифм числа по основанию = (натуральный логарифм числа)/ (натуральный
				// логарифм основания)
				znamen = Math.log(a + x) / Math.log(2);
				// вычисляем y
				y = chisl / znamen;
			}
			// Выводим результат
			result[0][i]=x;
			result[1][i]=y;
			i++;
		}
		return result;
	}

}
