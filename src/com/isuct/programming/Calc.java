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
	public Calc(){
		
	}
	/**
	 * Конструктор, в котором можно передать параметры
	 * @param aXn - начальное значение X
	 * @param aDx - дельта
	 * @param aXk - конечное значение Х
	 */
	public Calc(double aA, double aB,double aXn,double aDx, double aXk){
		//Устанавливаем значения закрытых полей
		xn=1.28;
		dx=0.4;
		xk=3.28;
		b=2.5;
	}
	/**
	 * Решение задачи B
	 */
	public void taskB(){
		// Объявляем и инициализируем переменные
		double chisl ;
		double znamen ;
		double y ;
		double[] Xarray = new double[]{1.0,1.3,1.6,1.9,2.1,2.3,7.1,8.5,9.9};
		for (double x : Xarray) {
			if (x < 5) {
				// вычисляем числитель Math.pow(число, степень)
				chisl =1+ Math.sin(Math.pow(b, 3))  + Math.pow(xn, 3);
				// вычисляем знаменатель Логарифм числа по основанию = (натуральный логарифм числа)/ (натуральный
				// логарифм основания)
				znamen = Math.pow(Math.pow(b, 3)  + Math.pow(xn, 3),(1/3f));
				// вычисляем y
				y = chisl / znamen;
			} else {
				// вычисляем числитель Math.pow(число, степень)
				chisl =1+ Math.sin(Math.pow(b, 3))  + Math.pow(xn, 3);
				// вычисляем знаменатель Логарифм числа по основанию = (натуральный логарифм числа)/ (натуральный
				// логарифм основания)
				znamen = Math.pow(Math.pow(b, 3)  + Math.pow(xn, 3),(1/3f));
				// вычисляем y
				y = chisl / znamen;
			}
			// Выводим результат
			System.out.println("Икс равен = " + x + " Игрек равен = " + y);
		}
	}
	
	/**
	 * Решение задачи А
	 */
	public void taskA(){
		//Объявляем и инициализируем переменные
		double chisl;
		double znamen;
		double y;
		for(double x=xn;x<=xk;x+=dx){
		    if(x<5){
			//вычисляем числитель Math.pow(число, степень)
			chisl =1+ Math.sin(Math.pow(b, 3))  + Math.pow(xn, 3);
			//вычисляем знаменатель Логарифм числа по основанию = (натуральный логарифм числа)/ (натуральный логарифм основания)
			znamen = Math.pow(Math.pow(b, 3)  + Math.pow(xn, 3),(1/3f));
			//вычисляем y
			y= chisl/znamen;
		    }else{
			//вычисляем числитель Math.pow(число, степень)
			chisl =1+ Math.sin(Math.pow(b, 3))  + Math.pow(xn, 3);
			//вычисляем знаменатель Логарифм числа по основанию = (натуральный логарифм числа)/ (натуральный логарифм основания)
			znamen = Math.pow(Math.pow(b, 3)  + Math.pow(xn, 3),(1/3f));
			//вычисляем y
			y= chisl/znamen;
		    }
		//Выводим результат
		System.out.println("Икс равен = "+x+" Игрек равен = "+y);
		}
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
	public void taskA(double a, double b,double xn,double dx, double xk){
		//Объявляем и инициализируем переменные
		double chisl;
		double znamen;
		double y;
		for(double x=xn;x<=xk;x+=dx){
		    if(x<5){
			//вычисляем числитель Math.pow(число, степень)
			chisl =1+ Math.sin(Math.pow(b, 3))  + Math.pow(xn, 3);
			//вычисляем знаменатель Логарифм числа по основанию = (натуральный логарифм числа)/ (натуральный логарифм основания)
			znamen = Math.pow(Math.pow(b, 3)  + Math.pow(xn, 3),(1/3f));
			//вычисляем y
			y= chisl/znamen;
		    }else{
			//вычисляем числитель Math.pow(число, степень)
			chisl =1+ Math.sin(Math.pow(b, 3))  + Math.pow(xn, 3);
			//вычисляем знаменатель Логарифм числа по основанию = (натуральный логарифм числа)/ (натуральный логарифм основания)
			znamen = Math.pow(Math.pow(b, 3)  + Math.pow(xn, 3),(1/3f));
			//вычисляем y
			y= chisl/znamen;
		    }
		//Выводим результат
		System.out.println("Икс равен = "+x+" Игрек равен = "+y);
		}
	}
	
}
