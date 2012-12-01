/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isuct.programming;

/**
 *
 * @author Stud_5
 */
public class Mouse {
    //Вес,длинна,ширина мыши
        private int massa;
	private int dlinna;
        private int shirina;
        
        //координаты компьютерной мыши
        private int x; //X
	private int y; //Y
        
        //Параметры
	private int numOfKnopka;
	private int color;
	private int numOfKoleso;
        
        //Параметры расхода электричества	
	private float elektro;
        
        /**
	 * Конструктор по умолчанию - создает "седаны"
	 * @param massa вес
	 * @param dlinna длинна
	 * @param shirina ширина
	 */
        
        public Mouse (int massa, int dlinna, int shirina)
        {
		this.massa=massa; 
		this.dlinna=dlinna;
		this.shirina=shirina;
		//И параметры типовой компьютерной мыши
		this.numOfKnopka = 2;
		this.color = 0XFFFFFF;
		this.numOfKoleso = 1;
        }
                /**
	 * А вот тут мы можем произвести любую комп. мышь
	 * @param massa вес
	 * @param dlinna длинна
	 * @param shirina ширина
	 * @param numOfKoleso Число колес
	 * @param numOfKnopka число кнопок
	 * @param color цвет
	 */
                public Mouse (int massa,int dlinna,int shirina,int numOfKoleso, int numOfKnopka,int color){
                
                this.massa=massa; 
		this.dlinna=dlinna;
		this.shirina=shirina;
                this.numOfKoleso=numOfKoleso;
                this.numOfKnopka=numOfKnopka;
                this.color=color;
                }
                //Методы получения значений закрытых параметров класса
	
	public int getMassa(){
		return this. massa;
	}

	public int getDlinna(){
		return this.dlinna;
	}

	public int getShirina(){
		return this.shirina;
	}

	public int getNumOfKoleso(){
		return this.numOfKoleso;
	}
	
	public int getNumOfKnopka(){
		return this.numOfKnopka;
	}
	public int getColor(){
		return this.color;
	}
	
	public int[] getCoords(){
		return new int[]{x,y};
	}
	
	public float getElektro(){
		return this.elektro;
	}
	
        //Методы - устанавливающие значения
	
	public void setElektro(float energiya){
		this.elektro = energiya;
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
		float needEnergiya = distance*elektro/100;
		if((elektro - needEnergiya)<0){
			return false;
		}else{
			if(axis.equals("x")){
				x+=distance;
			}else if(axis.equals("y")){
				y+=distance;
			}else{
				return false;
			}
			elektro-=needEnergiya;
			return true;
                }
	}
}

