/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uravnenie.s.ciklom;

/**
 *
 * @author Alexandra
 */
public class UravnenieSCiklom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    double y;
    for (double x=0.2;x<=2.2;x=x+0.4){
    if (Math.abs(x)>=1) {
     y=Math.pow(1.2,x)-Math.pow(x,1.2);
    }
    else {
        y=Math.acos(x);
    }
    System.out.println("x="+x+" y="+y);
}   
}
}
