/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isuct.programming;

/**
 *
 * @author Stud_6
 */
public class Deer {
   private String Type;
   private String Colour;
   private int Height;
   private int Length;
   private int Age;   
   private int Weight;    
   private int Feet;
    
   public Deer(String T, String C, int L, int H, int A, int W, int F) {
         Type = T;
         Colour = C;
         Length = L;
         Height = H;
         Age = A;
         Weight = W;
         Feet = F;
         
        if (F < 4) {
           F = 4;
        } else {
            if (F > 4) {
                 F = 4;
                }
            }

        }
     public String GetType(){
         return Type;
         
     }
     public String GetColour(){
         return Colour;
     }
     public int GetHeight(){
         return Height;
     }
     public int GetLength(){
         return Length;
     }
     public int GetAge(){
         return Age;
     }
     public int GetWeight(){
         return Weight;
     }
     public int GetFeet(){
         return Feet;
         
         
         
         
         
     }  
   
   
   
   
   
   
}
   