/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isuct.programming;

/**
 *
 * @author Stud_5
 */
public class Calc {
    
private double xn ;
	private double dx;
	private double xk;
	private double a;
	private double b;
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
	public Calc(double aA, double aB,double aXn,double aDx, double aXk){
		//Устанавливаем значения закрытых полей
		xn=aXn;
		dx=aDx;
		xk=aXk;
		a=aA;
		b=aB;
	/**
	 * Решение задачи B
	 */
 	public void taskB(){
		// Объявляем и инициализируем переменные
            public static void main(String[] args){
float x = 0.2f;
float a = 0.1f;
float b = 0.5f;
double chisl;
chisl= a+Math.pow(Math.tan(b*x),2);
double znamen;
znamen= b+Math.pow(Math.tan(a*x),2);
double y=chisl/znamen;
System.out.println("X = "+x+" Y = "+y);

x=0.3f;
chisl= a+Math.pow(Math.tan(b*x),2);
znamen= b+Math.pow(Math.tan(a*x),2);
y=chisl/znamen;
System.out.println("X = "+x+" Y = "+y);

x=0.44f;
chisl= a+Math.pow(Math.tan(b*x),2);
znamen= b+Math.pow(Math.tan(a*x),2);
y=chisl/znamen;
System.out.println("X = "+x+" Y = "+y);

x=0.6f;
chisl= a+Math.pow(Math.tan(b*x),2);
znamen= b+Math.pow(Math.tan(a*x),2);
y=chisl/znamen;
System.out.println("X = "+x+" Y = "+y);

x=0.56f;
chisl= a+Math.pow(Math.tan(b*x),2);
znamen= b+Math.pow(Math.tan(a*x),2);
y=chisl/znamen;
System.out.println("X = "+x+" Y = "+y);
}

	/**
	 * Решение задачи А
	 */
	public void taskA(){

}
public static void main(String[] args) {

float a = 0.1f;
float b = 0.5f;

float Xn = 0.15f;
float Xk = 1.37f;
float dX = 0.25f;
float y;
 for(double x=0.15;x<=1.37;x=(x+0.25)){             
            y=(float) (a+Math.pow(Math.tan(b*x),2)/ b+Math.pow(Math.tan(a*x),2));            
            System.out.println("x=" + x + "y=" + y);	
        }	
    }
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
	public void taskA(double а, double b,double xn,double dx, double xk){
	
}