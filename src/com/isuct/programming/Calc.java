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
	private double xn;
	private double dx;
	private double xk;
	private double a;
	private double b;
	
	public Calc(){

	}
	
	public Calc(double aA, double aB,double aXn,double aDx, double aXk){
		xn=aXn;
		dx=aDx;
		xk=aXk;
		a=aA;
		b=aB;
	}
	/**
	 * Решение задачи B
	 */
	public void taskB(double aA, double aB){
		double chisl;
		double znamen ;
		double y;
		double[] Xarray = new double[]{1.0,1.3,1.6,1.9,2.1,2.3,7.1,8.5,9.9};
		for (double x : Xarray) {
			if (x < 5) {
		chisl = Math.pow(Math.log10(x), 2)*((Math.pow(a, 2))+x);
                znamen = Math.pow((x+a), 2);
                y = chisl / znamen;
        
        
                  /*Для второго уравнения системы.*/
                }else{
               chisl=Math.pow((a+(b*x)), 2.5);
               znamen=1.8+ Math.pow((Math.cos(a*x)),3);
               y = chisl / znamen;
              

          }    
                 System.out.println("x=" + x + "y=" + y);
		}
	}

	/**
	 * Решение задачи А
	 */
	public void taskA(){
		
		double chisl;
		double znamen;
		double y;
		for(double x=xn;x<=xk;x+=dx){
		    if(x<5){
            chisl = Math.pow(Math.log10(x), 2)*((Math.pow(a, 2))+x);
            znamen = Math.pow((x+a), 2);
            y = chisl / znamen;
        
        
                  /*Для второго уравнения системы.*/
       }else{
               chisl=Math.pow((a+(b*x)), 2.5);
               znamen=1.8+ Math.pow((Math.cos(a*x)),3);
               y = chisl / znamen;
              
          }    
        System.out.println("x=" + x + "y=" + y);
    
		}
	}
	
	public void taskA(double a, double b,double xn,double dx, double xk){
		//Объявляем и инициализируем переменные
		double chisl;
		double znamen;
		double y;
		for(double x=xn;x<=xk;x+=dx){
		    if(x<5){
			chisl = Math.pow(Math.log10(x), 2)*((Math.pow(a, 2))+x);
               znamen = Math.pow((x+a), 2);
               y = chisl / znamen;
        
        
                  /*Для второго уравнения системы.*/
       }else{
               chisl=Math.pow((a+(b*x)), 2.5);
               znamen=1.8+ Math.pow((Math.cos(a*x)),3);
               y = chisl / znamen;
              
          }    
        System.out.println("x=" + x + "y=" + y);
    
		}
	}

}
