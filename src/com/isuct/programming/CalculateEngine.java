package com.isuct.programming;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculateEngine implements ActionListener {

	MainGui parent;

	public CalculateEngine(MainGui gui) {
		parent = gui;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Calc defaultConstr = new Calc();
		try {
			double a = Double.parseDouble(parent.txtA.getText());
			double b = Double.parseDouble(parent.txtB.getText());
			double xn = Double.parseDouble(parent.txtXn.getText());
			double dx = Double.parseDouble(parent.txtDx.getText());
			double xk = Double.parseDouble(parent.txtXk.getText());
			double taskA[][] = defaultConstr.taskA(a, b, xn, dx, xk);
			String textResult = "";

			for (int i = 0; i < taskA[0].length; i++) {
				textResult += "X = " + taskA[0][i] + " Y= " + taskA[1][i]
						+ "\r\n";
			}

			parent.txtResult.setText(textResult);
		} catch (Exception ex) {
			parent.txtResult.setText("Вы ввели не все поля");
		}
	}

}