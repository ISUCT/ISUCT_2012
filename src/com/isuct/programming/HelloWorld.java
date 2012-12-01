package com.isuct.programming;


public class HelloWorld {


/**
 * Класс по проиводству кроликов - домашних на ферме Тихомировых
 * 
 * @author Тимоша
 * 
 */
public class rabbit {

	/**
	 * Закрытые члены класса
	 */
	// Ширина, длина, высота, вес кролика
	public int length;
	public int height;
	public int width;
	public int weight;

	// Параметры: количество ног, длина ушей, цвет, возраст
	private int numOfLegs;
	private int lenOfNeck;
	private int colour;
	private int age;

	// Параметры расхода (для передвижения кролика :)
	private float foodLevel;
	private float rashod;

	//Координаты кролика
		private int x; //X
		private int y; //Y

	/**
	 * Конструктор для создания кролика
	 * 
	 * @param length
	 *            длина 
	 * @param wh
	 *            ширина 
	 * @param ht
	 *            высота 
	 * @param wt
	 *            масса 
	 * @param nL
	 *            число ног
	 * @param lN
	 *            длина ушей 
	 * @param age
	 *            возраст
	 * @param foodLevel
	 *            уровень еды
	 * @param rashod
	 *            расход еды
	 */
	public rabbit(final int length, final int wh, final int ht, final int wt,
			int nL, final int lN, final int age) {
		// Присваиваем переданные нам значения - закрытым членам класса

		this.length = Math.abs(length);
		this.height = Math.abs(ht);
		this.width = Math.abs(wh);
		this.weight = Math.abs(wt);

		if (nL < 2) {
			nL = 2;
		} else {
			if (nL > 2) {
				nL = 2;
			}
		}

		this.numOfLegs = nL;
		this.lenOfNeck = lN;
	}

	// Методы получения значений закрытых параметров класса

	public int getLength() {
		return this.length;
	}

	public int getHeight() {
		return this.height;
	}

	public int getWidth() {
		return this.width;
	}

	public int getnumOfLegs() {
		return this.numOfLegs;
	}

	public int getlenOfNeck() {
		return this.lenOfNeck;
	}

	public int getAge() {
		return this.age;
	}

	public int getColor() {
		return this.colour;
	}

	public int[] getCoords() {
		return new int[] { x, y };
	}

	public float getfoodLevel() {
		return this.foodLevel;
	}

	public float getRashod() {
		return this.rashod;
	}

	// Методы - устанавливающие значения
	public void setRashod(float rashod) {
		this.rashod = rashod;
	}

	public void setfoodLevel(float food) {
		this.foodLevel = food;
	}

	public void setPosition(int x, int y) {
		this.x = x;
		this.y = y;
	}


	 * Перемещаем кролика
	 * 
	 * @param axis
	 *            ось x или y
	 * @param distance
	

	public boolean move(String axis, int distance) {
		// Посчитаем сколько еды надо для передвижения
		float needFood = distance * rashod / 100;
		if ((foodLevel - needFood) < 0) {
			return false;
		} else {
			if (axis.equals("x")) {
				x += distance;
			} else if (axis.equals("y")) {
				y += distance;
			} else {
				return false;
			}
			foodLevel -= needFood;
			return true;
		}

	}
