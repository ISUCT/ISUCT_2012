/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isuct.programming;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Пользователь
 */
public class MainGuiTest {
    String fName="test.txt";

    
    public MainGuiTest() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testWrite() {
String tst="Simple string";
File file = new File(fName);
try{
	PrintWriter out = new PrintWriter(file);
	out.println(tst);
	out.close();
	assertTrue(true);
}catch(FileNotFoundException fnfEx){
fail("Something bad");
}


}


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
