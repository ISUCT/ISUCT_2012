
package com.isuct.programming;

/**
 *
 * @author Stud_5
 */
public class HelloWorld {
   public static void main(String[] args) {
		// создаем классику
		Skuter Jamaha12 = new Skuter(130,1870 , 1175);
		Jamaha12.setPosition(0, 0);
		Jamaha12.setFuelLevel(6);
		Jamaha12.setRashod(1);
		if (Jamaha12.move("x", 100)) {
			System.out.println("Jamaha12 Новые координаты теперь х= "+ Jamaha12.getCoords()[0] + " y= " + Jamaha12.getCoords()[1]);

} else {
			System.out.println("Jamaha12 Не хватит топлива");
		}
                if (Jamaha12.move("y", 8)) {
			System.out.println("Jamaha12 Новые координаты теперь х= "
					+ Jamaha12.getCoords()[0] + " y= " + Jamaha12.getCoords()[1]);

    
                } else {
			System.out.println("Jamaha12 Не хватит топлива");
		}
		System.out.println("Jamaha12 Проверим координаты х= " + Jamaha12.getCoords()[0]
				+ " y= " + Jamaha12.getCoords()[1]);
                
                Skuter Suzuki= new Skuter(140, 2000, 1200,2,3);
		Suzuki.setPosition(0, 0);
		Suzuki.setFuelLevel(25);
                Suzuki.setRashod(1);
		if (Jamaha12.move("y", 10)) {
			System.out.println("Suzuki Новые координаты теперь х= "
					+ Jamaha12.getCoords()[0] + " y= " + Jamaha12.getCoords()[1]);
		} else {
                    System.out.println("Suzuki Не хватит топлива");
		}

		if (Jamaha12.move("y", 5)) {
			System.out.println("Suzuki Новые координаты теперь х= "
					+ Jamaha12.getCoords()[0] + " y= " + Jamaha12.getCoords()[1]);
		} else {
			System.out.println("Suzuki Не хватит топлива");




}
    
    }
}



