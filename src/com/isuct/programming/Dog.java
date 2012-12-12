
package com.isuct.programming;

/**
 *
 * @author Stud_6
 */
public class Dog {/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


    private int length;
    private int height;
    private String breed;
    private int weight;
    private String color;
    private String name;
    private int age;
    private int numPaws;

    /**
     * Конструктор для создания собаки
     *
     * @param length длина
     * @param br порода
     * @param ht высота
     * @param wt масса
     * @param co цвет
     * @param nP количесиво лап
     * @param ag возраст
     * @param na имя
     */
    public Dog(int length, String br, int ht, int wt, String co, String na, int ag, int nP) {
        length = length;
        height = ht;
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

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }
    public String getColor() {
        return color;
    }
        public int getWeight() {
        return weight;
    }
    public String getBreed() {
        return breed;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
        public int getNuwPaws() {
        return numPaws;
    }
}

