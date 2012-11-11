package com.isuct.programming;

public class HelloWorld {

    public static void main(String[] args) {
        double xn = 1.2f;
        double xk = 5.2;
        double dx = 0.8;
        float a = 4.1f;
        float b = 2.7f;
        for (double x = 1.2; x <= 5.2; x = (x + 0.8)) {
            double chisl = (a) * Math.pow((x), (1 / 2)) - (b) * Math.log(x) / Math.log(5);
            double znamen = Math.log(x - 1) / Math.log(10);
            double y = chisl / znamen;
            System.out.println("Икс равен = " + x + " Игрек равен = " + y);

            Calc defaultConstr = new Calc(1.9, 2.15, 2.34, 2.73, 3.16);
            System.out.println("------------Решаем задачу В------------");
            defaultConstr.taskB();
            System.out.println("------------Решаем задачу A —----------");
            defaultConstr.taskA(1.9, 2.15, 2.34, 2.73, 3.16);
            System.out.println("------------Решаем задачу A с перегруженным конструктором------------");
            Calc nDefConstr = new Calc(1.9, 2.15, 2.34, 2.73, 3.16);
            nDefConstr.taskA();

        }
    }
}
