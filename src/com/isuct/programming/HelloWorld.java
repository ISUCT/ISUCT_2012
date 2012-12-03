package com.isuct.programming;

public class HelloWorld {

	public static void main(String[] args) {
		// создаем классику
		Mobile nokia1 = new Mobile(1, 5800, 1);
                nokia1.setPopolneniescheta(100);
		nokia1.setMoney(-300);
                
		if (nokia1.zvonok()) {
			System.out.println("Nokia1 Недостаточно средств для совершения звонка. Пополните счет." );
		
                } else {
			System.out.println("Nokia1 Идут гудки. Ждите.");
 
	
                }
                
                Mobile nokia2 = new Mobile(2, 8999, 4);
                nokia2.setPopolneniescheta(100);
		nokia2.setMoney(54);
                
		if (nokia2.zvonok()) {
			System.out.println("Nokia2 Недостаточно средств для совершения звонка. Пополните счет." );
		
                } else {
			System.out.println("Nokia2 Идут гудки. Ждите.");
 
	
                }
                
                Mobile nokia3 = new Mobile(2, 15000, 8);
                nokia3.setPopolneniescheta(100);
		nokia3.setMoney(-100);
                
		if (nokia3.zvonok()) {
			System.out.println("Nokia3 Недостаточно средств для совершения звонка. Пополните счет." );
		
                } else {
			System.out.println("Nokia3 Идут гудки. Ждите.");
 
	
                }
        }
       
}
	
