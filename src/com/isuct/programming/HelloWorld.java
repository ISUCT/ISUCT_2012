package com.isuct.programming;

<<<<<<< HEAD
import com.isuct.programming.Dog;

public class HelloWorld {

    public static void main(String[] args) {

        Dog D = new Dog(50, "pug", 30, 10, "blac", "Jason", 5, 4);
        System.out.println(D.getBreed());
    }
=======
import java.text.DecimalFormat;

import com.isuct.programming.MainGui;


public class HelloWorld {

	public static void main(String[] args) {
		//Решим задачи А и задачу B с использованием внешнего класса Calc
		//Сперва используем конструктор по умолчанию
		//Теперь все методы внутри класса CALC нам просто возвращают массивы значений
		//а их вывод мы реализуем здесь
		//Это позволит нам в дальнейшем использовать класс Calc с графическим интерфейсом
		//поскольку у нас теперь есть четкий "вход" и "выход" в каждом методе
		//Свои "старые лабораторные" я получил отмотав назад в git
		MainGui myGui = new MainGui();
		
	}
>>>>>>> master
}
