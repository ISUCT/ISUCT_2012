/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorka2;

/**
 *
 * @author SAMSUNG
 */
public class Laboratorka2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    

                float a = 1.1f;
                float b = 0.09f;
                float x = 1.2f;
                    for (double x = 1.2; x<=2.2; x=(x+2)){
                    double chisl = Math.log(Math.pow(x, 2)-1);
                    double znam = Math.log(a*Math.pow(x, 2)-b)/Math.log(5);
                    double y = chisl/znam;
    System.out.println("X="+x+" Y="+y);
    }}}
                    