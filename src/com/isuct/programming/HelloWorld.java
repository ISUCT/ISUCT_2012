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
		float x = 4.48f; 
		float a = 0.4f;
		float b = 0.8f;
		//вычисляем числитель Math.pow(число, степень)
		double chisl = (Math.pow(a, x) - Math.pow(b, x)) * Math.pow ( a*b,(1/3f));
		//вычисляем знаменатель Логарифм числа по основанию = (натуральный логарифм числа)/ (натуральный логарифм основания)
		double znamen = Math.log10 (a/b);
		//вычисляем y
		double y = chisl/znamen;
		//Выводим результат
		System.out.println("Икс равен = "+x+" Игрек равен = "+y);
		
		//повторяем вычисления для второго значения х, но следует помнить. что переменные мы уже объявляли
		//повторно их объявлять не надо, а надо только присвоить новые значени		
		
		x=3.56f;
		chisl = (Math.pow(a, x) - Math.pow(b, x)) * Math.pow ( a*b,(1/3f));
		znamen = Math.log10 (a/b);
		y = chisl/znamen;
		System.out.println("X = "+x+" Y = "+y);
		
		//И для третьего значения так же и т.д (про циклы мы пока ничего не знаем)
		x=2.78f;
		chisl = (Math.pow(a, x) - Math.pow(b, x)) * Math.pow ( a*b,(1/3f));
		znamen = Math.log10 (a/b);
		y = chisl/znamen;
		System.out.println("Дано = "+x+" Посчитано = "+y);
                
                x=5.28f;
		chisl = (Math.pow(a, x) - Math.pow(b, x)) * Math.pow ( a*b,(1/3f));
		znamen = Math.log10 (a/b);
		y = chisl/znamen;
		System.out.println("X = "+x+" Y = "+y);
                
                x=3.21f;
		chisl = (Math.pow(a, x) - Math.pow(b, x)) * Math.pow ( a*b,(1/3f));
		znamen = Math.log10 (a/b);
		y = chisl/znamen;
		System.out.println("X = "+x+" Y = "+y);
	}
}
