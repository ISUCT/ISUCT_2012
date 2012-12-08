package com.isuct.programming;

public class HelloWorld {

	public static void main(String[] args) {
		// создаем кролика Степана
		rabbit Stepan = new rabbit(200, 100, 120, 400, 4, 190, 3);
		Stepan.setPosition(0, 0);
		Stepan.setfoodLevel(30);
		SStepan.setRashod(8);

		System.out.println("Кролик Степан: уровень еды = 30");

		if (Stepan.move("x", 100)) {
			System.out.println("Степан: Новые координаты теперь х= "
					+ Stepan.getCoords()[0] + " y= " + Stepan.getCoords()[1]);
		} else {
			System.out.println("Степан: Хочет кушать");
		}

		if (Stepan.move("y", 400)) {
			System.out.println("Степан: Новые координаты теперь х= "
					+ Stepan.getCoords()[0] + " y= " + Stepan.getCoords()[1]);
		} else {
			System.out.println("Степан: Хочет кушать");
		}
		System.out.println("Степан Проверим координаты х= "
				+ Stepan.getCoords()[0] + " y= " + Stepan.getCoords()[1]);

		// создаем кролика Васю
		Rabbit Vasya = new Rabbit(300, 150, 150, 500, 4, 250, 4);
		Vasya.setPosition(0, 0);
		Vasya.setfoodLevel(90);
		Vasya.setRashod(8);

		System.out.println("Кролик Вася: уровень еды = 90");

		if (Vasya.move("y", 100)) {
			System.out.println("Вася Новые координаты теперь х= "
					+ Vasya.getCoords()[0] + " y= " + Vasya.getCoords()[1]);
		} else {
			System.out.println("Вася Хочет кушать");
		}

		if (Vasya.move("y", 100)) {
			System.out.println("Вася Новые координаты теперь х= "
					+ Vasya.getCoords()[0] + " y= " + Vasya.getCoords()[1]);
		} else {
			System.out.println("Вася Хочет кушать");
		}
	}

}