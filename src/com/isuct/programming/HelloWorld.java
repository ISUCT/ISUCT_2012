package com.isuct.programming;

public class HelloWorld {

	public static void main(String [] args){

		float x = 1.21f; 
		float a = 1.1f;
		float b = 0.09f;
		
		double chisl = Math.log10((Math.pow(x, 2)-1));
		
		double znamen = Math.log((a*(Math.pow(x,2)-b)))/Math.log(5);
		
		double y = chisl/znamen;
		
		System.out.println("x= "+x+" y= "+y);
		
		
		x=1.76f;
	 chisl = Math.log10((Math.pow(x, 2)-1));
		
		znamen = Math.log((a*(Math.pow(x,2)-b)))/Math.log(5);
	
		y = chisl/znamen;
		System.out.println("X = "+x+" Y = "+y);
		
                x=2.53f
		chisl = Math.log10((Math.pow(x, 2)-1));
		
		 znamen = Math.log((a*(Math.pow(x,2)-b)))/Math.log(5);
		
	 y = chisl/znamen;
		System.out.println("x= "+x+" y= "+y);
                
                x=3.48f;
	 chisl = Math.log10((Math.pow(x, 2)-1));
		
		znamen = Math.log((a*(Math.pow(x,2)-b)))/Math.log(5);
	
		y = chisl/znamen;
		System.out.println("X = "+x+" Y = "+y);
                
                 x=4.52f;
	 chisl = Math.log10((Math.pow(x, 2)-1));
		
		znamen = Math.log((a*(Math.pow(x,2)-b)))/Math.log(5);
	
		y = chisl/znamen;
		System.out.println("X = "+x+" Y = "+y);
	}
}
