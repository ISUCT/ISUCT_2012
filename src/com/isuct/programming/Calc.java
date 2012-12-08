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
        
        public Calc() {
	}
        public Calc(double aA, double aB, double aXn, double aDx, double aXk) {
		// Устанавливаем значения закрытых полей
		xn = aXn;
		dx = aDx;
		xk = aXk;
		a = aA;
		b = aB;
	}
        public double[][] taskB(double[] arrayX) {
		// Объявляем и инициализируем переменные
	   double chisl = 0;
	   double znamen = 0;
	   double y = 0;
		// Создаем 2мерный массив для хранения результатов
	   double[][] result = new double[2][arrayX.length];
	   int i = 0;
	   for (double x : arrayX) {
                if (x < 5) {
                    chisl =Math.pow(Math.log10(x), 2)*((Math.pow(a, 2))+x);
                    znamen = Math.sin(Math.pow(x, 2));
                    y = chisl / znamen;
                } else {
                    chisl=Math.pow((a+(b*x)), 2.5);
                    znamen =1.8+ Math.pow((Math.cos(a*x)),3);
                    y = chisl / znamen;
                    }  
                result[0][i] = x;
		result[1][i] = y;
		i++;
                   }
           return result;
                }
        
        
          public double[][] taskA() {
            
              double chisl = 0;
	      double znamen = 0;
	      double y = 0;
                
              int nElem = (int) Math.round(((xk-xn)/dx+1));
              double[][] result = new double[2][nElem];
	      int i=0;
		
              for (double x = xn; x < xk; x += dx) {
                   if (x < 5) {
                      chisl =Math.pow(Math.log10(x), 2)*((Math.pow(a, 2))+x);
                      znamen = Math.sin(Math.pow(x, 2));
                      y = chisl / znamen;
                   } else {
                      chisl=Math.pow((a+(b*x)), 2.5);
                      znamen =1.8+ Math.pow((Math.cos(a*x)),3);
                      y = chisl / znamen;
                  }
                   result[0][i]=x;
		   result[1][i]=y;
		   i++;
		}
	       return result;
	}
                
                
               public double[][] taskA(double a, double b, double xn, double dx, double xk) {
                    double chisl = 0;
		    double znamen = 0;
		    double y = 0;
                    
                    int nElem = (int) Math.round(((xk-xn)/dx+1));
		    double[][] result = new double[2][nElem];
		    int i=0;
		    for (double x = xn; x < xk; x += dx) {
                    
                    if (x < 5) {
                       chisl =Math.pow(Math.log10(x), 2)*((Math.pow(a, 2))+x);
                       znamen = Math.sin(Math.pow(x, 2));
                       y = chisl / znamen;
                    } else {
                       chisl=Math.pow((a+(b*x)), 2.5);
                       znamen =1.8+ Math.pow((Math.cos(a*x)),3);
                       y = chisl / znamen;
                         }
               result[0][i]=x;
	       result[1][i]=y;
	       i++;
                        }
	     return result;
	}
                }




