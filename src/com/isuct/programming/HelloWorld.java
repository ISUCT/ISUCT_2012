package com.isuct.programming;

public class HelloWorld {

    public static void main(String[] args) {
        Robot Y155 = new Robot(300, 1000, 350, 12, 2, 1);
        Y155.setPosition(0, 0);
        Y155.setBattery(10);
        Y155.setCharge(8);
        if (Y155.move("x", 450)) {
            System.out.println("Y155 Новое место х= "
                    + Y155.getCoordinates()[0] + " y= " + Y155.getCoordinates()[1]);
        } else {
            System.out.println("Y155 ");
        }

        if (Y155.move("y", 200)) {
            System.out.println("Y155 Переместился в х= "
                    + Y155.getCoordinates()[0] + " y= " + Y155.getCoordinates()[1]);
        } else {
            System.out.println("Y155 Батаря разряжена");
        }
        System.out.println("Y155 Проверка х= " + Y155.getCoordinates()[0]
                + " y= " + Y155.getCoordinates()[1]);


    }
}