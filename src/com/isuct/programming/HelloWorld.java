package com.isuct.programming;

public class HelloWorld {

public static void main(String [] args){
float x = 1.28f;
float a = 1.6f;
double y= (Math.pow ((a),(x+1)*(x-1))- (Math.log((x-1)*(x+1))/Math.log(10)) + Math.pow (((x-1)*(x+1)),(1/3)));
System.out.println("x"+x +"y"+y);

x = 1.36f;
a = 1.6f;
y= (Math.pow ((a),(x+1)*(x-1))- (Math.log((x-1)*(x+1))/Math.log(10)) + Math.pow (((x-1)*(x+1)),(1/3)));
System.out.println("x"+x +"y"+y);

x = 2.47f;
a = 1.6f;
y= (Math.pow ((a),(x+1)*(x-1))- (Math.log((x-1)*(x+1))/Math.log(10)) + Math.pow (((x-1)*(x+1)),(1/3)));
System.out.println("x"+x +"y"+y);

x = 3.68f;
a = 1.6f;
y= (Math.pow ((a),(x+1)*(x-1))- (Math.log((x-1)*(x+1))/Math.log(10)) + Math.pow (((x-1)*(x+1)),(1/3)));
System.out.println("x"+x +"y"+y);

x = 4.56f;
a = 1.6f;
y= (Math.pow ((a),(x+1)*(x-1))- (Math.log((x-1)*(x+1))/Math.log(10)) + Math.pow (((x-1)*(x+1)),(1/3)));
System.out.println("x"+x +"y"+y);

for (x = 1.2f; x <= 3.7; x += 0.5) {
y= (Math.pow ((a),(x+1)*(x-1))- (Math.log((x-1)*(x+1))/Math.log(10)) + Math.pow (((x-1)*(x+1)),(1/3)));
System.out.println("Ответ(2)x"+x +"y"+y);
}
}
}