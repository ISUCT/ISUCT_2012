/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isuct.programming;

/**
 *
 * @author User
 */
public class HelloWorld{

      public static void main(String [] args){
		Calc defaultConstr = new Calc(-2.5,3.4,3.5,0.6,6.5);
		System.out.println("------------Решаем задачу В------------");
		defaultConstr.taskB(-2.5,3.4);
		System.out.println("------------Решаем задачу A ------------");
		defaultConstr.taskA(-2.5,3.4,3.5,0.6,6.5);
		System.out.println("------------Решаем задачу A с перегруженным конструктором------------");
		Calc nDefConstr = new Calc(-2.5,3.4,3.5,0.6,6.5);
		nDefConstr.taskA();
		}
}