package com.isuct.programming;

import static org.junit.Assert.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Read implements ActionListener {

	public Read(MainGui gui) {
		// TODO Auto-generated constructor stub

	}

	String fName = "test.txt";

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		System.out.println("Чтение");

		File file = new File(fName);
		try {
                try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                    String s;
                    while ((s = br.readLine()) != null) {
                            System.out.print(s);
                    }
                }
			assertTrue(true);
		} catch (IOException fnfEx) {
			fail("Something bad");
		}
	}

}