package fox;

/**
*
* Дизайн и создание логтипов, фирменных стилей, на Stud_6
*/
public class Fox {/*
* To change this template, choose Tools | Templates
* and open the template in the editor.
*/

private int length;
private String breed;
private int weight;
private String color;
private String name;
private int age;
private int numPaws;

/**
* Конструктор для создания собаки
*
* @param  length длина
* @param breed  высота
* @param wt масса
* @paramco цвет
* @param nP количесиво лап
* @param ag возраст
* @param na имя
*/
public Fox(int length, String br, int wt, String co, String na, int ag, int nP) {
length = length;
color = co;
weight = wt;
breed = br;
age = ag;
numPaws = nP;
name = name;

if (nP < 4) {
nP = 4;
} else {
if (nP > 4) {
nP = 4;

}
}
}

