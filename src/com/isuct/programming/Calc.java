package com.isuct.programming;

public class Calc {

    /**
     * Закрытые поля класса
     */
    private double xn;
    private double dx;
    private double xk;
    private double a;
    private double b;

    /**
     * Конструктор по умолчанию
     */
    public Calc() {
    }

    /**
     * Конструктор, в котором можно передать параметры
     *
     * @param aXn - начальное значение X
     * @param aDx - дельта
     * @param aXk - конечное значение Х
     */
    public Calc(double aA, double aB, double aXn, double aDx, double aXk) {
        //Устанавливаем значения закрытых полей

        xn = 1.81;
        dx = 0.7;
        xk = 5.31;
        a = 7.2;
        b = 4.2;



    }

    /**
     * Решение задачи B
     */
    public void taskB() {
        // Объявляем и инициализируем переменные
        double chisl;
        double znamen;
        double y;
        double[] Xarray = new double[]{2.4, 2.8, 3.9, 4.7, 3.16};
        for (double x : Xarray) {
            if (x < 5) {
                chisl = Math.abs(a - b * xn);
                znamen = Math.pow(Math.log10(xn), 3);
                // вычисляем y
                y = Math.pow(chisl / znamen, 1 / 2f);
            } else {
                chisl = Math.abs(a - b * xn);
                znamen = Math.pow(Math.log10(xn), 3);
                // вычисляем y
                y = Math.pow(chisl / znamen, 1 / 2f);
                // Выводим результат
                System.out.println("Икс равен = " + x + " Игрек равен = " + y);
            }
        }
    }

    /**
     * Решение задачи А
     */
    public void taskA() {
        //Объявляем и инициализируем переменные
        double chisl;
        double znamen;
        double y;
        for (double x = xn; x <= xk; x += dx) {
            if (x < 5) {
                chisl = Math.abs(a - b * xn);
                znamen = Math.pow(Math.log10(xn), 3);
                // вычисляем y
                y = Math.pow(chisl / znamen, 1 / 2f);
            } else {
                chisl = Math.abs(a - b * xn);
                znamen = Math.pow(Math.log10(xn), 3);
                // вычисляем y
                y = Math.pow(chisl / znamen, 1 / 2f);
            }
            //Выводим результат
            System.out.println("Икс равен = " + x + " Игрек равен = " + y);
        }
    }

    /**
     * Перегруженный метод вычисления задачи, с возможностью передачи параметров
     *
     * @param xn
     * @param dx
     * @param xk
     * @param a
     * @param b
     */
    public void taskA(double a, double b, double xn, double dx, double xk) {
        //Объявляем и инициализируем переменные
        double y;
        double chisl;
        double znamen;
        for (double x = xn; x <= xk; x += dx) {
            if (x < 5) {
                chisl = Math.abs(a - b * xn);
                znamen = Math.pow(Math.log10(xn), 3);
                // вычисляем y
                y = Math.pow(chisl / znamen, 1 / 2f);
            } else {
                chisl = Math.abs(a - b * xn);
                znamen = Math.pow(Math.log10(xn), 3);
                // вычисляем y
                y = Math.pow(chisl / znamen, 1 / 2f);
            }
            //Выводим результат
            System.out.println("Икс равен = " + x + " Игрек равен = " + y);
        }
    }
}