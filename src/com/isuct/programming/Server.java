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
		PrintWriter out = null;

		ServerSocket servers = null;
		Socket fromclient = null;

		// create server socket
		try {
			servers = new ServerSocket(4444);
		} catch (IOException e) {
			System.out.println("Couldn't listen to port 4444");
			System.exit(-1);
		}

		try {
			System.out.print("Waiting for a client...");
			fromclient = servers.accept();
			System.out.println("Client connected");
		} catch (IOException e) {
			System.out.println("Can't accept");
			System.exit(-1);
		}

		in = new BufferedReader(new InputStreamReader(
				fromclient.getInputStream()));
		out = new PrintWriter(fromclient.getOutputStream(), true);
		String input;

		System.out.println("Wait for messages");
		while ((input = in.readLine()) != null) {
			if (input.equalsIgnoreCase("exit"))
				break;
			// Разделяем строку с запятыми на фрагменты и 
			// помещаем их в массив
			// parts 														(Treat Nature Serious)

			String parts[] = input.split(",");

			Calc defaultConstr = new Calc();
			double a = Double.parseDouble(parts[0]);
			double b = Double.parseDouble(parts[1]);
			double xn = Double.parseDouble(parts[2]);
			double dx = Double.parseDouble(parts[3]);
			double xk = Double.parseDouble(parts[4]);
			double taskA[][] = defaultConstr.taskA(a, b, xn, dx, xk);
			String textResult = "";

			for (int m = 0; m < taskA[0].length; m++) {
				textResult += "X = " + taskA[0][m] + " Y= " + taskA[1][m]
						+ "\r\n";
			}

			out.println("Result> " + textResult);
			System.out.println(textResult);

		}

		out.close();
		in.close();
		fromclient.close();
		servers.close();
	}
}
