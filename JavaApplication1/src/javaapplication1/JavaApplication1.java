/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Admin
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calc defaultConstr = new Calc(2,0.95,1.25,0.3,2.75);
		System.out.println("Решаем задачу В");
		defaultConstr.taskB(2.0,0.95);
		System.out.println("Решаем задачу A");
		defaultConstr.taskA(2,0.95,1.25,0.3,2.75);
		System.out.println("Решаем задачу A с перегруженным конструктором");
		Calc nDefConstr = new Calc(2,0.95,1.25,0.3,2.75);
		nDefConstr.taskA();
		}
}
   
