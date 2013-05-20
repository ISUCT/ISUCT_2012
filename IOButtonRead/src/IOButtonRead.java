/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Юлия
 */


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;



public class IOButtonRead implements ActionListener {
			
	public IOButtonRead(MainGui gui){
		// TODO Auto-generated constructor stub
		
	}
	
	String fName = "test.txt";
	
	public void testRead() {
		
		File file = new File(fName);
		try{
		BufferedReader br = new BufferedReader(new FileReader(file));
		String s;
		while((s=br.readLine())!=null){
			System.out.print(s);
		}
		br.close();
		
		}catch(IOException fnfEx){
			fail("Something bad");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
	System.out.println("Чтение");}

}

