package com.isuct.programming;

public class Traktor {

	public static void main(String[] args) {
		Car Traktor = new Car(8000, 2400, 5800);
		Traktor.setPosition(0, 0);
		Traktor.setFuelLevel(20);
		Traktor.setRashod(8);
		if (Traktor.move("x", 100)) {
			System.out.println("Traktor Новые координаты теперь х= "
					+ Traktor.getCoords()[0] + " y= " + Traktor.getCoords()[1]);
		} else {
			System.out.println("Traktor Не хватит топлива");
		}

		if (Traktor.move("y", 500)) {
			System.out.println("Traktor Новые координаты теперь х= "
					+ Traktor.getCoords()[0] + " y= " + Traktor.getCoords()[1]);
		} else {
			System.out.println("Traktor Не хватит топлива");
		}
		System.out.println("Traktor Проверим координаты х= " + Traktor.getCoords()[0]
				+ " y= " + Traktor.getCoords()[1]);

		
		Car Kombayn= new Car(3000, 1400, 1800,4,5,5);
		Kombayn.setPosition(0, 0);
		Kombayn.setFuelLevel(30);
		Kombayn.setRashod(5);
		if (Kombayn.move("y", 100)) {
			System.out.println("Kombayn Новые координаты теперь х= "
					+ Traktor.getCoords()[0] + " y= " + Traktor.getCoords()[1]);
		} else {
			System.out.println("Kombayn Не хватит топлива");
		}

		if (Traktor.move("y", 100)) {
			System.out.println("Kombayn Новые координаты теперь х= "
					+ Traktor.getCoords()[0] + " y= " + Traktor.getCoords()[1]);
		} else {
			System.out.println("Kombayn Не хватит топлива");
		}

		
	}
}