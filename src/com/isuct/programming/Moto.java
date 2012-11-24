package com.isuct.programming;

public class Moto {

    /**
     * Вводим закрытые переменные:
     * длина,высота,ширина,вес,колеса,цвет,координаты,уровень топлива,расход.
     */
    private int length;
    private int height;
    private int width;
    private int weight;
    private int wheels;
    private int color;
    private int x;
    private int y;
    private float fuelLevel;
    private float rashod;

    /**
     * Конструктор по умолчанию
     */
    public Moto() {
    }

    /**
     * Присваиваем переданные нам значения - закрытым членам класса
     *
     * @param length
     * @param height
     * @param width
     * @param weight
     * @param wheels
     * @param color
     * @param x
     * @param y
     * @param fuelLevel
     * @param rashod
     */
    public Moto(int length, int height, int width, int weight, int wheels, int color, int x, int y, float fuelLevel, float rashod) {
        this.length = length;
        this.height = height;
        this.width = width;
        this.weight = weight;
        this.wheels = wheels;
        this.color = color;
        this.x = x;
        this.y = y;
        this.fuelLevel = fuelLevel;
        this.rashod = rashod;
    }

    public int getLeigth() {
        return this.length;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidht() {
        return this.width;
    }

    public int getWeight() {
        return this.weight;
    }

    public int getWheels() {
        return this.wheels;
    }

    public int getColor() {
        return this.color;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
    public int[] getCoords(){
       return new int[]{x,y};
    }
    public float getFuelLevel() {
        return this.fuelLevel;
    }

    public float getRashod() {
        return this.rashod;
    }

    public void setFuelLevel(float fuel) {
        this.fuelLevel = fuel;
    }

    public void setRashod(float Rashod) {
        this.rashod = Rashod;
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;

    }

    /**
     * @param axis ось x или y
     * @param distance расстояние на оси
     * @return истину или ложь - если переместиться не удасться
     */
    public boolean move(String axis, int distance) {

        /**
         * Считаем нужное нам кол-во топлива
         */
       float needFuel = distance * rashod / 100;
        if ((fuelLevel - needFuel) < 0) {
            return false;
        } else {
            if (axis.equals("x")) {
                x += distance;
            } else if (axis.equals("y")) {
                y += distance;
            } else {
                return false;
            }
            fuelLevel -= needFuel;
            return true;
        }
    }
}

        
    


   