package task;

public class Task {

/**
* Здесь мы просто посчитаем
* Ольга Штамм args
* пример:
* 2
* x + кубический корень из (x+b)
* y=-------------------------------
* log(a+x)по основанию 2
* x=(поочередно несколько значений) 1.25; 2.5; 3.7
* a=1.1
* b=2
*/
public static void main(String [] args){
//Объявляем и инициализируем переменные
float x = 2.4f; 
float a = 7.2f;
float b = 4.2f;
//вычисляем числитель Math.pow(число, степень)
double chisl = Math.abs( a - b*x);
//вычисляем знаменатель Логарифм числа по основанию = (натуральный логарифм числа)/ (натуральный логарифм основания)
double znamen = Math.pow(Math.log10(x),3);
//вычисляем y
double y = Math.pow (chisl/znamen, 1/2f);
//Выводим результат
System.out.println("Икс равен = "+x+" Игрек равен = "+y);

//повторяем вычисления для второго значения х, но следует помнить. что переменные мы уже объявляли
//повторно их объявлять не надо, а надо только присвоить новые значени 

x=2.8f;
chisl = Math.pow(x, 2) + Math.pow((x+b), (1/3f));
znamen = Math.log(a+x)/Math.log(2);
y = Math.pow (chisl/znamen, 1/2f);
System.out.println("X = "+x+" Y = "+y);

//И для третьего значения так же и т.д (про циклы мы пока ничего не знаем)
x=3.9f;
chisl = Math.pow(x, 2) + Math.pow((x+b), (1/3f));
znamen = Math.log(a+x)/Math.log(2);
y = Math.pow (chisl/znamen, 1/2f);
System.out.println("Дано = "+x+" Посчитано = "+y);

x=4.7f;
chisl = Math.pow(x, 2) + Math.pow((x+b), (1/3f));
znamen = Math.log(a+x)/Math.log(2);
y = Math.pow (chisl/znamen, 1/2f);
System.out.println("Дано = "+x+" Посчитано = "+y);

x=3.16f;
chisl = Math.pow(x, 2) + Math.pow((x+b), (1/3f));
znamen = Math.log(a+x)/Math.log(2);
y = Math.pow (chisl/znamen, 1/2f);
System.out.println("Дано = "+x+" Посчитано = "+y);
}
}
