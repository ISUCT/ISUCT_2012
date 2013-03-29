package graphicinterface;



public class Calc {

    private double xn;
    private double dx;
    private double xk;

    public Calc() {
    }

    public Calc(double aXn, double aDx, double aXk) {

        xn = aXn;
        dx = aDx;
        xk = aXk;

    }

    public double[][] taskB(double[] arrayX) {
        double y;
        double[][] result = new double[2][arrayX.length];
        int i = 0;

        for (double x : arrayX) {
            if (Math.abs(x) >= 1) {
                y = Math.pow(1.2, x) - Math.pow(x, 1.2);
            } else {
                y = Math.acos(x);
            }
            result[0][i] = x;
            result[1][i] = y;
            i++;
        }
        return result;

    }

    public double[][] taskA() {

        double y;
        int nElem = (int) Math.round(((xk - xn) / dx));
        double[][] result = new double[2][nElem + 1];
        int i = 0;


        for (double x = xn; x <= xk; x += dx) {
            if (Math.abs(x) >= 1) {
                y = Math.pow(1.2, x) - Math.pow(x, 1.2);
            } else {
                y = Math.acos(x);
            }
            result[0][i] = x;
            result[1][i] = y;
            i++;
        }
        return result;
    }

    public double[][] taskA(double xn, double dx, double xk) {

        double y;
        int nElem = (int) Math.round(((xk - xn) / dx));
        double[][] result = new double[2][nElem + 1];
        int i = 0;
        for (double x = xn; x <= xk; x += dx) {
            if (Math.abs(x) >= 1) {
                y = Math.pow(1.2, x) - Math.pow(x, 1.2);
            } else {
                y = Math.acos(x);
            }
            result[0][i] = x;
            result[1][i] = y;
            i++;
        }
        return result;
    }
}
