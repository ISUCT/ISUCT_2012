package com.isuct.programming;

public class HelloWorld {

    public static void main(String[] args) {

        Car Mazda = new Car(4900, 2000, 2000, 1690, 4, 21750, 0, 0, 0, 0);
        Mazda.setFuelLevel(50);
        Mazda.setRashod(7);
        if (Mazda.move("x", 100)) {
            System.out.println(" Mazda Новые координаты теперь х= "
                    + Mazda.getCoords()[0] + " y= " + Mazda.getCoords()[1]);
        } else {
            System.out.println("Mazda Не хватит топлива");

        }
        if (Mazda.move("y", 500)) {
            System.out.println("Mazda Новые координаты теперь х= "
                    + Mazda.getCoords()[0] + " y= " + Mazda.getCoords()[1]);
        } else {
            System.out.println("mazda Не хватит топлива");
        }
        System.out.println("mazda Проверим координаты х= " + Mazda.getCoords()[0]
                + " y= " + Mazda.getCoords()[1]);

        Car Volvo = new Car(5100, 2000, 2000, 1980, 4, 21750, 0, 0, 0, 0);
        Volvo.setFuelLevel(60);
        Volvo.setRashod(5);
        if (Volvo.move("y", 100)) {
            System.out.println(" Volvo Новые координаты теперь х= "
                    + Volvo.getCoords()[0] + " y= " + Volvo.getCoords()[1]);

        } else {
            System.out.println("Volvo Не хватит топлива");
        }
        if (Volvo.move("y", 100)) {

            System.out.println("Volvo Новые координаты теперь х= "
                    + Volvo.getCoords()[0] + " y= " + Volvo.getCoords()[1]);

        } else {

            System.out.println("Volvo Не хватит топлива");
        }
    }
}
