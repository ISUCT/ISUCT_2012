package com.isuct.programming;

public class Calc {

    private double xn;
    private double dx;
    private double xk;
    private double a;
    private double b;

    
    
    
    public Calc() {
    }

    public Calc(double aA, double aB, double aXn, double aDx, double aXk) {

        xn = aXn;
        dx = aDx;
        xk = aXk;
        a = aA;
        b = aB;
    }

    public void taskB(double aA, double aB, double aXn, double aDx, double aXk) {

        double chisl;
        double znamen;
        double y;
        double[] Xarray = new double[]{0.7, 1, 1.3, 1.6, 1.9, 2.1, 2.4};
        for (double x : Xarray) {

            chisl = Math.pow(b, 3) + Math.pow(Math.sin(a * x), 2);
            znamen = Math.acos(x * b * x) + Math.pow(Math.E, -x / 2);
            y = chisl / znamen;
            System.out.println("Икс равен = " + x + " Игрек равен = " + y);
        }
    }

    public void taskA(double a, double b, double xn, double dx, double xk) {

        double chisl;
        double znamen;
        double y;
        for (double x = xn; x <= xk; x += dx) {
            chisl = Math.pow(b, 3) + Math.pow(Math.sin(a * x), 2);
            znamen = Math.acos(x * b * x) + Math.pow(Math.E, -x / 2);
            y = chisl / znamen;
            System.out.println("Икс равен = " + x + " Игрек равен = " + y);
        }
    }
}
