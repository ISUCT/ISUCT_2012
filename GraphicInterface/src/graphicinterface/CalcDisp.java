package graphicinterface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import static org.junit.Assert.*;

public class CalcDisp implements ActionListener{
MainGui parent;

    public CalcDisp(MainGui gui) {
        parent = gui;
    }
 String FileName = "file.txt";

  @Override
  public void actionPerformed(ActionEvent e) {

    System.out.println("Чтение файла");

    File file = new File(FileName);
    try {
                try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                    String s;
                    while ((s = br.readLine()) != null) {
                            System.out.print(s);
                    }
                }
      assertTrue(true);
    } catch (IOException fnfEx) {
      fail("Something bad");
    }
  }

}

