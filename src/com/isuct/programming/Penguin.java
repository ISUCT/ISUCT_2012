/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isuct.programming;

/**
 *
 * @author Stud_6
 */
public class Penguin {
    private int Age;
    private String Colour;
    private int Weight;
    private String Family;
    private String Habitat;
    private int Feet;

    public Penguin(int A, String C, int W, String F, String H,int Fe ) {
        Age = A;
        Colour = C;
        Weight = W;
        Family = F;
        Habitat = H;
        Feet = Fe;
                
        if (Fe < 2) {
            Fe = 2;
        } else {
            if (Fe > 2) {
               Fe =2; 
                    
                }
            }

       

    }

    public int getAge() {
        return this.Age;
    }

    public String getColour() {
        return this.Colour;
    }

    public int getWeight() {
        return this.Weight;
    }

    public String getFamily() {
        return this.Family;
    }
    
  
    public String getHabitat(){
        return this.Habitat;
    }
    
    public int getFeet(){
        return this.Feet;
    }
    
    }
