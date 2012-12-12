/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isuct.programming;
import com.isuct.programming.Penguin;
/**
 *
 * @author Stud_17
 */
public class NewPenguin {
    public static void main (String[] args){
    Penguin P= new Penguin("Crendel'",2, "black-white", 2, "Simple", "Antirctida", 2);
    System.out.println(P.getName() +" "+ P.getFamily()+" "+ P.getHabitat());
}
}