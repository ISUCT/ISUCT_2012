package com.isuct.programming;

public class HelloWorld {

	
	public static void main(String [] args){
		//Объявляем и инициализируем переменные
		float x = 2.2f; 
		float a = 2.0f;
		float b = 0.95f;
                float e = 2.7f;
		//вычисляем числитель Math.pow(число, степень)
		double chisl;
                chisl = 1 + Math.pow(Math.log10(x/2),2);
		//вычисляем знаменатель Логарифм числа по основанию = (натуральный логарифм числа)/ (натуральный логарифм основания)
		double znamen = b - Math.pow(e ,x/a);
		//вычисляем y
		double y = chisl/znamen;
		//Выводим результат
		System.out.println("Икс равен = "+x+" Игрек равен = "+y);
		
		
		x=3.78f;
		chisl = 1 + Math.pow(Math.log10(x/2),2);
		znamen = b - Math.pow(e ,x/a);
		y = chisl/znamen;
		System.out.println("X = "+x+" Y = "+y);
		
		//И для третьего значения так же и т.д (про циклы мы пока ничего не знаем)
		x=4.51f;
		chisl = 1 + Math.pow(Math.log10(x/2),2);
		znamen = b - Math.pow(e ,x/a);
		y = chisl/znamen;
		System.out.println("Дано = "+x+" Посчитано = "+y);
                
                x=6.58f;
		chisl = 1 + Math.pow(Math.log10(x/2),2);
		znamen = b - Math.pow(e ,x/a);
		y = chisl/znamen;
		System.out.println("Дано = "+x+" Посчитано = "+y);
                
                x=1.2f;
		chisl = 1 + Math.pow(Math.log10(x/2),2);
		znamen = b - Math.pow(e ,x/a);
		y = chisl/znamen;
		System.out.println("Дано = "+x+" Посчитано = "+y);
	}
}
