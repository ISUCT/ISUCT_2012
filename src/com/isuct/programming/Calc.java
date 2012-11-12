package com.isuct.programming;

public class Calc {

    private double xn;
    private double dx;
    private double xk;
   
    /**
     * Конструктор по умолчанию
     */
    public Calc( double aXn, double aDx, double aXk) {
        xn = aXn;
        dx = aDx;
        xk = aXk;
       
    }


    public void taskB() {
        double y = 0;
        double[] Xarray = new double[]{1.0, 1.3, 1.6, 1.9, 2.1, 2.3, 7.1, 8.5, 9.9};
        for (double x : Xarray) {
            y =  (Math.pow(Math.sin(x),3)+(Math.pow(Math.cos(x),3))*Math.log10(x));
                    System.out.println("x=" + x + "y=" + y);
        }
    }

    public void taskA() {
        double y = 0;
        for (double x = 0.11; x <= 0.36; x = (x + 0.05)) {
            y =  (Math.pow(Math.sin(x),3)+(Math.pow(Math.cos(x),3))*Math.log10(x));
                    System.out.println("x=" + x + "y=" + y);
    }
    }
 public void taskA(double a, double b, double xn, double dx, double xk){
  double y = 0;
  for (double x = 0.11; x <= 0.36; x = (x + 0.05)) {
            y =  (Math.pow(Math.sin(x),3)+(Math.pow(Math.cos(x),3))*Math.log10(x));
                    System.out.println("x=" + x + "y=" + y);
    }
 }       
}
