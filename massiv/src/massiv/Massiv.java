/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package massiv;

/**
 *
 * @author Alexandra
 */
public class Massiv {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calc defaultConstr = new Calc();
        System.out.println("------------Решаем задачу В------------");
        double taskB[][] = defaultConstr.taskB(new double[]{0.9, 1.2, 1.5, 2.3});
        for (int i = 0; i < taskB[0].length; i++) {
            System.out.println("X= " + taskB[0][i] + " Y= " + taskB[1][i]);
        }

        System.out.println("------------Решаем задачу A ------------");
        double taskA[][] = defaultConstr.taskA(0.2, 0.4, 2.2);
        for (int i = 0; i < taskA[0].length; i++) {
            System.out.println("X= " + taskA[0][i] + " Y= " + taskA[1][i]);
        }

        System.out.println("------------Решаем задачу A с перегруженным конструктором------------");
        Calc nDefConstr = new Calc(0.2, 0.4, 2.2);


        double taskA1[][] = nDefConstr.taskA();
        for (int i = 0; i < taskA1[0].length; i++) {
            System.out.println("X= " + taskA1[0][i] + " Y= " + taskA1[1][i]);
        }
    }
}