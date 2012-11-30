package com.isuct.programming;

public class HelloWorld {

public static void main(String[] args) {
		// создаем собаку Барон
		dog Baron = new dog(100, 20, 4, 500, 3);
		Baron.setPosition(0, 0);
		Baron.setSleepLevel(10);
		Baron.setRashod(7);
		if (Baron.move("x", 80)) {
			System.out.println("Baron Новые координаты теперь х= "
					+ Baron.getCoords()[0] + " y= " + Baron.getCoords()[1]);
		} else {
			System.out.println("Baron Не хватит уровня сна");
		}

		if (Baron.move("y", 200)) {
			System.out.println("Baron Новые координаты теперь х= "
					+ Baron.getCoords()[0] + " y= " + Baron.getCoords()[1]);
		} else {
			System.out.println("Baron Не хватит уровня еды");
		}
		System.out.println("Dak Проверим координаты х= "
				+ Baron.getCoords()[0] + " y= " + 
Baron.getCoords()[1]);

		// создаем собаку Чапа
		dog Chapa = new dog(130, 15, 4, 400, 2);
		Chapa.setPosition(0, 0);
		Chapa.setSleepLevel(20);
		Chapa.setRashod(9);

		if (Chapa.move("y", 90)) {
			System.out.println("Chapa Новые координаты теперь х= "
					+Chapa.getCoords()[0] + " y= " + Chapa.getCoords()[1]);
		} else {
			System.out.println("Chapa Не хватит уровня сна");
		}

		if (Chapa.move("y", 90)) {
			System.out.println("Chapa Новые координаты теперь х= "
					+ Chapa.getCoords()[0] + " y= " + Chapa.getCoords()[1]);
		} else {
			System.out.println("Chapa Не хватит уровня сна");
		}
	}

}
