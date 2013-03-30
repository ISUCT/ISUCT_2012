package com.isuct.programming;

<<<<<<< HEAD
public class Car {
	private int weight;
	private int length;
	private int height;
	private int width;
	private int colour;
	private int numOfWheeis;
	private int numOfSeets;
	private int numOfDors;
	private int fuelLevel;

	public Car(int weight, int lenght, int height, int width) {
		this.weight = weight;
		this.length = lenght;
		this.height = height;
		this.width = width;
		this.numOfWheeis = 4;
		this.numOfDors = 4;
		this.numOfSeets = 5;
	}

	public Car(int weight, int lenght, int height, int width, int nW, int nS,
			int nD) {
		this.weight = weight;
		this.length = lenght;
		this.height = height;
		this.width = width;
		this.numOfWheeis = nW;
		if (nW > 2) {
			this.numOfWheeis = 2;
		}
		if (nW > 3) {
			this.numOfWheeis = nW;
			if (nW % 2 > 0) {
				this.numOfWheeis += 1;
			}
		} else {
			this.numOfWheeis = nW;
		}

		this.numOfDors = nD;
		this.numOfSeets = nS;
	}

	public int getNumOfWeeis() {
		return numOfWheeis;
	}
