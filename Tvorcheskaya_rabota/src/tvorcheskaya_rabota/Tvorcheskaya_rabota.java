/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tvorcheskaya_rabota;

/**
 *
 * @author Alexandra
 */
public class Tvorcheskaya_rabota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Helicopter VertolMA10=new Helicopter(15000, 7000, 5000) ;
    VertolMA10.setPosition(0,0,0);
    VertolMA10.setFuelLevel(100);
    VertolMA10.setConsumption(25);
    if(VertolMA10.move("x", 150)){
         System.out.println("Новые координаты VertolMA10 после 1 перемещения:  х=" +VertolMA10.getCoords()[0]
                 +" y="+VertolMA10.getCoords()[1]+" z=" +VertolMA10.getCoords()[2]);
    }else{
        System.out.println("VertolMA10 не хватит топлива на 1 перемещение");                
         }
    if(VertolMA10.move("y", 50)){
         System.out.println("Новые координаты VertolMA10 после 2 перемещения: х="+VertolMA10.getCoords()[0]
                 +" y="+VertolMA10.getCoords()[1]+" z="+VertolMA10.getCoords()[2]);
    }else{
        System.out.println("VertolMA10 не хватит топлива на 2 перемещение");                
         }
    if(VertolMA10.move("z", 500)){
         System.out.println("Новые координаты VertolMA10 после 3 перемещения: х="+VertolMA10.getCoords()[0]
                 +" y="+VertolMA10.getCoords()[1]+" z="+VertolMA10.getCoords()[2]);
    }else{
        System.out.println("VertolMA10 не хватит топлива на 3 перемещение");                
         }
    System.out.println("Проверим координаты VertolMA10: x= "+VertolMA10.getCoords()[0]
                 +" y="+VertolMA10.getCoords()[1]+" z="+VertolMA10.getCoords()[2]);
    }
}

