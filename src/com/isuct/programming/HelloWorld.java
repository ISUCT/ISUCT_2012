package com.isuct.programming;

import com.isuct.programming.car;

public class HelloWorld {

    public static void main(String[] args) {
	//Решим задачи А и задачу B с использованием внешнего класса Calc
	//Сперва используем конструктор по умолчанию
	//Теперь все методы внутри класса CALC нам просто возвращают массивы значений
	//а их вывод мы реализуем здесь
	//Это позволит нам в дальнейшем использовать класс Calc с графическим интерфейсом
	//поскольку у нас теперь есть четкий "вход" и "выход" в каждом методе
	//Свои "старые лабораторные" я получил отмотав назад в git

	Calc defaultConstr = new Calc();
	System.out.println("------------Решаем задачу В------------");
	double taskB[][]=defaultConstr.taskB(new double[]{0.1,0.35,0.4,0.55,0.6 });
	for (int i=0;i<taskB[0].length;i++){
            System.out.println("X= "+taskB[0][i]+" Y= "+ taskB[1][i]);
	}

	System.out.println("------------Решаем задачу A ------------");
	double taskA[][]=defaultConstr.taskA(0.26, 0.08, 0.66);
	for (int i=0;i<taskA[0].length;i++){
        	System.out.println("X= "+taskA[0][i]+" Y= "+ taskA[1][i]);
	}
	//Решим задачу А - с использованием перегруженного конструктора
	System.out.println("------------Решаем задачу A с перегруженным конструктором------------");
	Calc nDefConstr = new Calc(0.26, 0.08, 0.66);
	//тогда мы можем вызвать метод без передачи дополнительных параметров
	double taskA1[][]=nDefConstr.taskA();
	for (int i=0;i<taskA1[0].length;i++){
        	System.out.println("X= "+taskA1[0][i]+" Y= "+ taskA1[1][i]);
	}
	}
    }
