/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import javaapplication1.ClassPhone;

/**
 *
 * @author Maria
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClassPhone CL = new ClassPhone("Motorola","c116","Android","Blue",4,8,14,6,1);
        
        System.out.println(CL.GetBrand() + " " +  CL.GetModel());
        System.out.print(CL.GetLenght()); 
        System.out.print(" ");
        System.out.print(CL.GetWidth());
        System.out.println(); 
        
        CL.SetColor("Red"); //set - задать, установить значение. 
        
         
        
    }
}
