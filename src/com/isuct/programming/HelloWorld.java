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

	 /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        // TODO code application logic here
    Calc defaultConstr = new Calc(2,0.95,1.25,0.3,2.75);
    System.out.println("------------Решаем задачу В------------");
    double taskB[][]=defaultConstr.taskB(new double[]{0.1,0.3,0.5,0.8,2.8,5.4,8});
    for (int i=0;i<taskB[0].length;i++){
    System.out.println("X= "+taskB[0][i]+" Y= "+ taskB[1][i]);
    }
    System.out.println("------------Решаем задачу A ------------");
    double taskA[][]=defaultConstr.taskA(2,0.95,1.25,0.3,2.75);
    for (int i=0;i<taskA[0].length;i++){
    System.out.println("X= "+taskA[0][i]+" Y= "+ taskA[1][i]);
        }
    System.out.println("------------Решаем задачу A с перегруженным конструктором------------");
    Calc nDefConstr = new Calc(2,0.95,1.25,0.3,2.75);
    double taskA1[][]=nDefConstr.taskA();
    for (int i=0;i<taskA1[0].length;i++){
    System.out.println("X= "+taskA1[0][i]+" Y= "+ taskA1[1][i]);
    }
	}
}
   
