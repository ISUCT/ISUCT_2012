/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isuct.programming;

/**
 *
 * @author stud_5
 */
public class HelloWorld {

    private int length;
    private int height;
    private int width;
    private int weight;
    private int cargoWeight;
    private int numOfWheels;
    private int numOfDors;
    private int numOfSeets;
    private double fuelLevel;
    private int rashod;
    private int colour;

    /**
     * Конструктор для создания машин
     *
     * @param length длина
     * @param wh ширина
     * @param ht высота
     * @param wt масса
     * @param nW число колес
     * @param nS число сидений
     * @param nD число дверей
     */
    public Car(int length, int wh, int ht, int wt, int nW, int nS, int nD) {
        this.length = Math.abs(length);
        this.height = Math.abs(ht);
        this.width = Math.abs(wh);
        this.weight = Math.abs(wt);

        if (nW < 2) {
            nW = 2;
        } else {
            if (nW > 3) {
                if (nW % 2 > 0) {
                    nW += 1;
                }
            }

        }
        this.numOfWheels = nW;
        this.numOfSeets = nS;
        this.numOfDors = nD;


    }

    public int getLength() {
        return this.length;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public int getNumOfWheels() {
        return this.numOfWheels;
    }
    
    public void move(int distance){
        fuelLevel -= distance*rashod/100;
    }
    
    public double getFuelLevel(){
        return this.fuelLevel;
    }
    
    public void setFuelLevel(double fl){
        this.fuelLevel = fl;
    }
    
    public void setRash(int rasx){
        this.rashod = rasx;
    }
    
}

} 
