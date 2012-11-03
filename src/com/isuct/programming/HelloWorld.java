package com.isuct.programming;

public class HelloWorld {

/**
* @param args
*/
public static void main(String[] args) {

float a = 1.35f;
float b = 0.98f;

float [] x = {0.35f, 1.28f, 3.51f, 5.21f, 4.16f};
float y;

for (int i = 0; i < 5; i++) {
y = (float) ((float) Math.pow(a * x[i] + b, 1.f/3.f) / (float) Math.pow(Math.log10(x[i]), 2));
System.out.println("y(x[" + (i + 1) + "]) = " + y);
} 
}

}
