package com.isuct.programming;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.io.*;

public class MainGui {
	// Объявление всех компонентов, которые нам нужны

	// Метки для отображения информации
	// Их сраз и инициализируем текстом
	JLabel lblXn = new JLabel("Xn = ");
	JLabel lblDx = new JLabel("Dx = ");
	JLabel lblXk = new JLabel("Xk = ");

	JLabel lblResult = new JLabel("Результат");

	JTextField txtXn = new JTextField();
	JTextField txtDx = new JTextField();
	JTextField txtXk = new JTextField();

	JTextPane txtResult = new JTextPane();

	// Кнопка вычислить
	JButton btnCalc = new JButton("Рассчитать");
        JButton btnIOButtonSave = new JButton ("Сохранить");
        JButton btnIOButtonRead = new JButton ("Читать");

	JPanel windowContent;
	JFrame frame;

	// В конструкторе создаются все компоненты
	// и добавляются на фрейм с помощью комбинации
	// Borderlayout и Gridlayout
	public MainGui() {
		windowContent = new JPanel();
		// Задаём схему для этой панели
		GridLayout bl = new GridLayout(7, 2);
		windowContent.setLayout(bl);
		// Размещаем компоненты на панель

		windowContent.add(lblXn);
		windowContent.add(txtXn);
		windowContent.add(lblDx);
		windowContent.add(txtDx);
		windowContent.add(lblXk);
		windowContent.add(txtXk);
		windowContent.add(btnCalc);
                windowContent.add(btnIOButtonSave);
                windowContent.add(btnIOButtonRead);       
		windowContent.add(new JLabel());
		windowContent.add(lblResult);

		JScrollPane scrollPane = new JScrollPane(txtResult);
		windowContent.add(scrollPane);

		btnCalc.addActionListener(new CalculateEngine(this));
                btnIOButtonSave.addActionListener(new ButtonSave(this));
                btnIOButtonRead.addActionListener(new ButtonRead(this));

		frame = new JFrame("Calculator");
		frame.setContentPane(windowContent);
		// делаем размер окна достаточным
		// для того, чтобы вместить все компоненты
		frame.pack();
		// Наконец, отображаем окно
		frame.setVisible(true);

	}
}
