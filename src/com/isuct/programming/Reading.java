
package com.isuct.programming;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Reading implements ActionListener {
 
    public Reading(MainGui gui) {
         
    }
      String fName = "test.txt";  
    @Override
    public void actionPerformed(ActionEvent e) {
  
        
     System.out.println("Чтение из файла...");

		File file = new File(fName);
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String s;
			while ((s = br.readLine()) != null) {
				System.out.print(s);
			}
			br.close();
			//assertTrue(true);
		} catch (IOException fnfEx) {
			//fail("Something bad");
                
                }   
        
    }
    
}
