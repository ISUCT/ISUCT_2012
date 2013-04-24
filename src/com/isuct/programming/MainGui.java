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
		windowContent.setLayout(new BorderLayout(5, 30));

		windowContent.add(panel_1, BorderLayout.WEST);
                
		panel_1.setLayout(new GridLayout(0, 2, 0, 0));
		panel_1.add(lblA);
		panel_1.add(txtA);
		panel_1.add(lblXn);
		panel_1.add(txtXn);
		panel_1.add(lblDx);
		panel_1.add(txtDx);
		panel_1.add(lblXk);
		panel_1.add(txtXk);
                
		windowContent.add(btnCalc, BorderLayout.EAST);
                windowContent.add(sifCalc, BorderLayout.NORTH);
		windowContent.add(rffCalc, BorderLayout.SOUTH);
                
		btnCalc.addActionListener(new CalculateEngine(this));
                sifCalc.addActionListener(new ListenerForSIF(this)); 
		rffCalc.addActionListener(new ListenerForRFF(this));

		frame = new JFrame("Calculator");
		frame.setContentPane(windowContent);

		windowContent.add(panel, BorderLayout.CENTER);
		panel.add(lblResult);
            
                

		JScrollPane scrollPane = new JScrollPane(txtResult);
		panel.add(scrollPane);
		// делаем размер окна достаточным
		// для того, чтобы вместить все компоненты
		frame.pack();
		// отображаем окно
		frame.setVisible(true);

	}
}