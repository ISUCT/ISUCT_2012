package com.isuct.programming;

import com.isuct.programming.cat;

public class HelloWorld {

	public static void main(String[] args) {
// создаем кошку Мусю
cat Musya = new cat(50, 20, 4, 300, 3);
Musya.setPosition(0, 0);
Musya.setSleepLevel(10);
Musya.setRashod(7);
if (Musya.move("x", 80)) {
System.out.println("Musya Новые координаты теперь х= "
+ Musya.getCoords()[0] + " y= " + Musya.getCoords()[1]);
} else {
System.out.println("Musya Не хватит уровня сна");
}

if (Musya.move("y", 200)) {
System.out.println("Musya Новые координаты теперь х= "
+ Musya.getCoords()[0] + " y= " + Musya.getCoords()[1]);
} else {
System.out.println("Musya Не хватит уровня еды");
}
System.out.println("Musya Проверим координаты х= "
+ Musya.getCoords()[0] + " y= " +
Musya.getCoords()[1]);

// создаем собаку Чапа
cat Mars = new cat(130, 15, 4, 400, 2);
Mars.setPosition(0, 0);
Mars.setSleepLevel(20);
Mars.setRashod(9);

if (Mars.move("y", 90)) {
System.out.println("Mars Новые координаты теперь х= "
+Mars.getCoords()[0] + " y= " + Mars.getCoords()[1]);
} else {
System.out.println("Mars Не хватит уровня сна");
}

if (Mars.move("y", 90)) {
System.out.println("Mars Новые координаты теперь х= "
+ Mars.getCoords()[0] + " y= " + Mars.getCoords()[1]);
} else {
System.out.println("Mars Не хватит уровня сна");
}
}
}
