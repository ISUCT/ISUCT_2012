package com.isuct.programming;

public class HelloWorld {

    
    public static void main(String[] args) {

        Calc defaultConstr = new Calc(1.2, 0.48, 0.7, 0.3, 2.2);
        System.out.println("------------Решаем задачу В------------");
        defaultConstr.taskB(1.2, 0.48, 0.7, 0.3, 2.2);
        System.out.println("------------Решаем задачу A ------------");
        defaultConstr.taskA(1.2, 0.48, 0.7, 0.3, 2.2);
        System.out.println("------------Решаем задачу A с перегруженным конструктором------------");
        Calc nDefConstr = new Calc(1.2, 0.48, 0.7, 0.3, 2.2);

    }
}