/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package panzer;

/**
 *
 * @author KeksinaKA
 */
public class Panzer {
/**
 * Закрытые члены класса:
 * длина
 * высота
 * ширина
 * вес
 * экипаж
 * Параметры длина, высота, ширина вводятся в мм, вес - в тоннах
 */    
private int lenght;
private int height;
private int width;
private int weight;
private int crew;
/** 
 * Кординаты (месторасположение)
 */
private int x;
private int y;
/**
 * Параметры длины и ширины гусеницы
 */
private int weightOfTrack;
private int lenghtOfTrack;
/**
 * Параметры расхода топлива
 */
private float fuelLevel;
private float consumption;
/**
 * Конструктор по умолчанию
 */

public Panzer (int lenght, int height, int width){
    //Длина, высота, ширина
    this.lenght = Math.abs (lenght);
    this.height = Math.abs (height);
    this.width = Math.abs (width);
}
public Panzer (int lenght, int height, int width, int winght, int crew, int weightOfTrack, int lenghtOfTrack){
    //Длина, высота, ширина, вес, экипаж, ширина гусеницы, длина гусеницы
    this.lenght = Math.abs (lenght);
    this.height = Math.abs (height);
    this.width = Math.abs (width);
    this.weight = Math.abs (weight);
    this.crew = Math.abs (crew);
    this.weightOfTrack = Math.abs (weightOfTrack);
    this.lenghtOfTrack = Math.abs (lenghtOfTrack);
   }
public int getHeight (){
    return this.height;
}
public int getWidth (){
    return this.width;
}
public int getLenght (){
    return this.lenght;
}
public int getWinght (){
    return this.weight;
    }
public int getCrew (){
    return this.crew;
}
public int getWeightOfTrack () {
    return this.weightOfTrack;
}
public int getLenghtOfTrack () {
    return this.lenghtOfTrack;   
}
public int [] getCoordinations (){
    return new int [] {x,y};
}
public float getFuelLevel (){
    return this.fuelLevel;
}
public float getConsumption () {
    return this.consumption;
}
public void setPosition (int x, int y) {
    this.x=x;
    this.x=x;
}
public void setFuelLevel (float fuel){
    this.fuelLevel=fuel;
}
public void setConsumption (float consumption){
    this.consumption=consumption;
}

public boolean move(String axis, int distance ){
    float needFuel = distance*consumption/100;
    if ((fuelLevel-needFuel)<0){
        return false;
    }else{
        if (axis.equals ("x")){
            x+=distance;
            /*axis(ось) equal(равный)*/
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

