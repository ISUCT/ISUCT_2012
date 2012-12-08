package com.isuct.programming;



public class HelloWorld {

	   public static void main(String[] args) {
		// создаем классику
		Bike Yupiter = new Bike(2200,810,1300);
		Yupiter.setPosition(0, 0);
		Yupiter.setFuelLevel(7);
		Yupiter.setRashod(2);
		if (Yupiter.move("x", 100)) {
			System.out.println("Yupiter Новые координаты теперь х= "+ Yupiter.getCoords()[0] + " y= " + Yupiter.getCoords()[1]);

} else {
			System.out.println("Yupiter Не хватит топлива");
		}
                if (Yupiter.move("y", 9)) {
			System.out.println("Yupiter Новые координаты теперь х= "
					+ Yupiter.getCoords()[0] + " y= " + Yupiter.getCoords()[1]);

    
                } else {
			System.out.println("Ypiter Не хватит топлива");
		}
		System.out.println("Yupiter Проверим координаты х= " + Yupiter.getCoords()[0]
				+ " y= " + Yupiter.getCoords()[1]);
                
                Bike Voshod= new Bike(2100,900,1100,2,3);
		Voshod.setPosition(0, 0);
		Voshod.setFuelLevel(30);
                Voshod.setRashod(3);
		if (Yupiter.move("y", 14)) {
			System.out.println("Voshod Новые координаты теперь х= "
					+ Yupiter.getCoords()[0] + " y= " + Yupiter.getCoords()[1]);
		} else {
                    System.out.println("Voshod Не хватит топлива");
		}

		if (Yupiter.move("y", 7)) {
			System.out.println("Voshod Новые координаты теперь х= "
					+ Yupiter.getCoords()[0] + " y= " + Yupiter.getCoords()[1]);
		} else {
			System.out.println("Voshod Не хватит топлива");




}
    
    }
}