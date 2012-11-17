package com.isuct.programming;

public class HelloWorld {


	public static void main(String [] args){
		float x = 1.1f;
float b = 2.5f;
double chisl;
chisl = 1+Math.pow(Math.sin(Math.pow(b,3)+Math.pow(x,3)),2);
double znamen;
znamen = Math.pow((Math.pow(b,3)+Math.pow(x,3)), 1/3);
double y = chisl/znamen;
System.out.println("x="+x+"y="+y);

x = 2.4f;
chisl = 1+Math.pow(Math.sin(Math.pow(b,3)+Math.pow(x,3)),2);
znamen = Math.pow((Math.pow(b,3)+Math.pow(x,3)), 1/3);
y = chisl/znamen;
System.out.println("x="+x+"y="+y);

x = 3.6f;
chisl = 1+Math.pow(Math.sin(Math.pow(b,3)+Math.pow(x,3)),2);
znamen = Math.pow((Math.pow(b,3)+Math.pow(x,3)), 1/3);
y = chisl/znamen;
System.out.println("x="+x+"y="+y);

x = 1.7f;
chisl = 1+Math.pow(Math.sin(Math.pow(b,3)+Math.pow(x,3)),2);
znamen = Math.pow((Math.pow(b,3)+Math.pow(x,3)), 1/3);
y = chisl/znamen;
System.out.println("x="+x+"y="+y);

x = 3.9f;
chisl = 1+Math.pow(Math.sin(Math.pow(b,3)+Math.pow(x,3)),2);
znamen = Math.pow((Math.pow(b,3)+Math.pow(x,3)), 1/3);
y = chisl/znamen;
System.out.println("x="+x+"y="+y);
		
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


