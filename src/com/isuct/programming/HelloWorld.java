
package com.isuct.programming;


public class HelloWorld{

      public static void main(String[] args) {
              		

		Calc defaultConstr = new Calc(-2.5,3.4,3.5,0.6,6.5);
		System.out.println("-Решаем задачу В-");
		double taskB[][]=defaultConstr.taskB(new double[]{0.1,0.3,0.5,0.8,2.8,5.4,8});
		for (int i=0;i<taskB[0].length;i++){
			System.out.println("X= "+taskB[0][i]+" Y= "+ taskB[1][i]);
		}

		System.out.println("-Решаем задачу A -");
		double taskA[][]=defaultConstr.taskA(-2.5,3.4,3.5,0.6,6.5);
		for (int i=0;i<taskA[0].length;i++){
			System.out.println("X= "+taskA[0][i]+" Y= "+ taskA[1][i]);
		}
		
		System.out.println("-Решаем задачу A с перегруженным конструктором-");
		Calc nDefConstr = new Calc(1.1,2.0,1,0.5,7);
		//тогда мы можем вызвать метод без передачи дополнительных параметров
		double taskA1[][]=nDefConstr.taskA(-2.5,3.4,3.5,0.6,6.5);
		for (int i=0;i<taskA1[0].length;i++){
			System.out.println("X= "+taskA1[0][i]+" Y= "+ taskA1[1][i]);
		}

	}
}