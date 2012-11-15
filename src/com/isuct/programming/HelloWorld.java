package com.isuct.programming;

public class HelloWorld {

    public static void main(String[] args) {
        double a = 4.1;
        double b = 2.7f;
        
        {float x = 1.9f;
                double chisl = (a) * Math.pow((x), (1 / 2)) - (b) * Math.log(x) / Math.log(5);
                double znamen = Math.log(x - 1) / Math.log(10);
                double y = chisl / znamen;
                System.out.println("x = " + x + " y = " + y);}
                
        {float x = 2.15f;
                double chisl = (a) * Math.pow((x), (1 / 2)) - (b) * Math.log(x) / Math.log(5);
                double znamen = Math.log(x - 1) / Math.log(10);
                double y = chisl / znamen;
                System.out.println("x = " + x + " y = " + y);}
        
        {float x = 2.34f;
                double chisl = (a) * Math.pow((x), (1 / 2)) - (b) * Math.log(x) / Math.log(5);
                double znamen = Math.log(x - 1) / Math.log(10);
                double y = chisl / znamen;
                System.out.println("x = " + x + " y = " + y);}
        
        {float x = 2.73f;
                double chisl = (a) * Math.pow((x), (1 / 2)) - (b) * Math.log(x) / Math.log(5);
                double znamen = Math.log(x - 1) / Math.log(10);
                double y = chisl / znamen;
                System.out.println("x = " + x + " y = " + y);}
        
        {float x = 3.16f;
                double chisl = (a) * Math.pow((x), (1 / 2)) - (b) * Math.log(x) / Math.log(5);
                double znamen = Math.log(x - 1) / Math.log(10);
                double y = chisl / znamen;
                System.out.println("x = " + x + " y = " + y);}
        
        
            Calc defaultConstr = new Calc(1.9, 2.15, 2.34, 2.73, 3.16);
            System.out.println("------------Решаем задачу В------------");

            defaultConstr.taskB();
            System.out.println("------------Решаем задачу A —----------");

            defaultConstr.taskA(1.9, 2.15, 2.34, 2.73, 3.16);
            System.out.println("------------Решаем задачу A с перегруженным конструктором------------");

            Calc nDefConstr = new Calc(1.9, 2.15, 2.34, 2.73, 3.16);
            nDefConstr.taskA();
            
            }
            



        }

    
