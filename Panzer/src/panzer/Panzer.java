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
 * Все параметры вводятся в см. Вес - в тоннах
 */    
private int lenght;
private int height;
private int width;
private int weight;
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
private float rashod;
/**
 * Конструктор по умолчанию
 */

public Panzer (int lenght, int height, int width){
    this.lenght = Math.abs (lenght);
    this.height = Math.abs (height);
    this.width = Math.abs (width);
}
public Panzer (int lenght, int height, int winght, int weightOfTrack, int lenghtOfTrack){
    this.lenght = Math.abs (lenght);
    this.height = Math.abs (height);
    this.width = Math.abs (width);
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
public float getRashod () {
    return this.rashod;
}
public void setPosition (int x, int y) {
    this.x=x;
    this.x=x;
}
public boolean move(String axis, int distance ){
    float needFuel = distance*rashod/1000;
    if ((fuelLevel-needFuel)<0){
        return false;
    }else{
        if (axis.equals ("x")){
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

