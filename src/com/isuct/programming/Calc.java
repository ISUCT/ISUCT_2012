package com.isuct.programming;
/**
 * Выносим реализацию задач в отдельный класс
 * @author jskonst
 *     2
 *    x + кубический корень из (x+b)
 * y=-------------------------------
 *    log(a+x)по основанию 2
 *    
 * 
 * y=-------------------------------
 *         
 *    
 *    a=1.6
 *    xn=1.2
 *    dx=0.5
 *    xk=3.7  
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
	public Calc(){
		
	}
	/**
	 * Конструктор, в котором можно передать параметры
	 * @param aXn - начальное значение X
	 * @param aDx - дельта
	 * @param aXk - конечное значение Х
	 */
	public Calc(double aA,double aXn,double aDx, double aXk){
		//Устанавливаем значения закрытых полей
		xn=aXn;
		dx=aDx;
		xk=aXk;
		a=aA;
	}
	/**
	 * Решение задачи B
	 */
	public void taskB(){
		// Объявляем и инициализируем переменные
		double y = 0;
		double[] Xarray = new double[]{1.28,1.36,2.47,3.68,4.56};
		for (double x : Xarray) {
		
                 y = Math.pow(a,(Math.pow(x,2)-1))- Math.log10(Math.pow(x,2)-1) + Math.pow((Math.pow(x,2)-1),(1/3f));
			// Выводим результат
		System.out.println("Икс равен = " + x + " Игрек равен = " + y);
		}
	}
	
	/**
	 * Решение задачи А
	 */
	public void taskA(){
		//Объявляем и инициализируем переменные
		double y=0;
		for(double x=xn;x<=xk;x+=dx){
		     y = Math.pow(a,(Math.pow(x,2)-1))- Math.log10(Math.pow(x,2)-1) + Math.pow((Math.pow(x,2)-1),(1/3f));
		    System.out.println("Икс равен = "+x+" Игрек равен = "+y);
                }
		//Выводим результат
		
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
	public void taskA(double a,double xn,double dx, double xk){
		//Объявляем и инициализируем переменные
		double y=0;
		for(double x=xn;x<=xk;x+=dx){
		 y = Math.pow(a,(Math.pow(x,2)-1))- Math.log10(Math.pow(x,2)-1) + Math.pow((Math.pow(x,2)-1),(1/3f));
		//Выводим результат
		System.out.println("Икс равен = "+x+" Игрек равен = "+y);
		}
	}
}
	

