package com.isuct.programming;

public class HelloWorld {

    public static void main(String[] args) {
        Robot Y155 = new Robot(300, 1000, 350, 12, 2, 1);
        Y155.setPosition(0, 0);
        Y155.setBattery(10);
        Y155.setCharge(1000);
        if (Y155.move("x", 450)) {
            Y155.speak();
            System.out.println("Y155 Новое место х= "
                    + Y155.getCoordinates()[0] + " y= " + Y155.getCoordinates()[1]);
        } else {
            System.out.println("Y155 Батарея разряжена");
        }
        if (Y155.move("x", 450)) {
            Y155.hibernate();
        } else {
            Y155.move("x", 50);
        }

        if (Y155.move("y", 200)) {
            System.out.println("Y155 Переместился в х= "
                    + Y155.getCoordinates()[0] + " y= " + Y155.getCoordinates()[1]);
        } else {
            System.out.println("Y155 Батаря разряжена");
        }


        if (Y155.move("x", 990)) {
            System.out.println("Y155 Переместился в х= "
                    + Y155.getCoordinates()[0] + " y= " + Y155.getCoordinates()[1]);
        } else {
            System.out.println("Y155 Батаря разряжена");
        }
        if (Y155.move("x", 1100)) {
            System.out.println("Y155 Переместился в х= "
                    + Y155.getCoordinates()[0] + " y= " + Y155.getCoordinates()[1]);
        } else {
            System.out.println("Y155 Батаря разряжена");
            Y155.lowBattery();
        }
    }
}
