package com.isuct.programming;
/**
 * ������� ���������� ����� � ��������� �����
 * @author jskonst
 *     2
 *    x + ���������� ������ �� (x+b)
 * y=-------------------------------
 *    log(a+x)�� ��������� 2
 *    
 * ���� x<5
 * 
 *     3
 *    x + a + b
 * y=-------------------------------
 *         2
 *    sin(x  )
 *    
 *    a=1.1
 *    b=2
 */
public class Calc {
	/**
	 * �������� ���� ������
	 */
	private double xn;
	private double dx;
	private double xk;
	private double a;
	private double b;
	/**
	 * ����������� �� ���������
	 */
	public Calc(){
		
	}
	/**
	 * �����������, � ������� ����� �������� ���������
	 * @param aXn - ��������� �������� X
	 * @param aDx - ������
	 * @param aXk - �������� �������� �
	 */
	public Calc(double aA, double aB,double aXn,double aDx, double aXk){
		//������������� �������� �������� �����
		xn=aXn;
		dx=aDx;
		xk=aXk;
		a=aA;
		b=aB;
	}
	/**
	 * ������� ������ B
	 */
	public void taskB(){
		// ��������� � �������������� ����������
		double chisl = 0;
		double znamen = 0;
		double y = 0;
		double[] Xarray = new double[]{1.21,1.76,2.53,3.48,4.52};
		for (double x : Xarray) {
			if (x < 5) {
				//��������� ��������� Math.pow(�����, �������)
			chisl = Math.log10(Math.pow(x,2)-1);
			//��������� ����������� �������� ����� �� ��������� = (����������� �������� �����)/ (����������� �������� ���������)
			znamen = Math.log(a*Math.pow(x,2)-b)/Math.log(5);
			//��������� y
			y= chisl/znamen;
			} else {
				//��������� ��������� Math.pow(�����, �������)
			chisl = Math.log10(Math.pow(x,2)-1);
			//��������� ����������� �������� ����� �� ��������� = (����������� �������� �����)/ (����������� �������� ���������)
			znamen = Math.log(a*Math.pow(x,2)-b)/Math.log(5);
			//��������� y
			y= chisl/znamen;
			}
			// ������� ���������
			System.out.println("��� ����� = " + x + " ����� ����� = " + y);
		}
	}
	
	/**
	 * ������� ������ �
	 */
	public void taskA(){
		//��������� � �������������� ����������
		double chisl=0;
		double znamen=0;
		double y=0;
		for(double x=xn;x<=xk;x+=dx){
		    if(x<5){
			//��������� ��������� Math.pow(�����, �������)
			chisl = Math.log10(Math.pow(x,2)-1);
			//��������� ����������� �������� ����� �� ��������� = (����������� �������� �����)/ (����������� �������� ���������)
			znamen = Math.log(a*Math.pow(x,2)-b)/Math.log(5);
			//��������� y
			y= chisl/znamen;
		    }else{
			//��������� ��������� Math.pow(�����, �������)
			chisl = Math.log10(Math.pow(x,2)-1);
			//��������� ����������� �������� ����� �� ��������� = (����������� �������� �����)/ (����������� �������� ���������)
			znamen = Math.log(a*Math.pow(x,2)-b)/Math.log(5);
			//��������� y
			y= chisl/znamen;
		    }
		//������� ���������
		System.out.println("��� ����� = "+x+" ����� ����� = "+y);
		}
	}
	/**
	 * ������������� ����� ���������� ������, � ������������
	 * �������� ����������
	 * @param xn
	 * @param dx
	 * @param xk
	 * @param a
	 * @param b
	 */
	public void taskA(double a, double b,double xn,double dx, double xk){
		//��������� � �������������� ����������
		double chisl=0;
		double znamen=0;
		double y=0;
		for(double x=xn;x<=xk;x+=dx){
		    if(x<5){
			//��������� ��������� Math.pow(�����, �������)
			chisl = Math.log10(Math.pow(x,2)-1);
			//��������� ����������� �������� ����� �� ��������� = (����������� �������� �����)/ (����������� �������� ���������)
			znamen = Math.log(a*Math.pow(x,2)-b)/Math.log(5);
			//��������� y
			y= chisl/znamen;
		    }else{
			//��������� ��������� Math.pow(�����, �������)
			chisl = Math.log10(Math.pow(x,2)-1);
			//��������� ����������� �������� ����� �� ��������� = (����������� �������� �����)/ (����������� �������� ���������)
			znamen = Math.log(a*Math.pow(x,2)-b)/Math.log(5);
			//��������� y
			y= chisl/znamen;
		    }
		//������� ���������
		System.out.println("��� ����� = "+x+" ����� ����� = "+y);
		}
	}
	
}