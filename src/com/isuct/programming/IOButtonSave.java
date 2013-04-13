package com.isuct.programming;


import static org.junit.Assert.fail;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class IOButtonSave implements ActionListener {

	/**
	 * @param args
	 */
		
	public IOButtonSave(MainGui gui){
		// TODO Auto-generated constructor stub
	
	}
	
	String fName = "test.txt";

	
	public void testWrite() {
		String tst = "Simple string";
		File file = new File(fName);
		try {
			PrintWriter out = new PrintWriter(file);
			out.println(tst);
			out.close();
			
		} catch (FileNotFoundException fnfEx) {
			fail("Something bad");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Сохранение");

	}

}
