package com.isuct.programming;

public class HelloWorld {


	public static void main(String [] args){
		//����� ������ � � ������ B � �������������� �������� ������ Calc
		//������ ���������� ����������� �� ���������
		Calc defaultConstr = new Calc();
		System.out.println("------------������ ������ �------------");
		defaultConstr.taskB();
		System.out.println("------------������ ������ A ------------");
		defaultConstr.taskA(1.1,0.09,1.2,0.2,2.2);
		//����� ������ � - � �������������� �������������� ������������
		System.out.println("------------������ ������ A � ������������� �������������------------");
		Calc nDefConstr = new Calc(1.1,0.09,1.2,0.2,2.2);
		//����� �� ����� ������� ����� ��� �������� �������������� ����������
		nDefConstr.taskA();
		}
}