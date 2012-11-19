/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Admin
 */
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

    /**
     * Решение задачи B
     */
    public void taskB(double aA, double aB) {
        double chisl;
        double znamen;
        double y;
        double[] Xarray = new double[]{1.0, 1.3, 1.6, 1.9, 2.1, 2.3, 7.1, 8.5, 9.9};
        for (double x : Xarray) {
            chisl = 1 + Math.pow(Math.log10(x / a), 2);
            znamen = b - Math.pow(Math.E, x / a);
            y = chisl / znamen;
            System.out.println("x=" + x + " y=" + y);
        }
    }

    /**
     * Решение задачи А
     */
    public void taskA() {

        double chisl;
        double znamen;
        double y;
        for (double x = 1.25; x <= 2.75; x += 0.3) {
            {
                chisl = 1 + Math.pow(Math.log10(x / a), 2);
                znamen = b - Math.pow(Math.E, x / a);
                y = chisl / znamen;
                System.out.println("x=" + x + " y=" + y);
            }
        }
    }

    public void taskA(double a, double b, double xn, double dx, double xk) {
        double chisl;
        double znamen;
        double y;
        for (double x = 1.25; x <= 2.75; x += 0.3) {
                {   chisl = 1 + Math.pow(Math.log10(x / a), 2);
                    znamen = b - Math.pow(Math.E, x / a);
                    y = chisl / znamen;
                    System.out.println("x=" + x + " y=" + y);
            }
        }
    }
}

    

