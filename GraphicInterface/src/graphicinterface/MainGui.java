package graphicinterface;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class MainGui {

    JLabel lblXn = new JLabel("Xn = ");
    JLabel lblDx = new JLabel("Dx = ");
    JLabel lblXk = new JLabel("Xk = ");
    JLabel lblResult = new JLabel("Результат");
    JTextField txtA = new JTextField();
    JTextField txtB = new JTextField();
    JTextField txtXn = new JTextField();
    JTextField txtDx = new JTextField();
    JTextField txtXk = new JTextField();
    JTextPane txtResult = new JTextPane();
    JButton btnCalc = new JButton("Рассчитать");
    JButton btnRec = new JButton("Запись");
    JButton btnDisp = new JButton("Вывод");
    JPanel windowContent;
    JFrame frame;

    public MainGui() {
        windowContent = new JPanel();

        GridLayout bl = new GridLayout(10, 5);
        windowContent.setLayout(bl);


        windowContent.add(lblXn);
        windowContent.add(txtXn);
        windowContent.add(lblDx);
        windowContent.add(txtDx);
        windowContent.add(lblXk);
        windowContent.add(txtXk);
        windowContent.add(btnCalc);
        windowContent.add(btnRec);
        windowContent.add(btnDisp);
        windowContent.add(new JLabel());
        windowContent.add(lblResult);

        JScrollPane scrollPane = new JScrollPane(txtResult);
        windowContent.add(scrollPane);

        btnCalc.addActionListener(new CalculateEngine(this));
        btnRec.addActionListener(new CalcRecord(this));
        btnDisp.addActionListener(new CalcDisp(this));

        frame = new JFrame("Calculator");
        frame.setContentPane(windowContent);
        frame.pack();
        frame.setVisible(true);

    }
}
