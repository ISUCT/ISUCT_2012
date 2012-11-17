/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;

/**
*
* @author KeksinaKA
*/
public class Calc {

private double xn;
private double dx;
private double xk;
private double a;
private double b;

public Calc ( double aA, double bB, double aXn, double aDx, double aXk) {
xn = aXn;
dx = aDx;
xk = aXk;
a = aA;
b = bB;
}

public void taskB () {
double chisl = 0;
double znam = 0;
double y = 0;
double [] Xarray = new double [] {1.21, 1.76, 2.53, 3.48, 4,52};
for (double x : Xarray) {
if (x<5) {
chisl = Math.log(Math.pow(x, 2)-1);
znam = Math.log(a*Math.pow(x, 2)-b)/Math.log(5);
y = chisl / znam;
} else {
chisl = Math.log(Math.pow(x, 2)-1);
znam = Math.log(a*Math.pow(x, 2)-b)/Math.log(5);
y = chisl / znam;
}
System.out.println ( "X = "+x+" Y = "+y);
}
}
public void taskA () {
double chisl = 0;
double znam = 0;
double y = 0;
for (double x = xn; x<=xk; x+=dx){
    if (x<5){
    /** Почему видит переменную х через раз?*/
    chisl = Math.log(Math.pow(x, 2)-1);
    znam = Math.log(a*Math.pow(x, 2)-b)/Math.log(5);
    y = chisl / znam; 
    } else {
    chisl = Math.log(Math.pow(x, 2)-1);
    znam = Math.log(a*Math.pow(x, 2)-b)/Math.log(5);
    y = chisl / znam;}
    System.out.println ( "X = "+x+" Y = "+y);
}
}
public void taskA (double a, double b, double xn, double xk, double dx){
double chisl = 0;
double znam = 0;
double y = 0; 
for (double x = xn; x<=xk; x+=dx){
    /** Здесь тоже ругается. Почему?!!!*/
    if (x<5){
    /*Опять ругается на переменную*/
    chisl = Math.log(Math.pow(x, 2)-1);
    znam = Math.log(a*Math.pow(x, 2)-b)/Math.log(5);
    y = chisl / znam; 
    } else {
    chisl = Math.log(Math.pow(x, 2)-1);
    znam = Math.log(a*Math.pow(x, 2)-b)/Math.log(5);
    y = chisl / znam;}
    System.out.println("X = "+x+" Y = "+y);
    
}
}
}
