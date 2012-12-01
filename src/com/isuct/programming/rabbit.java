package com.isuct.programming;

public class HelloWorld {

	public static void main(String[] args) {
		// создаем кролика Сёму
		rabbit Sema = new rabbit(300, 50, 550, 600, 4, 250, 4);
		Sema.setPosition(0, 0);
		Sema.setfoodLevel(20);
		Sema.setRashod(8);

		System.out.println("Кролик Сёма: уровень еды = 20");

		if (Sema.move("x", 100)) {
			System.out.println("Сёма: Новые координаты теперь х= "
					+ Sema.getCoords()[0] + " y= " + Sema.getCoords()[1]);
		} else {
			System.out.println("Сёме: Не хватит уровня еды");
		}

		if (Sema.move("y", 500)) {
			System.out.println("Сёма: Новые координаты теперь х= "
					+ Sema.getCoords()[0] + " y= " + Sema.getCoords()[1]);
		} else {
			System.out.println("Сёма: Не хватит уровня еды");
		}
		System.out.println("Сёма Проверим координаты х= "
				+ Sema.getCoords()[0] + " y= " + Sema.getCoords()[1]);

		// создаем кролика Васю
		Rabbit Vasya = new Rabbit(320, 50, 500, 620, 4, 250, 7);
		Vasya.setPosition(0, 0);
		Vasya.setfoodLevel(90);
		Vasya.setRashod(8);

		System.out.println("Кролик Вася: уровень еды = 90");

		if (Vasya.move("y", 100)) {
			System.out.println("Вася Новые координаты теперь х= "
					+ Vasya.getCoords()[0] + " y= " + Vasya.getCoords()[1]);
		} else {
			System.out.println("Вася Не хватит уровня еды");
		}

		if (Vasya.move("y", 100)) {
			System.out.println("Вася Новые координаты теперь х= "
					+ Vasya.getCoords()[0] + " y= " + Vasya.getCoords()[1]);
		} else {
			System.out.println("Вася Не хватит уровня еды");
		}
	}

}