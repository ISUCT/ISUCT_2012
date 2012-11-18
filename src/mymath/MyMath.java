/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mymath;

/**
 *
 * @author SAMSUNG
 */
        public class MyMath {
        public static void main(String[] args) {
        
        Calc myCalc=new Calc(0.2,0.4,2.2);
        System.out.println("-----Решаем задачу A-----");
        myCalc.taskA(0.2,0.4,2.2);
        System.out.println("-----Решаем задачу B-----");
        myCalc.taskB();
        System.out.println("---Решаем задачу А с перегруженным конструктором---");
        myCalc.taskA();
      
    }
}
