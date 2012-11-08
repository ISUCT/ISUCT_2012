package com.isuct.programming;
public class HelloWorld {
public static void main(String[] args){
float a = 0.4f;
float b = 0.8f;
for (double x=3.2; x<=6.2; x+=0.6){
double chisl=Math.pow(a,x)-Math.pow(b,x)*Math.pow(a*b,1/3);
double znamen=Math.log10(a/b);
double y=chisl/znamen;
System.out.println("x"+x+"y"+y);
}

}
}