package com.isuct.programming;
import com.isuct.programming.Deer;


import java.text.DecimalFormat;

import com.isuct.programming.MainGui;


public class HelloWorld {

<<<<<<< HEAD
    
    public static void main(String[] args) {
      Deer D = new Deer("choral","brown",56,50,20,80, 4);
        System.out.println(D.GetType()+ " " + D.GetColour());
      
        
        
    }
}
=======
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
}
>>>>>>> master
