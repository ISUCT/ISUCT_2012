/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mymath;

public class Calc {

    private double xn;
    private double xk;
    private double dx;

    public Calc() {
    }

    public Calc(double aXn, double aDx, double aXk) {
        //Устанавливаем значения закрытых полей
        xn = aXn;
        xk = aXk;
        dx = aDx;
    }

    public void taskB() {

        double y;
        double[] Xarray = new double[]{0.1, 0.9, 1.2, 1.5, 2.3};
        for (double x : Xarray) {
            if (Math.abs(x) < 1) {
                y = Math.acos(x);
            } else {
                y = Math.pow(1.2, x) - Math.pow(x, 1.2);
            }
            System.out.println("x= " + x + " y= " + y);
        }
    }

    public void taskA() {
        double y;
        for (double x = xn; x <= xk; x += dx) {
            if (Math.abs(x) < 1) {
                y = Math.acos(x);
            } else {
                y = Math.pow(1.2, x) - Math.pow(x, 1.2);
            }
            System.out.println("x= " + x + " y= " + y);
        }

    }

    public void taskA(double xn, double dx, double xk) {
        double y;
        for (double x = xn; x <= xk; x += dx) {
            if (Math.abs(x) < 1) {
                y = Math.acos(x);
            } else {
                y = Math.pow(1.2, x) - Math.pow(x, 1.2);
            }
            System.out.println("x= " + x + " y= " + y);
        }
    }
}