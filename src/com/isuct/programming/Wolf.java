package com.isuct.programming;

/* 
 * To change this template, choose Tools | Templates 
 * and open the template in the editor.
 */
/**
 * 
 * @author Admin 
 */
        public class Wolf {
     private float sleepLevel;
        private float rashod;
        private int food;
        private int dlina;
        private int chislOnog;	
        private int ves;	
        private int colour;	
        private int age;	
        private int x;	
        private int y;
        /**	 
         * А вот тут мы можем произвести любого волка	
         *	 
         * @param ves	 
         *            вес
         * @param chislOnog	
         *            Число ног	 
         * @param colour	
         *            цвет	
         * @param age	 
         *            возраст
         * @param sleepLevel	
         *            уровень сна         
         * @param rashod         
         *            расход сна         
         * @param dlina	
         *            длина
         * @param food
         *            потребление пищи
         */
public Wolf(int dlina,int ves,int chislOnog, int colour, int age, int food) {
this.food = food;
this.dlina = dlina;
this.ves = ves;		
this.chislOnog = chislOnog;		
this.colour = colour;		
this.age = age;
 }
        public int getDlina(){		
        return this.dlina;
        }
        public int getfood (){
            return this.food;
        }
	public int getVes(){		
            return this.ves;
        }	
        public int getColour(){		
            return this.colour;
        }	
       public int getAge(){		
           return this.age;
       }	
       public int getChislOnog(){		
           return this.chislOnog;
       }	
       public int[] getCoords() {		
           return new int[] { x, y };
       }	
       public float getFuelLevel() {		
           return this.sleepLevel;
       }	
       public float getRashod() {		
           return this.rashod;
       }	
       public void setRashod(float rashod) {		
           this.rashod = rashod;
       }	
       public void setSleepLevel(float fuel) {		
           this.sleepLevel = fuel;
       }	
       public void setPosition(int x, int y) {		
           this.x = x;
            this.y = y;
       }
       public boolean move(String axis, int distance) {
           float needFuel = distance * rashod / 100;		
           if ((sleepLevel - needFuel) < 0) {
               return false;		
           } else {
               switch (axis) {
                   case "x":
                       x += distance;
                       break;
                   case "y":
                       y += distance;
                       break;			
                   default:
                       return false;
               }
               sleepLevel -= needFuel;		
               return true;		
           }	
       }
} 