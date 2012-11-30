/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tvorcheskaya_rabota;

/**
 *
 * @author Alexandra
 */
public class Helicopter {
   //ширина, длина и высота
private int length;
private int height;
private int width;

//параметры
private int weight;
private int diameterOfScrew;//диаметр винта
private int numOfDoors;
private int numOfWheels;
private int numOfScrews;
private int numOfSeets;
private int revs;//обороты
//параметры расхода
private float fuelLevel;//уровень топлива
private float consumption;//расход
//координаты
private int x;
private int y;
private int z;

public Helicopter(int length,int height, int width){
    //Присваиваем переданные значения закрытым членам класса
    
    this.length=Math.abs(length);
    this.height=Math.abs(height);
    this.width=Math.abs(width);
    
    //Присваиваем параметры типовой машины
    this.weight=10000;
    this.numOfDoors=4;
    this.diameterOfScrew=12;
    this.numOfWheels=3;
    this.numOfScrews=3;
    this.numOfSeets=5;
    this.revs=500;
}
    public Helicopter(int length, int heigh, int width, int weight, int diameterOfScrew,int numOfDoors,
            int numOfWheels, int numOfScrews, int numOfSeets, int revs){
  this.length=Math.abs(length);
    this.height=Math.abs(height);
    this.width=Math.abs(width);
    
    this.weight=Math.abs(weight);
    this.diameterOfScrew=Math.abs(diameterOfScrew);
    this.numOfDoors=Math.abs(numOfDoors);
    this.numOfWheels=Math.abs(numOfWheels);
    this.numOfScrews=Math.abs(numOfScrews);
    this.numOfSeets=Math.abs(numOfSeets);
    this.revs=Math.abs(revs);
   }
//Методы получения закрытых параметров класса
public int getLength(){
         return this.length;
    }
public int getHeight() {
        return this.height;
    }
public int getWidth(){
         return this.width;
    }
public int getWeight(){
         return this.weight;
    }
public int getDiameterOfScrew(){
         return this.diameterOfScrew;
    }
public int getNumOfDoors(){
         return this.numOfDoors;
    }
public int getNumOfWheels(){
         return this.numOfWheels;
    }
public int getNumOfScrews(){
         return this.numOfScrews;
    }
public int getNumOfSeets(){
         return this.numOfSeets;
    }
public int getRevs(){
         return this.revs;
    }
public int[] getCoords(){
         return new int[]{x,y,z};
         
    }
    //методы, устанавливающие значения
public void setConsumption(float consumption){
     this.consumption=consumption;
}
public void setFuelLevel(float fuelLevel){
     this.fuelLevel=fuelLevel;
}
public void setPosition(int x, int y, int z){
     this.x=x;
     this.y=y;
     this.z=z;
     }
   public boolean move(String axis, int distance){
    float needFuel=(distance*consumption/100);
    if ((fuelLevel-needFuel)<0){
        return false;
    
    }else{
        if(axis.equals("x")){
            x+=distance;
        }else if(axis.equals("y")){
            y+=distance;
        }else if(axis.equals("z")){
            z+=distance;
            
        }else{return false;}
        fuelLevel-=needFuel;
        return true;
    }
   }
}

