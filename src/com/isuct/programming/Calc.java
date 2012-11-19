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
      
  }
    public Calc(double aA,double aB,double aXn,double aDx,double aXk){
    xn = aXn;
    dx = aDx;
    xk = aXk;
    a = aA;
    b = aB;
      }
    
   public void taskB(){
    double a = 0.05f;
    double b = 0.06f;
    double chisl = 0;
    double znamen = 0;
    double y =0;
    double[]Xarray = new double[]{0.15,0.26,0.37,0.48,0.56};
    for (double x : Xarray){
    chisl = Math.acos((x-b)*(x+b));
    znamen = Math.asin((x-a)*(x+b));
    System.out.print("Икс равен="+ x +"Игрек равен ="+ y);
    
    }
   }
   public void taskA() {
       double chisl = 0;
       double znamen = 0;
       double y = 0;
       for(double x = xn;x<=xk;x +=dx){
       chisl = Math.acos((x-b)*(x+b));
       znamen = Math.asin((x-a)*(x+a));
       System.out.print ("Икс равен=" + x +"Игрек равен="+ y);
       }
   }
   public void taskA(double a,double b,double xn,double dx,double xk){
       double chisl = 0;
       double znamen = 0;
       double y = 0;
       for(double x = xn;x<=xk;x +=dx){
       chisl = Math.acos((x-b)*(x+b));
       znamen = Math.asin((x-a)*(x+a));
       System.out.print ("Икс равен=" + x +"Игрек равен="+ y);
       }
   }
   
} 
 
    
    
    