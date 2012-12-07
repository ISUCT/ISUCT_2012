package com.isuct.programming;

public class HelloWorld {

    public static void main(String[] args) {
        
        /** создаем
        */      
        
        ATV Godzilla = new ATV (1610, 1030, 900, 125, 0, 0, 0, 0, 0,0 );
        Godzilla.setFuelLevel(30);
        Godzilla.setRashod(5);
        if (Godzilla.move("x", 100)) {
            {	
        System.out.println("Godzilla Не хватит топлива");
        }
        if (Godzilla.move("y", 500)) {
        System.out.println("Godzilla Новые координаты теперь х= "	
         + Godzilla.getCoords()[0] + " y= " + Godzilla.getCoords()[1]);
    } else {
        System.out.println("Godzilla Не хватит топлива");
        }
        System.out.println("Godzilla Проверим координаты х= " + Godzilla.getCoords()[0]	
        + " y= " + Godzilla.getCoords()[1]);
 
   ATV Godzilla100 = new ATV (1610, 1030, 900, 125, 0, 0, 0, 0, 0, 0);		
   
   Godzilla.setFuelLevel(30);		
   Godzilla.setRashod(5);
   if (Godzilla.move("y", 100)) {
    System.out.println("Godzilla Новые координаты теперь х= "
 		
        + Godzilla.getCoords()[0] + " y= " + Godzilla.getCoords()[1]);
 		
   } else {
     System.out.println("Godzilla Не хватит топлива");
     }
   if (Godzilla.move("y", 100)) {
 		
   System.out.println("Godzilla Новые координаты теперь х= "	
        + Godzilla.getCoords()[0] + " y= " + Godzilla.getCoords()[1]);
	
 } else {
	
    System.out.println("Godzilla Не хватит топлива");
}	
 }
    }
}