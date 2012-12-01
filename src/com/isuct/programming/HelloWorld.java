
package com.isuct.programming;


public class HelloWorld{

      public static void main(String [] args){
			Raketa BlackBrant = new Raketa(27000, 5000, 20000);
		BlackBrant.setPosition(1, 2);
		BlackBrant.setFuelLevel(800);
		BlackBrant.setRashod(50);
                BlackBrant.setRezervtopliva(10);
		if (BlackBrant.move("x", 100)) {
			System.out.println("BlackBrant Новые координаты теперь х= "
					+ BlackBrant.getCoords()[0] + " y= " + BlackBrant.getCoords()[1]);
		} else {
			System.out.println("BlackBrant Не хватит топлива");
		}

		if (BlackBrant.move("y", 100)) {
			System.out.println("BlackBrant Новые координаты теперь х= "
					+ BlackBrant.getCoords()[0] + " y= " + BlackBrant.getCoords()[1]);
		} else {
			System.out.println("BlackBrant Не хватит топлива");
		}
		System.out.println("BlackBrant Проверим координаты х= " + BlackBrant.getCoords()[0]
				+ " y= " + BlackBrant.getCoords()[1]);


		Raketa Skylark= new Raketa(27000, 5000, 20000,0XFFFFFF,3,3);
		Skylark.setPosition(1, 1);
		Skylark.setFuelLevel(900);
		Skylark.setRashod(90);
                Skylark.setRezervtopliva(15);
                
		if (BlackBrant.move("y", 100)) {
			System.out.println("Skylark Новые координаты теперь х= "
					+ BlackBrant.getCoords()[0] + " y= " + BlackBrant.getCoords()[1]);
		} else {
			System.out.println("Skylark Не хватит топлива");
		}

		if (BlackBrant.move("y", 100)) {
			System.out.println("Skylark Новые координаты теперь х= "
					+ BlackBrant.getCoords()[0] + " y= " + BlackBrant.getCoords()[1]);
		} else {
			System.out.println("Skylark Не хватит топлива");
		}         

                if (BlackBrant.move("y",100)) {
			System.out.println("Skylark Новые координаты теперь х= "
					+ BlackBrant.getCoords()[0] + " y= " + BlackBrant.getCoords()[1]);
		} else {
			System.out.println("Skylark Не хватит топлива");
		}
              
                
                Raketa S= new Raketa(27000, 5000, 20000,0XFFFFFF,3,3);
		Skylark.setPosition(1, 1);
		Skylark.setFuelLevel(100);
		Skylark.setRashod(10);
                Skylark.setRezervtopliva(0);
                
		if (Skylark.move("y", 100)) {
			System.out.println("S Новые координаты теперь х= "
					+ Skylark.getCoords()[0] + " y= " + Skylark.getCoords()[1]);
		} else {
			System.out.println("S Не хватит топлива");
		}

                if (Skylark.move("y", 100)) {
			System.out.println("S Новые координаты теперь х= "
					+ Skylark.getCoords()[0] + " y= " + Skylark.getCoords()[1]);
		} else {
			System.out.println("S Не хватит топлива");
		}
                if (Skylark.move("y", 100)) {
			System.out.println("S Новые координаты теперь х= "
					+ Skylark.getCoords()[0] + " y= " + Skylark.getCoords()[1]);
		} else {
			System.out.println("S Не хватит топлива");
		}

                if (Skylark.move("y", 100)) {
			System.out.println("S Новые координаты теперь х= "
					+ Skylark.getCoords()[0] + " y= " + Skylark.getCoords()[1]);
		} else {
			System.out.println("S Не хватит топлива");
		}
                                
            	}
}
    