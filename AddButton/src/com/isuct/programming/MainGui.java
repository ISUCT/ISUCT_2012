package com.isuct.programming;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import com.isuct.programming.CalculateEngine;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainGui extends JFrame{
	//Объявление всех компонентов, которые нам нужны



	//Метки для отображения информации
	//Их сраз и инициализируем текстом
	JLabel lblXn = new JLabel("Xn = ");
	JLabel lblDx = new JLabel("Dx = ");
	JLabel lblXk = new JLabel("Xk = ");
	JLabel lblA = new JLabel("a = ");


	JLabel lblResult = new JLabel("Результат");

	JTextField txtA = new JTextField();
	JTextField txtB = new JTextField();
	JTextField txtXn = new JTextField();
	JTextField txtDx = new JTextField();
	JTextField txtXk = new JTextField();

	JTextPane txtResult = new JTextPane();

	//Кнопка вычислить
	JButton btnCalc = new JButton("Рассчитать");
        JButton sifCalc = new JButton("Сохранить в файл");	
	JButton rffCalc = new JButton("Читать из файла");
	JPanel windowContent;
	JFrame frame;
        private final JPanel panel = new JPanel();
	private final JPanel panel_1 = new JPanel();
	// В конструкторе создаются все компоненты
	// и добавляются на фрейм с помощью комбинации
	// Borderlayout и Gridlayout
	public MainGui() {
		windowContent = new JPanel();
                windowContent.setLayout(new BorderLayout(0, 0));
		// Задаём схему для этой панели
		GridLayout bl = new GridLayout(7,2);
		windowContent.setLayout(bl);
		//Размещаем компоненты на панель

		windowContent.add(lblA);
		windowContent.add(txtA);
                panel_1.setLayout(new GridLayout(0, 2, 0, 0));


		windowContent.add(lblXn);
		windowContent.add(txtXn);
		windowContent.add(lblDx);
		windowContent.add(txtDx);
		windowContent.add(lblXk);
		windowContent.add(txtXk);
		windowContent.add(btnCalc);
		windowContent.add(new JLabel());
		windowContent.add(lblResult);
                windowContent.add(sifCalc, BorderLayout.SOUTH);
		windowContent.add(rffCalc, BorderLayout.SOUTH);

		JScrollPane scrollPane = new JScrollPane(txtResult);
		windowContent.add(scrollPane);

		btnCalc.addActionListener(new CalculateEngine(this));
                sifCalc.addActionListener(new ListenerForSIF (this) {

                @Override
                public void actionPerformed(ActionEvent e) {
                    throw new UnsupportedOperationException("Not supported yet.");
                }
            }); 
		rffCalc.addActionListener(new ListenerForRFF (this) {

                @Override
                public void actionPerformed(ActionEvent e) {
                    throw new UnsupportedOperationException("Not supported yet.");
                }
            }); 
		frame = new JFrame("Calculator");
		frame.setContentPane(windowContent);
		// делаем размер окна достаточным
		// для того, чтобы вместить все компоненты
		frame.pack();
		// Наконец, отображаем окно
		frame.setVisible(true);

	}

    private static abstract class ListenerForSIF implements ActionListener {

        public ListenerForSIF(MainGui aThis) {
        }
    }

    private static abstract class ListenerForRFF implements ActionListener {

        public ListenerForRFF(MainGui aThis) {
        }
    }
}