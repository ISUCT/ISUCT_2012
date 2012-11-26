package com.isuct.programming;

public class HelloWorld {


	public static void main(String [] args){
		//Решим задачи А и задачу B с использованием внешнего класса Calc
		//Сперва используем конструктор по умолчанию
		Calc defaultConstr = new Calc();
		System.out.println("------------Решаем задачу В------------");
		defaultConstr.taskB();
		System.out.println("------------Решаем задачу A ------------");
		defaultConstr.taskA(0.08,0.26,0.35,0.41,0.53);
		//Решим задачу А - с использованием перегруженного конструктора
		System.out.println("------------Решаем задачу A с перегруженным конструктором------------");
		Calc nDefConstr = new Calc(0.08,0.26,0.35,0.41,0.53);
		//тогда мы можем вызвать метод без передачи дополнительных параметров
		nDefConstr.taskA();
		}
}
