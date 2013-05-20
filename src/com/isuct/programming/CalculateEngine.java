package com.isuct.programming;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;


public class CalculateEngine implements ActionListener{

    
	MainGui parent;
	
	public CalculateEngine(MainGui gui) {
		// TODO Auto-generated constructor stub
		parent=gui;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Calc defaultConstr = new Calc();
                try{
                    
		double a = Double.parseDouble(parent.txtA.getText());		
		double xn = Double.parseDouble(parent.txtXn.getText());
		double dx = Double.parseDouble(parent.txtDx.getText());
		double xk = Double.parseDouble(parent.txtXk.getText());
		double taskA[][]=defaultConstr.taskA(a,xn,dx,xk);
		String params = parent.txtA.getText().toString()+","+parent.txtXn.getText()+","+parent.txtDx.getText()+","+parent.txtXk.getText();
                        
                         

	    Socket fromserver = null;
	    String host = "localhost";
	    
	    System.out.println("Connecting to... "+host);

	    fromserver = new Socket(host,4444);
	    
            BufferedReader in  = new
	     BufferedReader(new 
	      InputStreamReader(fromserver.getInputStream()));
            
	    PrintWriter    out = new 
	     PrintWriter(fromserver.getOutputStream(),true);
	    
	    String fuser,fserver;
            
            fuser=params;
	      out.println(fuser);
              String output="";
              while ((fserver = in.readLine())!=null) {
                  output=output+fserver+"\r\n";
                  System.out.println(fserver);
		}
		
		parent.txtResult.setText(output);
                	
            out.close();
	    in.close();
	    fromserver.close();
            
		} catch (Exception ex){
			parent.txtResult.setText("Вы ввели не все поля");
		}
	}

}
