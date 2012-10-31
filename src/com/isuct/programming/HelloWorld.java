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
	public static void main(String[] args) {
      		float x = 4.48f; 
		float a = 0.4f;
		float b = 0.8f;
                
                for(double Xn=3.2;Xn<=6.2;Xn+=0.6){
                                    
                
		//вычисляем числитель Math.pow(число, степень)
		double chisl = Math.pow(a,Xn)-Math.pow(b,Xn);
		//вычисляем знаменатель Логарифм числа по основанию = (натуральный логарифм числа)/ (натуральный логарифм основания)
		double znamen = Math.log10(a/b);
		//вычисляем y
                double mnojitel = Math.pow(a*b,1/3f);
		double y = chisl/znamen*mnojitel;
		//Выводим результат
		System.out.println("Икс равен = "+Xn+" Игрек равен = "+y);
                } 
               
              		
	       //x=3.56f;
               //hisl = Math.pow(a,x)-Math.pow(b,x);
             // znamen = Math.log10(a/b);
              //mnojitel = Math.pow(a*b,1/3f);
            //  y = chisl/znamen*mnojitel;
            //  System.out.println("Икс равен = "+x+" Игрек равен = "+y);
                
              //x=2.78f;
             // chisl = Math.pow(a,x)-Math.pow(b,x);
              //znamen = Math.log10(a/b);
             // mnojitel = Math.pow(a*b,1/3f);
             // y = chisl/znamen*mnojitel;
             // System.out.println("Икс равен = "+x+" Игрек равен = "+y);
                
              //x=5.28f;
             // chisl = Math.pow(a,x)-Math.pow(b,x);
             // znamen = Math.log10(a/b);
             // mnojitel = Math.pow(a*b,1/3f);
             // y = chisl/znamen*mnojitel;
             // System.out.println("Икс равен = "+x+" Игрек равен = "+y);
                
            //  x=3.21f;
           //   chisl = Math.pow(a,x)-Math.pow(b,x);
           //   znamen = Math.log10(a/b);
           //   mnojitel = Math.pow(a*b,1/3f);
           //   y = chisl/znamen*mnojitel;
            // System.out.println("Икс равен = "+x+" Игрек равен = "+y);
	
	}
}
    
