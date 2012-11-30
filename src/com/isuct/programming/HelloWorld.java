package com.isuct.programming;

public class HelloWorld {


	public static void main(String [] args){
        double xn = 0.11f;
        double xk = 0.36;
        double dx = 0.05;
        double y = 0;
        for (double x = 0.11; x <= 0.36; x = (x + 0.05)) {
            y = (Math.pow(Math.sin(x),3)+(Math.pow(Math.cos(x),3))*Math.log10(x));
                    System.out.println("x=" + x + "y=" + y);

            Calc defaultConstr = new Calc(0.2, 0.3, 0.38, 0.43, 0.57);
            System.out.println("------------Решаем задачу В------------");
            defaultConstr.taskB(0.2,0.3);
            System.out.println("------------Решаем задачу A —----------");
            defaultConstr.taskA(0.2, 0.3, 0.38, 0.43, 0.57);
            System.out.println("------------Решаем задачу A с перегруженным конструктором------------");
            Calc nDefConstr = new Calc(0.2, 0.3, 0.38, 0.43, 0.57);
            nDefConstr.taskA();

        }
    }
}