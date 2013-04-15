package graphicinterface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import static org.junit.Assert.*;

public class CalcRecord implements ActionListener{
MainGui parent;
RandomAccessFile file;

    public CalcRecord(MainGui gui) {
        parent = gui;
    }
    String FileName = "file.txt";

    
  @Override
  public void actionPerformed(ActionEvent e) {
    System.out.println("Запись файла");

    String textResult = parent.txtResult.getText();
    File file1 = new File(FileName);
    try {
      PrintWriter out = new PrintWriter(file1);
      out.println(textResult);
      out.close();
      assertTrue(true);
    } catch (FileNotFoundException fnfEx) {
      fail("Something bad");
    }

  }

}
    
/*void save(double xn,double dx,double xk){
    Calc constr = new Calc();
    double taskA[][] = constr.taskA(xn, dx, xk);
			file = new RandomAccessFile(filename, "rw");
                        for(int j=0;j<2;j++){
			for(int i = 0; i < taskA[0].length; i++){
			file.writeUTF(new String(taskA[j][i].getBytes("UTF-8"), "UTF-8"));
			file.close();
                        }
		}
}*/

   