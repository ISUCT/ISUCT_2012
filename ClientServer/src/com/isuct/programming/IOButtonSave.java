/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isuct.programming;

import com.isuct.programming.MainGui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;


  import java.io.FileNotFoundException;
import java.io.PrintWriter;
/**
 *
 * @author stud
 */
public class IOButtonSave implements ActionListener {
    
    MainGui parent;

    public IOButtonSave(MainGui gui) {
     // TODO Auto-generated constructor stub
		parent = gui;   
    }
    
    String fName = "test.txt";
    
    @Override
    public void actionPerformed(ActionEvent e) {
     // TODO Auto-generated method stub
		System.out.println("Сохранение");

		String textResult = parent.txtResult.getText();
		File file = new File(fName);
                 	try {
		PrintWriter out = new PrintWriter(file);
		out.println(textResult);
		out.close();
		//assertTrue(true);
		} catch (FileNotFoundException fnfEx) {
		//fail("Something bad");
		}
        
     
    }
}

