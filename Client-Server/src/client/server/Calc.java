

/**
 *
 * @author Юлия
 */
public class Calc {
	
	private double xn;
	private double dx;
	private double xk;
	private double a;
	private double b;


	public Calc() {

	}


	public Calc(double aA, double aB, double aXn, double aDx, double aXk) {
		// Устанавливаем значения закрытых полей
		xn = aXn;
		dx = aDx;
		xk = aXk;
		a = aA;
		b = aB;
	}


	public double[][] taskB(double[] arrayX) {
	
	double chisl = 0;
	double znamen = 0;
	double y = 0;
	// Создаем 2мерный массив для хранения результатов
	double[][] result = new double[2][arrayX.length];
	int i = 0;
	for (double x : arrayX) {
	chisl =(Math.log(Math.abs(Math.pow(b,2)-Math.pow(x, 2))) / Math.log(a))*Math.abs(Math.pow(b, 2)-Math.pow(x, 2));
	znamen = Math.pow((Math.abs(Math.pow(x,2)-Math.pow(a,2))), 1 / 5f);
	y = chisl / znamen;
	result[0][i] = x;
	result[1][i] = y;
	i++;
	//Сохраняем результат
	}
	return result;
	}
	/**
	* Решение задачи А
	*/
	public double[][] taskA() {
	// Объявляем и инициализируем переменные
	double chisl = 0;
	double znamen = 0;
	double y = 0;
	//при создании вычисляем сколько будет элементов
	int nElem = (int) Math.floor(((xk-xn)/dx));
	double[][] result = new double[2][nElem+1];
	int i=0;
	for (double x = xn; x <= xk; x += dx) {
	chisl =(Math.log(Math.abs(Math.pow(b,2)-Math.pow(x, 2))) / Math.log(a))*Math.abs(Math.pow(b, 2)-Math.pow(x, 2));
	znamen = Math.pow((Math.abs(Math.pow(x,2)-Math.pow(a,2))), 1 / 5f);
	y = chisl / znamen;
	// Выводим результат
	result[0][i]=x;
	result[1][i]=y;
	i++;
	}
	return result;
	}
	/**
	 * Перегруженный метод вычисления задачи,с возможностью
	 * передачи параметров
	 * @param xn
	 * @param dx
	 * @param xk
	 * @param a
	 * @param b
	 */
	public double [][] taskA(double a,double b, double xn, double dx, double xk){
	    //Объявляем и инициализируем переменные
	    double chisl=0;
	    double znamen=0;
	    double y=0;
	    // при создании вычисляем сколько будет элементов
	    int nElem=(int) Math.floor(((xk-xn)/dx));
	    double [][] result = new double[2][nElem+1];
	    int i=0;
	    for (double x = xn; x <= xk; x += dx) {
	chisl =(Math.log(Math.abs(Math.pow(b,2)-Math.pow(x, 2))) / Math.log(a))*Math.abs(Math.pow(b, 2)-Math.pow(x, 2));
	znamen = Math.pow((Math.abs(Math.pow(x,2)-Math.pow(a,2))), 1 / 5f);
	y = chisl / znamen;
	// Выводим результат
	result[0][i]=x;
	result[1][i]=y;
	i++;
	}
	return result;
	}
	}