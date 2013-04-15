package graphicinterface;

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
        double xn = Double.parseDouble(parent.txtXn.getText());
        double dx = Double.parseDouble(parent.txtDx.getText());
        double xk = Double.parseDouble(parent.txtXk.getText());
        double taskA[][] = defaultConstr.taskA(xn, dx, xk);

        String textResult = "";

        for (int i = 0; i < taskA[0].length; i++) {
            textResult += "X = " + taskA[0][i] + " Y= " + taskA[1][i] + "\r\n";
        }

        parent.txtResult.setText(textResult);
    }
}
