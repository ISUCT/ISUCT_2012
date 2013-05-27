package graphicinterface;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
public class Client {

    public static void main(String[] args) {
System.out.println("Welcome to Client side");

	    Socket fromserver = null;
	    String host = "localhost";

	    System.out.println("Connecting to... "+host);
try{
	    fromserver = new Socket(host,4444);
	    BufferedReader in  = new
	     BufferedReader(new 
	      InputStreamReader(fromserver.getInputStream()));
	    PrintWriter    out = new 
	     PrintWriter(fromserver.getOutputStream(),true);
	    BufferedReader inu = new 
	     BufferedReader(new InputStreamReader(System.in));

	    String fuser,fserver;
            
            
	    while ((fuser = inu.readLine())!=null) {
	      out.println(fuser);
	      fserver = in.readLine();
	      System.out.println(fserver);
	      if (fuser.equalsIgnoreCase("close")) break;
	      if (fuser.equalsIgnoreCase("exit")) break;
	    }

	    out.close();
            
	    in.close();
	    inu.close();
	    fromserver.close();
	  } catch(IOException e){System.out.println("No connecting!");}
}
    }