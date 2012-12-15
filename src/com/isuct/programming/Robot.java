 

package com.isuct.programming;

public class Robot {

    /**
     * Закрытые члены класса
     */
    private int length;
    private int height;
    private int width;
    //Координаты робота
    private int x;
    private int y;
    //Свойства
    private int numOfWheels;
    private int numOfHends;
    private int numOfEyesCamera;
    private int voice;
    //Параметры заряда батареи
    private float batteryLevel;
    private float charge;

    public Robot(int length, int height, int width) {

        this.length = length;
        this.height = height;
        this.width = width;
        // Образец робота
        this.numOfWheels = 12;
        this.numOfHends = 2;
        this.numOfEyesCamera = 1;


    }

    public Robot(int length, int height, int width, int numOfWheels, int numOfHends, int numOfEyesCamera) {


        this.length = length;
        this.height = height;
        this.width = width;
        this.numOfWheels = numOfWheels;
        this.numOfHends = numOfHends;
        this.numOfEyesCamera = numOfEyesCamera;
    }

    public int getHeigth() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public int getLength() {
        return this.length;
    }

    public int getNumOfWheels() {
        return this.numOfWheels;
    }

    public int getNumOfHends() {
        return this.numOfHends;
    }

    public int getNumOfEyesCamera() {
        return this.numOfEyesCamera;
    }

    public int[] getCoordinates() {
        return new int[]{x, y};
    }

    public float getBatteryLevel() {
        return this.batteryLevel;
    }

    public float getDischarged() {
        return this.charge;
    }

    public void setBattery(float batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public void setCharge(float charge) {
        this.charge = charge;
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void speak() {
        System.out.println("Привет хозяин!Меня зовут Y155");
    }

    public void hibernate() {
        System.out.println("Досвидания!");

    }

    public void lowBattery() {
        System.out.println("Хозяин.Поставь меня на зарядку!");
    }

    public boolean move(String axis, int distance) {
        // Емкость аккумулятора 
        float needBatteryLevel = charge - distance;
        if (needBatteryLevel < 0) {
            return false;
        } else {
            if (axis.equals("x")) {
                x += distance;
            } else if (axis.equals("y")) {
                y += distance;
            } else {
                return false;
            }
            needBatteryLevel = charge;
            return true;
        }
    }
}	 
