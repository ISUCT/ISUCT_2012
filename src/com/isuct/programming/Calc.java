package com.isuct.programming;

public class Calc {

    private double xn;
    private double dx;
    private double xk;
    private double a;
    private double b;

    /**
     * Конструктор без параметров отсутствовал
     */
    public Calc() {
    }

    /**
     * Конструктор с параметрами,устанавливаем значения закрытых полей
     */
    public Calc(double aA, double aB, double aXn, double aDx, double aXk) {
        xn = aXn;
        dx = aDx;
        xk = aXk;
        a = aA;
        b = aB;
    }

    public double[][] taskB(double[] arrayX) {
        /* 
         * Объявляем и инициализируем пременные
         */
        double a = 4.1f;
        double b = 2.7f;
        double chisl = 0;
        double znamen = 0;
        double y = 0;
        double[][] result = new double[2][arrayX.length];
        int i = 0;

        for (double x : arrayX) {
            chisl = (a) * Math.pow((x), (1 / 2)) - (b) * Math.log(x)
                    / Math.log(5);
            znamen = Math.log(x - 1) / Math.log(10);
            y = chisl / znamen;
            result[0][i] = x;
            result[1][i] = y;
            i++;
        }
        return result;

    }

public double[][] taskA() {
		double chisl = 0;
		double znamen = 0;
		double y = 0;
 int nElem = (int) Math.round(((xk-xn)/dx));
 double[][] result = new double[2][nElem+1];
   int i=0;
 
 
		for (double x = xn; x <= xk; x += dx) {
			chisl = (a) * Math.pow((x), (1 / 2)) - (b) * Math.log(x)
					/ Math.log(5);
			znamen = Math.log(x - 1) / Math.log(10);
			y = chisl / znamen;
			 result[0][i]=x;
                        result[1][i]=y;
                         i++;
		}
                return result;
}

	public double [][] taskA(double a, double b, double xn, double dx, double xk) {

		double chisl = 0;
		double znamen = 0;
		double y = 0;
                 int nElem = (int) Math.round(((xk-xn)/dx));
                 double[][] result = new double[2][nElem+1];
                 int i=0;
		for (double x = xn; x <= xk; x += dx) {
			chisl = (a) * Math.pow((x), (1 / 2)) - (b) * Math.log(x)
					/ Math.log(5);
			znamen = Math.log(x - 1) / Math.log(10);
			y = chisl / znamen;
		 result[0][i]=x;
                 result[1][i]=y;
                i++;  
	}
         return result;
}
}
