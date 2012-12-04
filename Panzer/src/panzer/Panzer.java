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
 * цвет
 * Все параметры вводятся в см. Вес - в тоннах
 */    
private int lenght;
private int height;
private int width;
private int weight;
private int color;
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
publc int getLenght (){
}


