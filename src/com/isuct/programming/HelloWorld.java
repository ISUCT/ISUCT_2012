package com.isuct.programming;

public class HelloWorld {

    public static void main(String[] args) {

        Moto kawasaki = new Moto(2000, 1100, 700, 170, 2, 21750, 0, 0, 0, 0);
        kawasaki.setFuelLevel(20);
        kawasaki.setRashod(8);
        if (kawasaki.move("x", 100)) {
            System.out.println(" Kawasaki Новые координаты теперь х= "
            + kawasaki.getCoords()[0] + " y= " + kawasaki.getCoords()[1]);
            } else {	
        System.out.println("Kawasaki Не хватит топлива");
        
        }
        if (kawasaki.move("y", 500)) {
        System.out.println("Kawasaki Новые координаты теперь х= "	
         + kawasaki.getCoords()[0] + " y= " + kawasaki.getCoords()[1]);
    } else {
        System.out.println("Kawasaki Не хватит топлива");
        }
        System.out.println("Kawasaki Проверим координаты х= " + kawasaki.getCoords()[0]	
        + " y= " + kawasaki.getCoords()[1]);
 
   Moto Yamaha= new Moto(2000, 1200, 750, 180, 2, 21750, 0, 0, 0, 0);		
   Yamaha.setFuelLevel(30);		
   Yamaha.setRashod(5);
   if (Yamaha.move("y", 100)) {
    System.out.println(" Yamaha Новые координаты теперь х= "
 		
        + Yamaha.getCoords()[0] + " y= " + Yamaha.getCoords()[1]);
 		
   } else {
     System.out.println("Yamaha Не хватит топлива");
     }
   if (Yamaha.move("y", 100)) {
 		
   System.out.println("Yamaha Новые координаты теперь х= "	
        + Yamaha.getCoords()[0] + " y= " + Yamaha.getCoords()[1]);
	
 } else {
	
    System.out.println("Yamaha Не хватит топлива");
}	
 }
}
