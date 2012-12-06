package Leon;
public class Leon  {

	private int numOfColors;
	private int age;
	private int weight;
	private int numOfSleep;
	private int numOfWalk;
	private int catchPrey;

	/**
	 * Конструктор для создания Льва	 * 
	 * @param nc
	 *            количество цветов
	 * @param age
	 *            возраст
	 * @param wt
	 *            масса
	 * @param ns
	 *            количество часов сна в сутки
	 * @param nw
	 *            количество часов прогулки в сутки
	 * @param cm
	 *            количество пойманой добычи в сутки
	 */

	public Leon(int nc, int age, int wt, int ns, int nw, int cm) {
		this.numOfColors = Math.abs(nc);
		if (nc > 2) {
			nc = 2;
		}
		numOfColors = nc;
		this.age = Math.abs(age);

		if (age > 15) {
			age = 15;
		}
		this.age = age;
		this.weight = Math.abs(wt);
		if (wt > 180) {
			wt = 180;
		}
		weight = wt;
		this.numOfSleep = Math.abs(ns);
		if (ns > 20) {
			ns =20;
		}
		numOfSleep = ns;
		this.numOfWalk = Math.abs(nw);
		if (nw > 24 - ns) {
			nw = 24 - ns;
		}
		numOfWalk = nw;
		this.catchPrey = Math.abs(cm);

	}

	public int getnumOfColors() {
		return this.numOfColors;
	}

	public int getage() {
		return this.age;
	}

	public int getweight() {
		return this.weight;
	}

	public int getnumOfSleep() {
		return this.numOfSleep;
	}

	public int getnumOfWolk() {
		return this.numOfWalk;
	}

	public int getcatchPrey () {
		return this.catchPrey;
	}

}

