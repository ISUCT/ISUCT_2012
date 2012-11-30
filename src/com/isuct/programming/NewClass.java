package com.isuct.programming;

import com.isuct.programming.Car;

public class NewClass {

	public static void main(String[] args) {
		// создаем классику
		Car nikolardigo = new Car(3000, 1400, 1800);
		nikolardigo.setPosition(0, 0);
		nikolardigo.setFuelLevel(20);
		nikolardigo.setRashod(8);
		if (nikolardigo.move("x", 100)) {
			System.out.println("2107 Новые координаты теперь х= "
					+ nikolardigo.getCoords()[0] + " y= " + nikolardigo.getCoords()[1]);
		} else {
			System.out.println("2107 Не хватит топлива");
		}

		if (nikolardigo.move("y", 500)) {
			System.out.println("2107 Новые координаты теперь х= "
					+ nikolardigo.getCoords()[0] + " y= " + nikolardigo.getCoords()[1]);
		} else {
			System.out.println("2107 Не хватит топлива");
		}
		System.out.println("2107 Проверим координаты х= " + nikolardigo.getCoords()[0]
				+ " y= " + nikolardigo.getCoords()[1]);

		
		Car ladaLargus= new Car(3000, 1400, 1800,4,5,5);
		ladaLargus.setPosition(0, 0);
		ladaLargus.setFuelLevel(30);
		ladaLargus.setRashod(5);
		if (nikolardigo.move("y", 100)) {
			System.out.println("Largus Новые координаты теперь х= "
					+ nikolardigo.getCoords()[0] + " y= " + nikolardigogetCoords()[1]);
		} else {
			System.out.println("Largus Не хватит топлива");
		}

		if (nikolardigo.move("y", 100)) {
			System.out.println("Largus Новые координаты теперь х= "
					+ nikolardigo.getCoords()[0] + " y= " + nikolardigo.getCoords()[1]);
		} else {
			System.out.println("Largus Не хватит топлива");
		}

		
	}
}
