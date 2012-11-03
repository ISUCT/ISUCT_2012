/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isuct.programming;

/**
 *
 * @author User
 */
public class HelloWorld{

	/**
	 * Теперь посчитаем с циклом 
	 * @param args
	 * пример:
	 * xn=1
	 * dx=0.2
	 * xk=10
	 * если x>=5
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
	public static void main(String [] args){
		//Объявляем и инициализируем переменные
		double xn = 1f;
		double dx=0.2;
		double xk=10;
		double a = 1.1f;
		double b = 2.0f;
		double chisl=0;
		double znamen=0;
		double y=0;
		for(double x=xn;x<=xk;x+=dx){
		    if(x<5){
			//вычисляем числитель Math.pow(число, степень)
			chisl = Math.pow(x, 3) + a + b;
			//вычисляем знаменатель Логарифм числа по основанию = (натуральный логарифм числа)/ (натуральный логарифм основания)
			znamen = Math.sin(Math.pow(x,2));
			//вычисляем y
			y= chisl/znamen;
		    }else{
			//вычисляем числитель Math.pow(число, степень)
			chisl = Math.pow(x, 2) + Math.pow((x+b), (1/3f));
			//вычисляем знаменатель Логарифм числа по основанию = (натуральный логарифм числа)/ (натуральный логарифм основания)
			znamen = Math.log(a+x)/Math.log(2);
			//вычисляем y
			y= chisl/znamen;
		    }
		//Выводим результат
		System.out.println("Икс равен = "+x+" Игрек равен = "+y);
		
		}
		}
}
