package kalc;
public class Kalc {
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
 public Kalc() {

 }

 /**
 * Конструктор, в котором можно передать параметры
 * @param aXn - начальное значение X
 *  @param aDx - дельта
 * @param aXk - конечное значение Х
 */
 public Kalc(double aA, double aB, double aXn, double aDx, double aXk) {
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
 //вычисляем числитель
 chisl= a+Math.pow(Math.tan(b*x),2);
 //вычисляем знаменатель
 znamen= b+Math.pow(Math.tan(a*x),2);
 //вычисляем y
 y= chisl/znamen;
    }else{
 //вычисляем числитель 
 chisl= a+Math.pow(Math.tan(b*x),2);
 //вычисляем знаменатель 
 znamen= b+Math.pow(Math.tan(a*x),2);
 //вычисляем y
 y= chisl/znamen;
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
 //вычисляем числитель 
 chisl= a+Math.pow(Math.tan(b*x),2);
 //вычисляем знаменатель 
 znamen= b+Math.pow(Math.tan(a*x),2);
 //вычисляем y
 y= chisl/znamen;
    }else{
 //вычисляем числитель 
 chisl= a+Math.pow(Math.tan(b*x),2);
 //вычисляем знаменатель 
 znamen= b+Math.pow(Math.tan(a*x),2);
 //вычисляем y
 y= chisl/znamen;
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
 * @param xn
 * @param dx
 * @param xk
 * @param a
 * @param b
 */
 public double[][] taskA(double a, double b, double xn, double dx, double xk) {
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
 //вычисляем числитель 
 chisl= a+Math.pow(Math.tan(b*x),2);
 //вычисляем знаменатель 
 znamen= b+Math.pow(Math.tan(a*x),2);
 //вычисляем y
 y= chisl/znamen;
    }else{
 //вычисляем числитель 
 chisl= a+Math.pow(Math.tan(b*x),2);
 //вычисляем знаменатель 
 znamen= b+Math.pow(Math.tan(a*x),2);
 //вычисляем y
 y= chisl/znamen;
    }
 // Выводим результат
 result[0][i]=x;
 result[1][i]=y;
 i++;
 }
 return result;
 }          

}
