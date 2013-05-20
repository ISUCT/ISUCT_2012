
package com.isuct.programming;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class IOButtonSave implements ActionListener {
    
    MainGui parent;

    public IOButtonSave(MainGui gui) {
    
		parent = gui;   
    }
    
    String fName = "test.txt";
    
    @Override
    public void actionPerformed(ActionEvent e) {
     
		System.out.println("Save");

		String textResult = parent.txtResult.getText();
		File file = new File(fName);
                 	try {
		PrintWriter out = new PrintWriter(file);
		out.println(textResult);
		out.close();
		
		} catch (FileNotFoundException fnfEx) {
		
		}
        
     
    }
}


