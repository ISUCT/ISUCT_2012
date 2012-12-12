package com.isuct.programming;

public class HelloWorld {

    public static void main(String[] args) {

        Calc defaultConstr = new Calc();
        System.out.println("------------Решаем задачу В------------");
        double taskB[][] = defaultConstr.taskB(new double[]{0.25, 0.36,0.56,0.94, 1.28});
        for (int i = 0; i < taskB[0].length; i++) {
            System.out.println("X= " + taskB[0][i] + " Y= " + taskB[1][i]);
        }

        System.out.println("------------Решаем задачу A ------------");
        double taskA[][] = defaultConstr.taskA(1.2, 0.48, 0.7, 0.3, 2.2);
        for (int i = 0; i < taskA[0].length; i++) {
            System.out.println("X= " + taskA[0][i] + " Y= " + taskA[1][i]);
        }

        System.out.println("------------Решаем задачу A с перегруженным конструктором------------");
        Calc nDefConstr = new Calc(1.2, 0.48, 0.7, 0.3, 2.2);

        double taskA1[][] = nDefConstr.taskA();
        for (int i = 0; i < taskA1[0].length; i++) {
            System.out.println("X= " + taskA1[0][i] + " Y= " + taskA1[1][i]);
        }


    }
}
