package com.isuct.programming;

public class HelloWorld {

	public static void main(String [] args){
double a =0.05;
double b =0.06f;

{float x = 0.25f;
double chisl = Math.acos((x-b)*(x+b));
double znamen = Math.asin((x-a)*(x+a));
double y = chisl / znamen;
System.out.print("x = "+ x + "y =" + y);}

{float x = 0.26f;
double chisl = Math.acos((x-b)*(x+b));
double znamen = Math.asin((x-a)*(x+a));
double y = chisl / znamen;
System.out.print("x = "+ x + "y ="+ y);}

{float x = 0.37f;
double chisl = Math.acos((x-b)*(x+b));
double znamen = Math.asin((x-a)*(x+a));
double y = chisl / znamen;
System.out.print("x =" + x + "y ="+ y);}

{float x = 0.48f;
double chisl = Math.acos((x-b)*(x+b));
double znamen = Math.asin((x-a)*(x+a));
double y = chisl / znamen;
System.out.print("x =" + x + "y ="+ y);}

{float x = 0.56f;
double chisl = Math.acos((x-b)*(x+b));
double znamen = Math.asin((x-a)*(x+a));
double y = chisl / znamen;
System.out.print("x =" + x + "y ="+ y);}

Calc defaultConstr =new Calc(0.15,0.26,0.37,0.48,0.56);
System.out.print("-----------------Решаем задачу B-----------------");

defaultConstr.taskB();
System.out.print("--------------Решаем задачу A--------------------");

defaultConstr.taskA(0.15,0.26,0.37,0.48,0.56);
System.out.print("---------------Решаем задачу А с перегруженным конструктором-----------");

Calc nDefConstr = new Calc(0.15,0.26,0.37,0.48,0.56);
nDefConstr.taskA();

        }
}



        

    
    
    