/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class ListenerForRFF implements ActionListener{
    public ListenerForRFF(MainGui gui) {
        // TODO Auto-generated constructor stu   
    }
      String fName = "test.txt";  
    @Override
    public void actionPerformed(ActionEvent e) {
     // TODO Auto-generated method stub
        
     System.out.println("Чтение");

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