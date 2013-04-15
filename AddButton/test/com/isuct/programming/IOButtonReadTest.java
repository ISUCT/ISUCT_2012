package com.isuct.programming;

import static org.junit.Assert.*;

import java.io.*;


import org.junit.Test;

public class IOButtonReadTest {
	String fName="test.txt";
	
	@Test
	public void testRead() {
		File file = new File(fName);
		try{
		BufferedReader br = new BufferedReader(new FileReader(file));
		String s;
		while((s=br.readLine())!=null){
			System.out.print(s);
		}
		br.close();
		assertTrue(true);
		}catch(IOException fnfEx){
			fail("Something bad");
		}
	}
}