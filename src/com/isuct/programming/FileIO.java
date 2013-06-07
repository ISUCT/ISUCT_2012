import static org.junit.Assert.*;

import java.io.*;


import org.junit.Test;

public class FileIO {
	String fName="test.txt";
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