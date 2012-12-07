package com.isuct.programming;

public class Calc {

private double xn;
private double dx;
private double xk;
private double a;
private double b;
/**

* Конструктор по умолчанию

*/
public Calc(){
    /**
     * Конструктор с параметрами
     */  
}
public Calc(double aA, double aB, double aXn, double aDx, double aXk) {
xn = aXn;
dx = aDx;
xk = aXk;
a = aA;
b = aB;

}
public void taskB() {
double a=1.6f;
double y = 0;
double[] Xarray = new double[]{1.28, 1.36, 2.47, 3.6, 3.16};
for (double x : Xarray) {
y= (Math.pow ((a),(x+1)*(x-1))- (Math.log((x-1)*(x+1))/Math.log(10)) + Math.pow (((x-1)*(x+1)),(1/3)));
System.out.println("Икс равен= " + x + "Игрек равен = " + y);

}
}



public void taskA() {
double y = 0;
 for (double x = xn; x <= xk; x += dx)  {
y= (Math.pow ((a),(x+1)*(x-1))- (Math.log((x-1)*(x+1))/Math.log(10)) + Math.pow (((x-1)*(x+1)),(1/3)));
System.out.println("Икс равен= " + x + "Игрек равен = " + y); 
}

}

public void taskA(double a, double b, double xn, double dx, double xk){ 
double y = 0;
for (double x = xn; x <= xk; x += dx) {
y= (Math.pow ((a),(x+1)*(x-1))- (Math.log((x-1)*(x+1))/Math.log(10)) + Math.pow (((x-1)*(x+1)),(1/3)));
System.out.println("Икс равен= " + x + "Игрек равен = " + y);
}
}
}