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
		
    float x=0.1f;
    double y;
    y=Math.acos(x);
    System.out.println("x="+x+" y="+y);
    
    x=0.9f;
    y=Math.acos(x);
    System.out.println("x="+x+" y="+y);
   
    x=1.2f;
    y = Math.pow((1.2),(x))-Math.pow((x),(1.2));
      System.out.println("x="+x+" y="+y);
       
    x=1.5f;
    y = Math.pow((1.2),(x))- Math.pow((x),(1.2));
    System.out.println("x="+x+" y="+y);
      
    x=2.3f;
    y = Math.pow((1.2),(x))- Math.pow((x),(1.2));
    System.out.println("x="+x+" y="+y);
    }

}
