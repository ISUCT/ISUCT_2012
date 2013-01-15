
package calk;
public class Calk{
/**
* Закрытые поля класса
*/
private double xn;
private double dx;
private double xk;
private double a;
private double b;

/**
* Конструктор по умолчанию
*/
public Calk() {

}

/**
* Конструктор, в котором можно передать параметры
* Ольга Штамм aXn - начальное значение X
* Ольга Штамм aDx - дельта
* Ольга Штамм aXk - конечное значение Х
*/
public Calk(double aA, double aB, double aXn, double aDx, double aXk) {
// Устанавливаем значения закрытых полей
xn = aXn;
dx = aDx;
xk = aXk;
a = aA;
b = aB;
}

/**
* Решение задачи B
*/
public double[][] taskB(double[] arrayX) {
// Объявляем и инициализируем переменные
double chisl = 0;
double znamen = 0;
double y = 0;
// Создаем 2мерный массив для хранения результатов
double[][] result = new double[2][arrayX.length];
int i = 0;
for (double x : arrayX) {
if(x<5){
y = Math.abs( a - b*x)/ Math.pow(Math.log10(x),3);
y = Math.abs( a - b*x)/ Math.pow(Math.log10(x),3);
}
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
double chisl = 0;
double znamen = 0;
double y = 0;
//при создании вычисляем сколько будет элементов
int nElem = (int) Math.round(((xk-xn)/dx));

double[][] result = new double[2][nElem+1];
int i=0;
for (double x = xn; x < xk; x += dx) {
if(x<5){
y = Math.abs( a - b*x)/ Math.pow(Math.log10(x),3);
}else{


y = Math.abs( a - b*x)/ Math.pow(Math.log10(x),3);
}
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
* Ольга Штамм xn
* Ольга Штамм dx
* Ольга Штамм xk
* Ольга Штамм a
* Ольга Штамм b
*/
public double[][] taskA(double a, double b, double xn, double dx, double xk) {
// Объявляем и инициализируем переменные

double y = 0;
//при создании вычисляем сколько будет элементов
int nElem = (int) Math.round(((xk-xn)/dx));
double[][] result = new double[2][nElem+1];
int i=0;

for (double x = xn; x < xk; x += dx) {
if(x<5){

//вычисляем y
y = Math.abs( a - b*x)/ Math.pow(Math.log10(x),3);
}
// Выводим результат
result[0][i]=x;
result[1][i]=y;
i++;
}
return result;
}	