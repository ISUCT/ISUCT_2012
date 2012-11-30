package com.isuct.programming;

/**
 * Класс (фабрика, новый тип данных) по производству автомобилей
 * с закрытыми полями доступа
 * 
 * @author jskonst
 *
 */
public class Сar{
	/**
	 * Закрытые члены класса
	 */
	//Ширина, длина и высота машины
	private int length;
	private int height;
	private int width;
	
	
	//координаты машины
	private int x; //X
	private int y; //Y
	
	
	//Параметры
	private int numOfWheels;
	private int numOfDors;
	private int numOfSeets;
	
	//Параметры расхода	
	private float fuelLevel;
	private float rashod;
	
	/**
	 * Конструктор по умолчанию - создает "седаны"
	 * @param length длина
	 * @param height высота
	 * @param width ширина
	 */
	public аа(int length, int height, int width){
		//Присваиваем переданные нам значения - закрытым членам класса
		//При этом я не проверяю правильность вводе - а надо бы
		this.length = length; 
		this.height = height;
		this.width = width;
		//И параметры типовой машины
		this.numOfDors = 4;
		this.numOfSeets = 5;
		this.numOfWheels = 4;
	}
	
	/**
	 * А вот тут мы можем произвести любую машину
	 * @param length длина
	 * @param height высота
	 * @param width ширина
	 * @param numOfWheels Число колес
	 * @param numOfDors число дверей
	 * @param numOfSeets число сидений
	 */
	public аа(int length, int height, int width, int numOfWheels, int numOfDors, int numOfSeets){
		//Присваиваем переданные нам значения - закрытым членам класса
		
		this.length = length;
		this.height = height;
		this.width = width;
		this.numOfDors = numOfDors;
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

	public int getNumOfDors(){
		return this.numOfDors;
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
	 * Перемещаем машину, но двигаться мы умеем только ортогонально
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

