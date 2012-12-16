/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SAMSUNG
 */
public class Calc {
    private double xn;
    private double dx;
    private double xk;
    private double a;
    private double b;
        /**
        * Конструктор по умолчанию
        */
public Calc (){
}
        /** Конструктор, where you can give znacheniya;
        * param aXn - starting znachenie X;
        * param aDx - delta X;
        * param aXk - finishind znachenie X;
        */ 
public Calc (double aA, double aB, double aXn, double aDx, double aXk){
        //Create znacheniya close param;
    xn = aXn;
    dx = aDx;
    xk = aXk;
    a = aA;
    b = aB;
}
    
    
       public double [][] taskB (double [] arrayX){
           //Объявляем и инициализируем переменные;
           double chisl = 0;
           double znam = 0;
           double y = 0;
           double Xarray = new doube []{1.9, 2.15, 2.34, 2.73, 3.16};
           for (double x : Xarray){
               double [][] result = new double [2][arrayX.length];
               int i = 0;
           }
               for (double x : arrayX) {
                   if (x<5) {
                       chisl = Math.log(Math.pow(x, 2)-1);
                       znam = Math.log(a*Math.pow(x, 2)-b)/Math.log(5);
                       y = chisl/znam;
                      }
                   System.out.println("X = " + x + " Y = " + y);
                   result[0][i] = x;
                   result [1][i] = y;
                   i++;
                   }
               return result;
           }
           //Task A;
       
       
public void taskA (){
//Объявляем и инициализируем переменные
    double chisl = 0;
    double znam = 0;
    double y = chisl / znam;
    for (double x=xn; x<xk; x+=dx){
        if(x<5){
            chisl = Math.log(Math.pow(x, 2)-1);
            znam = Math.log(a*Math.pow(x, 2)-b)/Math.log(5);
            y= chisl/znam;
        }else{
            chisl = Math.log(Math.pow(x, 2)-1);
            znam = Math.log(a*Math.pow(x, 2)-b)/Math.log(5);
            y= chisl/znam;
        }
        System.out.println(" X = " + x + " Y = " +y );
    }

        public double [][] taskA(){
            double chisl = 0;
            double znam = 0;
            double y = 0;
            // nE - количество elements in massive;
            int nE = (int) Math.round ((xk-xn)/dx);
            double [][] result = new double [2][nE];
            int i = 0;
            for (double x = xn; x<xk; x+=dx){
                if (x<5) {
                    chisl = Math.log(Math.pow(x, 2)-1);
                    znam = Math.log(a*Math.pow(x, 2)-b)/Math.log(5);
                    y= chisl/znam;
                    }else{
                    chisl = Math.log(Math.pow(x, 2)-1);
                    znam = Math.log(a*Math.pow(x, 2)-b)/Math.log(5);
                    y= chisl/znam;}
                result[0][i]=x;
                result[1][i]=y;
                i++;
                return result;
            }  }
//С перегрузкой
public void taskA(double a, double b, double xn, double xk, double dx){
        double chisl = 0;
        double znam = 0;
        double y = 0;
        for (double x=xn; x<=xk; x+=dx){
            if (x<5){
                chisl = Math.log(Math.pow(x, 2)-1);
                znam = Math.log(a*Math.pow(x, 2)-b)/Math.log(5);
                y= chisl/znam;
            }else{
                chisl = Math.log(Math.pow(x, 2)-1);
                znam = Math.log(a*Math.pow(x, 2)-b)/Math.log(5);
                y= chisl/znam;
            }
            System.out.println(" X = " + x + "Y = " + y);
        }
}
        public double [][] taskA (double a, double b, double xn, double dx, double xk){
            double chisl = 0;
            double znam = 0;
            double y = 0;
            int nE = (int) Math.round(((xk-xn)/dx));
            double [][] result = new double [2][nE];
            int i=0;
            for (double x = xn; x<xk; x+=dx){
                if (x<5){
                    chisl = Math.log(Math.pow(x, 2)-1);
                    znam = Math.log(a*Math.pow(x, 2)-b)/Math.log(5);
                    y= chisl/znam;
                }else{
                    chisl = Math.log(Math.pow(x, 2)-1);
                    znam = Math.log(a*Math.pow(x, 2)-b)/Math.log(5);
                    y= chisl/znam;
                }
            result [0][i]=x;
            result [1][i]=y;
            }
        }
}
        
        
        
        




