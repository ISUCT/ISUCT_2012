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
		float x = 1.1f; 
		float b = 2.5f;
                for (double Xn=1.28;Xn<=3.28;Xn+=0.4) {
		//вычисляем числитель Math.pow(число, степень)
		double chisl =1+ Math.sin(Math.pow(b, 3))  + Math.pow(Xn, 3);
		//вычисляем знаменатель Логарифм числа по основанию = (натуральный логарифм числа)/ (натуральный логарифм основания)
		double znamen = Math.pow(Math.pow(b, 3)  + Math.pow(Xn, 3),(1/3f));
		//вычисляем y
		double y = chisl/znamen;
		//Выводим результат
		System.out.println("Икс равен = "+Xn+" Игрек равен = "+y);
                }
		
		//повторяем вычисления для второго значения х, но следует помнить. что переменные мы уже объявляли
		//повторно их объявлять не надо, а надо только присвоить новые значени		
		
		//x=2.4f;
		//chisl = 1+ Math.sin(Math.pow(b, 3))  + Math.pow(x, 3);
		//znamen = Math.pow(Math.pow(b, 3)  + Math.pow(x, 3),(1/3f));
		//y = chisl/znamen;
		//System.out.println("X = "+x+" Y = "+y);
		
		//И для третьего значения так же и т.д (про циклы мы пока ничего не знаем)
		//x=3.6f;
		//chisl = 1+ Math.sin(Math.pow(b, 3))  + Math.pow(x, 3);
		//znamen = Math.pow(Math.pow(b, 3)  + Math.pow(x, 3),(1/3f));
		//y = chisl/znamen;
		//System.out.println("Дано = "+x+" Посчитано = "+y);
                
                //x=1.7f;
		//chisl = 1+ Math.sin(Math.pow(b, 3))  + Math.pow(x, 3);
		//znamen = Math.pow(Math.pow(b, 3)  + Math.pow(x, 3),(1/3f));
		//y = chisl/znamen;
		//System.out.println("Дано = "+x+" Посчитано = "+y);
                
                //x=3.9f;
		//chisl = 1+ Math.sin(Math.pow(b, 3))  + Math.pow(x, 3);
		//znamen = Math.pow(Math.pow(b, 3)  + Math.pow(x, 3),(1/3f));
		//y = chisl/znamen;
		//System.out.println("Дано = "+x+" Посчитано = "+y);
	}
}
