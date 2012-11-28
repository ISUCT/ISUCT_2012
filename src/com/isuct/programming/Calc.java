

public class Calc {
	/**
	 * Закрытые поля класса
	 */
	private double xn;
	private double dx;
	private double xk;
	private double a;
	private double b;
	/**
	 * Конструктор по умолчанию
	 */
	public Calc(){
		
	}
	/**
	 * Конструктор, в котором можно передать параметры
	 * @param aXn - начальное значение X
	 * @param aDx - дельта
	 * @param aXk - конечное значение Х
	 */
	public Calc(double aA, double aB,double aXn,double aDx, double aXk){
		//Устанавливаем значения закрытых полей
		xn=0.11;
		dx=0.05;
		xk=0.36;
                a=2.0;
		b=3.0;
               
	}
	/**
	 * Решение задачи B
	 */
	public void taskB(){
		// Объявляем и инициализируем переменные
		double y ;
		double[] Xarray = new double[]{0.08,0.26,0.35,0.41,0.53};
		for (double x : Xarray) {
			if (x < 5) {
				// вычисляем y
				y = Math.asin(Math.pow(xn,a))+Math.acos(Math.pow(xn,b));
			} else {
				// вычисляем y
				y = Math.asin(Math.pow(xn,a))+Math.acos(Math.pow(xn,b));
			}
			// Выводим результат
			System.out.println("Икс равен = " + x + " Игрек равен = " + y);
		}
	}
	
	/**
	 * Решение задачи А
	 */
	public void taskA(){
		//Объявляем и инициализируем переменные
		double y;
		for(double x=xn;x<=xk;x+=dx){
		    if(x<5){
			//вычисляем y
			y = Math.asin(Math.pow(xn,a))+Math.acos(Math.pow(xn,b));
		    }else{
			//вычисляем y
			y = Math.asin(Math.pow(xn,a))+Math.acos(Math.pow(xn,b));
		    }
		//Выводим результат
		System.out.println("Икс равен = "+x+" Игрек равен = "+y);
		}
	}
	/**
	 * Перегруженный метод вычисления задачи, с возможностью
	 * передачи параметров
	 * @param xn
	 * @param dx
	 * @param xk
	 * @param a
	 * @param b
	 */
	public void taskA(double a, double b,double xn,double dx, double xk){
		//Объявляем и инициализируем переменные
		double y;
		for(double x=xn;x<=xk;x+=dx){
		    if(x<5){
			//вычисляем y
			y = Math.asin(Math.pow(xn,a))+Math.acos(Math.pow(xn,b));
		    }else{
			//вычисляем y
			y = Math.asin(Math.pow(xn,a))+Math.acos(Math.pow(xn,b));
		    }
		//Выводим результат
		System.out.println("Икс равен = "+x+" Игрек равен = "+y);
                }
	
        }
}