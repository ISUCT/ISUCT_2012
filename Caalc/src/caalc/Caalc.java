package caalc;

public class Caalc {
/**
* Закрытые поля класса
*/
private double xn;
private double dx;
private double xk;
private double a;


/**
* Конструктор по умолчанию
*/
public Caalc() {

}

/**
* Конструктор, в котором можно передать параметры
* @param aXn - начальное значение X
* @param aDx - дельта
* @param aXk - конечное значение Х
*/
public Caalc(double aA, double aXn, double aDx, double aXk) {
// Устанавливаем значения закрытых полей
xn = aXn;
dx = aDx;
xk = aXk;
a = aA;

}

/**
* Решение задачи B
*/
public double[][] taskB(double[] arrayX, double b) {
// Объявляем и инициализируем переменные
                double a = 2.0f;
             
double y = 0;
// Создаем 2мерный массив для хранения результатов
double[][] result = new double[2][arrayX.length];
int i = 0;
for (double x : arrayX) {
y=(float) (Math.pow(Math.asin(x),a)+Math.pow(Math.acos(x),b));
// Сохраняем результат
result[0][i] = x;
result[1][i] = y;
i++;
}
return result;
}

/**
* Решение задачи А
*/
public double[][] taskA() {
// Объявляем и инициализируем переменные
            
double y = 0;
//при создании вычисляем сколько будет элементов
int nElem = (int) Math.round((xk-xn)/dx+1);
                
double[][] result = new double[2][nElem];
int i=0;
for (double x = xn; x < xk; x += dx) {
        double b = 0;
 y=(float) (Math.pow(Math.asin(x),a)+Math.pow(Math.acos(x),b));
	
// Выводим результат
result[0][i]=x;
result[1][i]=y;
i++;
}
return result;
}

/**
* Перегруженный метод вычисления задачи, с возможностью
* передачи параметров
* @param xn
* @param dx
* @param xk
* @param a
*/
public double[][] taskA(double a, double xn, double dx, double xk, double b) {
// Объявляем и инициализируем переменные
double y = 0;
//при создании вычисляем сколько будет элементов
int nElem = (int) Math.round((xk-xn)/dx+1);
double[][] result = new double[2][nElem];
int i=0;
                
for (double x = xn; x < xk; x += dx) {
                        
			 y=(float) (Math.pow(Math.asin(x),a)+Math.pow(Math.acos(x),b));
// Выводим результат
result[0][i]=x;
result[1][i]=y;
i++;
}
return result;
}

}