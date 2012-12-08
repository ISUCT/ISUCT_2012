package panzer;            
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author SAMSUNG
 */
public class HelloPanzer {
public static void main (String [] args) {
/*Создаем Т54 - СССР*/
Panzer T54 = new Panzer (1000, 1000, 2400);

    T54.setPosition(0,0);
    T54.setFuelLevel(400);
    T54.setConsumption (150);
    if (T54.move("x",100)){
        System.out.println("T54 Новые координаты расположения х = "+
        T54.getCoordinations()[0]+"y="+T54.getCoordinations()[1]);
    }else{
        System.out.println("T54 не хватит топлива");
    }
    if (T54.move("y", 300)){
        System.out.println("T54 Новые координаты теперь х="+
                T54.getCoordinations()[] + "y=" + T54.getCoordinations()[1]);
    }else{
        System.out.println("T54 не хватит топлива");    
    }    
    System.out.println("T54 проверим кооринаты х =" + T54.getCoordinations()[0]
            + "y =" + T54.getCoordinations()[1]);
}}