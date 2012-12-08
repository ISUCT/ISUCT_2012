/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isuct.programming;

/**
 *
 * @author Stud_5
 */
public class Bike {
     /**
	 * Закрытые члены класса
	 */
	//Ширина, длина и высота мотоцикла
	private int length;
	private int height;
	private int width;


	//координаты мотоцикла
	private int x; //X
	private int y; //Y


	//Параметры
	private int numOfWheels;
	private int numOfSeets;

	//Параметры расхода	
	private float fuelLevel;
	private float rashod;

	/**
	 * Конструктор по умолчанию - создает "мотоциклы"
	 * @param length длина
	 * @param height высота
	 * @param width ширина
	 */
	public Bike(int length, int height, int width){
		//Присваиваем переданные нам значения - закрытым членам класса
		//При этом я не проверяю правильность вводе - а надо бы
		this.length = length; 
		this.height = height;
		this.width = width;
		//И параметры типового мотоцикла
		this.numOfSeets = 2;
		this.numOfWheels = 2;
	}

	/**
	 * А вот тут мы можем произвести любой мотоцикл
	 * @param length длина
	 * @param height высота
	 * @param width ширина
	 * @param numOfWheels Число колес
	 * @param numOfSeets число сидений
	 */
	public Bike(int length, int height, int width, int numOfWheels, int numOfSeets){
		//Присваиваем переданные нам значения - закрытым членам класса

		this.length = length;
		this.height = height;
		this.width = width;
		this.numOfSeets = numOfSeets;
		this.numOfWheels = numOfWheels;
	}

	//Методы получения значений закрытых параметров класса

	public int getHeigth(){
		return this.height;
	}

	public int getWidth(){
		return this.width;
	}

	public int getLength(){
		return this.length;
	}

	public int getNumOfSeets(){
		return this.numOfSeets;
	}
	public int getNumOfWheels(){
		return this.numOfWheels;
	}

	public int[] getCoords(){
		return new int[]{x,y};
	}

	public float getFuelLevel(){
		return this.fuelLevel;
	}
	public float getRashod(){
		return this.rashod;
	}

	//Методы - устанавливающие значения
	public void setRashod(float rashod){
		this.rashod = rashod;
	}
	public void setFuelLevel(float fuel){
		this.fuelLevel = fuel;
	}
	public void setPosition(int x, int y){
		this.x= x;
		this.y= y;
	}

	/**
	 * Перемещаем мотоцикл, но двигаться мы умеем только ортогонально
	 * @param axis ось x или y
	 * @param distance расстояние на оси
	 * @return истину или ложь - если переместиться не удасться
	 */

	
	public boolean move(String axis, int distance){
		//Посчитаем сколько топлива надо
		float needFuel = distance*rashod/100;
		if((fuelLevel - needFuel)<0){
			return false;
		}else{
			if(axis.equals("x")){
				x+=distance;
			}else if(axis.equals("y")){
				y+=distance;
			}else{
				return false;
			}
			fuelLevel-=needFuel;
			return true;
		}
	}
}