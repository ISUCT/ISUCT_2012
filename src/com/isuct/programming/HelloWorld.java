package com.isuct.programming;

public class HelloWorld {

	/**
	 * Здесь мы просто посчитаем
	 * @param args
	 * пример:
	 *     2
	 *    x + кубический корень из (x+b)
	 * y=-------------------------------
	 *    log(a+x)по основанию 2
	 *    x=(поочередно несколько значений) 1.25; 2.5; 3.7
	 *    a=1.1
	 *    b=2
	 */
	public static void main(String [] args){
		//Объявляем и инициализируем переменные
		double a = 1.6f;
                double x;
                double xn=1.2f;
                double xk=3.7f;
                double dx=0.5f;
                for(x=xn; x<=xk; x+=dx){
		//вычисляем числитель Math.pow(число, степень)
		double y = Math.pow(a,(Math.pow(x, 2)-1)) - Math.log10(Math.pow(x,2)-1) + Math.pow((Math.pow(x,2)-1),(1/3f));
		//вычисляем знаменатель Логарифм числа по основанию = (натуральный логарифм числа)/ (натуральный логарифм основания)
		//Выводим результат
		System.out.println("X = "+x+" Y = "+y);
        }
        }

}