
package com.isuct.programming;


public class Raketa {
    //длина,ширина,масса,цвет
	private int length;
	private int width;
        private int mass ;
        private int color;
	//координаты ракеты
	private int x; //X
	private int y; //Y

	//Параметры
	private int numOfIluminator;
	private int numOfStupen;
	
	//Параметры расхода	
	private float fuelLevel;
	private float rashod;
        private float rezervtopliva;

	/**
	 * @param length длина
	 * @param mass масса
	 * @param width ширина
	 */
	public Raketa(int length,int width,int mass){
		//Присваиваем переданные нам значения - закрытым членам класса
		//При этом я не проверяю правильность вводе - а надо бы
		this.length = length; 
		this.width = width;
                this.mass = mass;
                this.color=color;
		//И параметры типовой ракеты
		this.numOfIluminator = 3;
		this.numOfStupen = 3;
		
	}

	/**
	 * А вот тут мы можем произвести любую ракету
	 * @param length длина
	 * @param mass масса
	 * @param width ширина
         * @param color цвет
	 * @param numOfIluminator число иллюминаторов
	 * @param numOfStupen число ступений
	 */
	public Raketa(int length, int width, int mass,int color, int numOfIluminator, int numOfStupen){
		//Присваиваем переданные нам значения - закрытым членам класса

		this.length = length;
		this.width = width;
                this.mass = mass;
                this.color=color;
		this.numOfIluminator = numOfIluminator;
		this.numOfStupen = numOfStupen;
		
	}
        

	//Методы получения значений закрытых параметров класса

	

	public int getLength(){
		return this.length;
           }
      	public int getWidth(){
		return this.width;
	}
        public int getMass(){
		return this.mass;
	}
        public int getColor(){
		return this.color;
	}
	
	public int getNumOfIluminator(){
		return this.numOfIluminator;
	}

	public int getNumOfStupen(){
		return this.numOfStupen;
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
        public float getRezervtopliva(){
		return this.rezervtopliva;
	}

	//Методы - устанавливающие значения
	public void setRashod(float rashod){
		this.rashod = rashod;
	}
	
        public void setFuelLevel(float fuel){
		this.fuelLevel = fuel;
	}
        public void setRezervtopliva(float rezerv){
		this.rezervtopliva = rezerv;
	}
	public void setPosition(int x, int y){
		this.x= x;
		this.y= y;
	}

	/**
	 * Перемещаем ракету, но двигаться мы умеем только ортогонально
	 * @param axis ось x или y
	 * @param distance расстояние на оси
	 * @return истину или ложь - если переместиться не удасться
	 */

	public boolean move(String axis, int distance){
		//Посчитаем сколько топлива надо
		float needFuel = distance*(rashod+rezervtopliva)/100;
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


