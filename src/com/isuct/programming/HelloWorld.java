package com.isuct.programming;

public class HelloWorld {

    /**
     * @param args
     */
    public static void main(String[] args) {

        float a = 1.35f;
        float b = 0.98f;

        float Xn = 1.14f;
        float Xk = 4.24f;
        float dX = 0.62f;

        float currX = Xn;
        float y;

        while (currX <= Xk) {
            y = (float) ((float) Math.pow(a * currX + b, 1.f / 3.f) / (float) Math.pow(Math.log10(currX), 2));
            System.out.println("y(" + currX + ") = " + y);

            currX += dX;
        }
    }
}
