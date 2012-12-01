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
 * Параметры
 */    
private int lenght;
private int height;
private int width;
private int weight;
private int wheels;
private int color;
/** 
 * Кординаты
 */
private int x;
private int y;
/**
 * Параметры длины и ширины гусеницы - weightOfTrack и lenghtOfTrack
 */
private int weightOfTrack;
private int lenghtOfTrack;
/**
 * Параметры расхода топлива
 */
private float floutLevel;
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
    this.lenght = lenght;
    this.height = height;
    this.width = width;
    this.weightOfTrack = weightOfTrack;
    this.lenghtOfTrack = lenghtOfTrack;
   }
public int getHeight (){
return this.height;
}
public int getWidth (){
    return this.width;
}
publc int getLenght ()
}


