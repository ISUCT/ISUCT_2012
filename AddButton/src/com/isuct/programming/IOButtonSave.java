package com.isuct.programming;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class IOButtonSave implements ActionListener {

	MainGui parent;

	public IOButtonSave(MainGui gui) {
		// TODO Auto-generated constructor stub
		parent = gui;
	}

	String fName = "test.txt";

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Сохранение");

		String textResult = parent.txtResult.getText();
		File file = new File(fName);
		try {
			PrintWriter out = new PrintWriter(file);
			out.println(textResult);
			out.close();
			assertTrue(true);
		} catch (FileNotFoundException fnfEx) {
			fail("Something bad");
		}

	}

    private void assertTrue(boolean b) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    private void fail(String something_bad) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

}