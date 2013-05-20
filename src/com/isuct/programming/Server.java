package com.isuct.programming;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
		    System.out.println("Welcome to Server side");
		    BufferedReader in = null;
		    PrintWriter    out= null;

		    ServerSocket servers = null;
		    Socket       fromclient = null;
                    while (true) {
		  
		    try {
		      servers = new ServerSocket(4444);
		    } catch (IOException e) {
		      System.out.println("Couldn't listen to port 4444");
		      System.exit(-1);
		    }

		    try {
		      System.out.print("Waiting for a client...");
		      fromclient= servers.accept();
		      System.out.println("Client connected");
		    } catch (IOException e) {
		      System.out.println("Can't accept");
		      System.exit(-1);
		    }

		    in  = new BufferedReader(new 
		     InputStreamReader(fromclient.getInputStream()));
		    out = new PrintWriter(fromclient.getOutputStream(),true);
		    String input;

		    
		   
                        System.out.println("Wait for messages");
                        input = in.readLine();
                        if (input==null){
                            continue;
                        }
		     if (input.equalsIgnoreCase("exit")) {
                            break;
                        }
                     String [] params = input.split(",");
                     float [] f = new float [params.length];
                     for (int i=0;i<params.length;i++) {
                         f[i] = Float.parseFloat(params[i]);
                     }

                     Calc my=new Calc();
                     double[][] res=my.taskA(f[0], f[1], f[2], f[3], f[4]);
                     String textResult = "";
                     	for (int i = 0; i < res[0].length; i++) {
				textResult += "X = " + res[0][i] + " Y= " + res[1][i]
						+ "\r\n";
			}
		     System.out.print(textResult);
		    out.print(textResult);
                    
		    out.close();
		    in.close();
		    fromclient.close();
		    servers.close();
		  }
    
    
    }

}
