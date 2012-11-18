package com.isuct.programming;
public class HelloWorld {
    
        public static void main(String[] args) {                     
            
            Calc defaultConstr = new Calc();
            
            System.out.println("------------Решаем задачу В------------");
            defaultConstr.taskB();
            
            System.out.println("------------Решаем задачу A —----------");
            defaultConstr.taskA(2.25, 1.2, 0.3, 2.7);
            
            System.out.println("------------Решаем задачу A с перегруженным конструктором------------");
            Calc nDefConstr = new Calc(2.25, 1.2, 0.3, 2.7);
            nDefConstr.taskA();
                      
        }      
}

 