package com.isuct.programming;

public class MHelloWorld {


	public static void main(String [] args){
		//Решим задачи А и задачу B с использованием внешнего класса Calc
		//Сперва используем конструктор по умолчанию
		Calc defaultConstr = new Calc();
		System.out.println("------------Решаем задачу В------------");
		defaultConstr.taskB();
		System.out.println("------------Решаем задачу A ------------");
		defaultConstr.taskA(1.6,1.2,0.5,3.7);
		//Решим задачу А - с использованием перегруженного конструктора
		System.out.println("------------Решаем задачу A с перегруженным конструктором------------");
		Calc nDefConstr = new Calc(1.6,1.2,0.5,3.7);
		//тогда мы можем вызвать метод без передачи дополнительных параметров
		nDefConstr.taskA();
		}
}
