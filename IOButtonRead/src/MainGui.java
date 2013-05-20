/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Юлия
 */
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
	
	JLabel lblXn = new JLabel("Xn = ");
	JLabel lblDx = new JLabel("Dx = ");
	JLabel lblXk = new JLabel("Xk = ");
	JLabel lblA = new JLabel("a = ");
	JLabel lblB = new JLabel("b = ");
	
	JLabel lblResult = new JLabel("Результат");
	
	JTextField txtA = new JTextField();
	JTextField txtB = new JTextField();
	JTextField txtXn = new JTextField();
	JTextField txtDx = new JTextField();
	JTextField txtXk = new JTextField();
	
	JTextPane txtResult = new JTextPane();
	
	//Кнопка вычислить
	JButton btnCalc = new JButton("Рассчитать");
	//Кнопка сохранения
	JButton btnSave = new JButton("Сохранить");
	//Кнопка чтения
	JButton btnRead = new JButton("Прочитать");
	
	JPanel windowContent;
	JPanel windowContentIO;
	JFrame frame;
	private final JPanel panel = new JPanel();
	private final JPanel panel_1 = new JPanel();
	public MainGui() {
		windowContent = new JPanel();
		windowContent.setLayout(new BorderLayout(0, 0));
	
		windowContent.add(panel_1, BorderLayout.WEST);
		panel_1.setLayout(new GridLayout(0, 2, 0, 0));
		panel_1.add(lblA);
		panel_1.add(txtA);
		panel_1.add(lblB);
		panel_1.add(txtB);
		panel_1.add(lblXn);
		panel_1.add(txtXn);
		panel_1.add(lblDx);
		panel_1.add(txtDx);
		panel_1.add(lblXk);
		panel_1.add(txtXk);
		windowContent.add(btnCalc, BorderLayout.SOUTH);

		
		btnCalc.addActionListener(new CalculateEngine(this));
		btnSave.addActionListener(new IOButtonSave(this));
		btnRead.addActionListener(new IOButtonRead(this));
		
		
		frame = new JFrame("Calculator");
		frame.setContentPane(windowContent);
		
		windowContent.add(panel, BorderLayout.CENTER);
		panel.add(lblResult);
	
		
		JScrollPane scrollPane = new JScrollPane(txtResult);
		panel.add(scrollPane);
		panel.add(btnSave);
		panel.add(btnRead);
	
		frame.pack();
	
		frame.setVisible(true);

	}
}