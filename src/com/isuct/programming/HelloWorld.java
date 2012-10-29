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
		float x = 1.25f; 
		float a = 1.1f;
		float b = 2.0f;
		//вычисляем числитель Math.pow(число, степень)
		double chisl = Math.pow(x, 2) + Math.pow((x+b), (1/3f));
		//вычисляем знаменатель Логарифм числа по основанию = (натуральный логарифм числа)/ (натуральный логарифм основания)
		double znamen = Math.log(a+x)/Math.log(2);
		//вычисляем y
		double y = chisl/znamen;
		//Выводим результат
		System.out.println("Икс равен = "+x+" Игрек равен = "+y);
		
		//повторяем вычисления для второго значения х, но следует помнить. что переменные мы уже объявляли
		//повторно их объявлять не надо, а надо только присвоить новые значени		
		
		x=2.5f;
		chisl = Math.pow(x, 2) + Math.pow((x+b), (1/3f));
		znamen = Math.log(a+x)/Math.log(2);
		y = chisl/znamen;
		System.out.println("X = "+x+" Y = "+y);
		
		//И для третьего значения так же и т.д (про циклы мы пока ничего не знаем)
		x=3.7f;
		chisl = Math.pow(x, 2) + Math.pow((x+b), (1/3f));
		znamen = Math.log(a+x)/Math.log(2);
		y = chisl/znamen;
		System.out.println("Дано = "+x+" Посчитано = "+y);	
        }
                float a = 1.1f;
		float b = 0.09f;
{               float x = 1.21f;
         double chisl = Math.log(Math.pow(x, 2))-1;
         double znam1 = (Math.pow(x, 2)*a)-b;
         double znam = Math.log(znam1)/Math.log(5);
         double y = chisl/znam;
    System.out.println("X = "+x+" Y = "+y);}
{               float x = 1.76f;
double chisl = Math.log(Math.pow(x, 2))-1;
         double znam1 = (a*=Math.pow(x, 2))-b;
         double znam = Math.log(znam1)/Math.log(5);
         double y = chisl/znam;
    System.out.println("X = "+x+" Y = "+y);}
{               float x = 2.53f;
         double chisl = Math.log(Math.pow(x, 2))-1;
         double znam1 = (Math.pow(x, 2)*a)-b;
         double znam = Math.log(znam1)/Math.log(5);
         double y = chisl/znam;
   System.out.println("X = "+x+" Y= "+y);}
{               float x = 3.48f;
        double chisl = Math.log(Math.pow(x, 2))-1;
        double znam1 = (Math.pow(x, 2)*a)-b;
        double znam = Math.log (znam1)/Math.log(5);
        double y = chisl/znam;
   System.out.println("X = "+x+" Y= "+y);}
{               float x = 4.52f;
        double chisl = Math.log(Math.pow(x, 2))-1;
        double znam1 = (Math.pow(x, 2)*a)-b;
        double znam = Math.log(znam1)/Math.log(5);
        double y = chisl/znam;
   System.out.println("X = "+x+" Y= "+y);
}
}