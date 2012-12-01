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
       Mouse SAMSUNG = new Mouse(1,1,5);
       SAMSUNG.setPosition(0, 0);
       SAMSUNG.setElektro(15);
       
       if (SAMSUNG.move("x", 100)) {
			System.out.println("SAMSUNG Новые координаты теперь х= "
					+ SAMSUNG.getCoords()[0] + " y= " + SAMSUNG.getCoords()[1]);
		} else {
			System.out.println("SAMSUNG Не хватит энергии");
		}

		if (SAMSUNG.move("y", 500)) {
			System.out.println("SAMSUNG Новые координаты теперь х= "
					+ SAMSUNG.getCoords()[0] + " y= " + SAMSUNG.getCoords()[1]);
		} else {
			System.out.println("SAMSUNG Не хватит энергии");
		}
		System.out.println("SAMSUNG Проверим координаты х= " + SAMSUNG.getCoords()[0]
				+ " y= " + SAMSUNG.getCoords()[1]);
                
                Mouse TECH = new Mouse(1, 1, 5,2,3,0XFFFF);
		TECH.setPosition(0, 0);
		TECH.setElektro(20);	
		if (SAMSUNG.move("y", 100)) {
			System.out.println("TECH Новые координаты теперь х= "
					+ SAMSUNG.getCoords()[0] + " y= " + SAMSUNG.getCoords()[1]);
		} else {
			System.out.println("TECH Не хватит энергии");
		}

		if (SAMSUNG.move("y", 100)) {
			System.out.println("TECH Новые координаты теперь х= "
					+ SAMSUNG.getCoords()[0] + " y= " + SAMSUNG.getCoords()[1]);
		} else {
			System.out.println("TECH Не хватит энергии");
		}

        
    }
} 

