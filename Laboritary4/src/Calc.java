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
    public Calc() {
    }

    /**
     * Конструктор, where you can give znacheniya; param aXn - starting
     * znachenie X; param aDx - delta X; param aXk - finishind znachenie X;
     */
    public Calc(double aA, double aB, double aXn, double aDx, double aXk) {
        //Create znacheniya close param;
        xn = aXn;
        dx = aDx;
        xk = aXk;
        a = aA;
        b = aB;
    }

    public double[][] taskB(double[] arrayX) {
        //Объявляем и инициализируем переменные;
        double chisl = 0;
        double znam = 0;
        double y = 0;
        // 1 - Была АчиПяТка - doube, а надо double
        // Слва тоже должен быть массив, НО
//           double Xarray = new double []{1.9, 2.15, 2.34, 2.73, 3.16};
        //Зачем вам этот массив тут? вам его пользователь передаст в arrayX

        //А следующий цикл вообще зачем был?
        //некотрое кол-во раз просто пересоздавали пустой массив
//           for (double x : arrayX){
//               double [][] result = new double [2][arrayX.length];
//               int i = 0;
//           }
        //Просто создаем массив для хранения результата
        double[][] result = new double[2][arrayX.length];
        int i = 0;
        for (double x : arrayX) {
            //На сколько я помню - у вас только 1 функция
            //                   if (x<5) {
            chisl = Math.log(Math.pow(x, 2) - 1);
            znam = Math.log(a * Math.pow(x, 2) - b) / Math.log(5);
            y = chisl / znam;
//                      }
            //Печатать тут мы не будем
//                   System.out.println("X = " instanceof + x + " Y = " + y);
            result[0][i] = x;
            result[1][i] = y;
            i++;
        }
        return result;
    }
    //Task A;

    
//    public void taskA() {
////Объявляем и инициализируем переменные
//        double chisl = 0;
//        double znam = 0;
//        double y = chisl / znam;
//        for (double x = xn; x < xk; x += dx) {
//            if (x < 5) {
//                chisl = Math.log(Math.pow(x, 2) - 1);
//                znam = Math.log(a * Math.pow(x, 2) - b) / Math.log(5);
//                y = chisl / znam;
//            } else {
//                chisl = Math.log(Math.pow(x, 2) - 1);
//                znam = Math.log(a * Math.pow(x, 2) - b) / Math.log(5);
//                y = chisl / znam;
//            }
//            System.out.println(" X = " + x + " Y = " + y);
//        }

    //то что выше - уже не нужно, преобразуем его вот в это
    // Только if else - уберете, а подставите свое
    
    public double[][] taskA() {
        double chisl = 0;
        double znam = 0;
        double y = 0;
        // nE - количество elements in massive;
        int nE = (int) Math.round((xk - xn) / dx);
        double[][] result = new double[2][nE];
        int i = 0;
        for (double x = xn; x < xk; x += dx) {
            if (x < 5) {
                chisl = Math.log(Math.pow(x, 2) - 1);
                znam = Math.log(a * Math.pow(x, 2) - b) / Math.log(5);
                y = chisl / znam;
            } else {
                chisl = Math.log(Math.pow(x, 2) - 1);
                znam = Math.log(a * Math.pow(x, 2) - b) / Math.log(5);
                y = chisl / znam;
            }
            result[0][i] = x;
            result[1][i] = y;
            i++;
            
        }
        //Вот тут мы должны вернуть результат - все посчитали
        //теперь вернем и пойдем со спокойной душой :)
        return result;
    }
////С перегрузкой
//    public void taskA(double a, double b, double xn, double xk, double dx) {
//        double chisl = 0;
//        double znam = 0;
//        double y = 0;
//        for (double x = xn; x <= xk; x += dx) {
//            if (x < 5) {
//                chisl = Math.log(Math.pow(x, 2) - 1);
//                znam = Math.log(a * Math.pow(x, 2) - b) / Math.log(5);
//                y = chisl / znam;
//            } else {
//                chisl = Math.log(Math.pow(x, 2) - 1);
//                znam = Math.log(a * Math.pow(x, 2) - b) / Math.log(5);
//                y = chisl / znam;
//            }
//            System.out.println(" X = " + x + "Y = " + y);
//        }
//    }

    //Аналогично
    
    public double[][] taskA(double a, double b, double xn, double dx, double xk) {
        double chisl = 0;
        double znam = 0;
        double y = 0;
        int nE = (int) Math.round(((xk - xn) / dx));
        double[][] result = new double[2][nE];
        int i = 0;
        for (double x = xn; x < xk; x += dx) {
            if (x < 5) {
                chisl = Math.log(Math.pow(x, 2) - 1);
                znam = Math.log(a * Math.pow(x, 2) - b) / Math.log(5);
                y = chisl / znam;
            } else {
                chisl = Math.log(Math.pow(x, 2) - 1);
                znam = Math.log(a * Math.pow(x, 2) - b) / Math.log(5);
                y = chisl / znam;
            }
            result[0][i] = x;
            result[1][i] = y;
        }
        return result;
    }
}
