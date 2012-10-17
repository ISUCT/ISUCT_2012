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
		float x = 0.08f; 
		float a = 2.0f;
		float b = 3.0f;
		//вычисляем числитель Math.pow(число, степень)
		double chisl = Math.asin(Math.pow(x, a)) + Math.acos(Math.pow(x, b));
		//Выводим результат
		System.out.println("x = "+x+" y= "+chisl);
		
		//повторяем вычисления для второго значения х, но следует помнить. что переменные мы уже объявляли
		//повторно их объявлять не надо, а надо только присвоить новые значени		
		
		x=0.26f;
                chisl = Math.asin(Math.pow(x, a)) + Math.acos(Math.pow(x, b));
		System.out.println("x = "+x+" y= "+chisl);
		
		//И для третьего значения так же и т.д (про циклы мы пока ничего не знаем)
		x=0.35f;
		chisl = Math.asin(Math.pow(x, a)) + Math.acos(Math.pow(x, b));
		System.out.println("x = "+x+" y= "+chisl);
                
                x=0.41f;
		chisl = Math.asin(Math.pow(x, a)) + Math.acos(Math.pow(x, b));
		System.out.println("x = "+x+" y= "+chisl);
                
                x=0.53f;
		chisl = Math.asin(Math.pow(x, a)) + Math.acos(Math.pow(x, b));
		System.out.println("x = "+x+" y= "+chisl);
	}
}
