/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isuct.programming;

/**
 *
 * @author Семья
 */
public class Massiv {
  
    public static void main(String[] args) {
        Calc defaultConstr = new Calc();
        System.out.println("------------Решаем задачу В------------");
        double taskB[][] = defaultConstr.taskB(new double[]{1.1,2.4,3.6, 1.7, 3.9});
        for (int i = 0; i < taskB[0].length; i++) {
            System.out.println("X= " + taskB[0][i] + " Y= " + taskB[1][i]);
        }

        System.out.println("------------Решаем задачу A ------------");
        double taskA[][] = defaultConstr.taskA (2.5,1.28,3.28,0.4);
        for (int i = 0; i < taskA[0].length; i++) {
            System.out.println("X= " + taskA[0][i] + " Y= " + taskA[1][i]);
        }

        System.out.println("------------Решаем задачу A с перегруженным конструктором------------");
        Calc nDefConstr = new Calc (2.5,1.28,3.28,0.4);


        double taskA1[][] = nDefConstr.taskA();
        for (int i = 0; i < taskA1[0].length; i++) {
            System.out.println("X= " + taskA1[0][i] + " Y= " + taskA1[1][i]);
        }
}
        }
    