package com.isuct.programming;

public class HelloWorld {


public static double func(double x, double a, double b) 
{
return ((Math.pow((x - a), (double)2 / (double)3)) + (Math.pow(Math.abs(x + b), (double)1 / (double)5))) / 
(Math.pow((Math.pow(x, 2) - Math.pow((a + b), 2)), (double)1 / (double)9));
}

public static void main(String[] args) {
// TODO Auto-generated method stub

double a = 0.8;
double b = 0.4;
double Xn = 1.23;
double Xk = 7.23;
double dX = 1.2;

double[] x = new double[5];

x[0] = 1.88;
x[1] = 2.26;
x[2] = 3.84;
x[3] = 4.55;
x[4] = -6.21;

System.out.println("zadacha A");

while (Xn <= Xk)
{
System.out.println("y[" + Xn + "] = " + func(Xn, a, b));
Xn += dX; 
}

System.out.println("zadacha B");

for (int i = 0; i < 5; i++) {
System.out.println("y[" + i + "] = " + func(x[i], a, b));
}

}

}