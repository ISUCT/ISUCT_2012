package com.isuct.programming;

/**
 * Класс (фабрика, новый тип данных) по производству мобильных телефонов Nokia
 * с закрытыми полями доступа
 * 
 * @author AlyonaShulgina
 *
 */
public class Mobile {
	/**
	 * Закрытые члены класса
	 */
	//Кол-во камер, цена, память телефона
	private int NumOfCamera;
	private int cost;
	private int memory;


	//Параметры длина, толщина, ширина телефона
	private int length;
	private int height;
	private int width;
      
          
	//Параметры счета: пополнение счета и текущий счет
       
	private float popolneniescheta;
        private float money;
   
        
        /**
	 * Конструктор по умолчанию - создает "новую модель nokia"
	 * @param NumOfCamera кол-во камер
	 * @param cost цена
	 * @param memory память
         */
        
       public Mobile(int NumOfCamera, int cost, int memory){
		//Присваиваем переданные нам значения - закрытым членам класса
		//При этом я не проверяю правильность вводе - а надо бы
		this.NumOfCamera = NumOfCamera; 
		this.cost = cost;
		this.memory = memory;
		//И параметры типового телефона
		this.length = 130;
		this.height = 12;
		this.width = 56;
	}
     
	
        
	/**
	 * А вот тут мы можем произвести любой телефон
	 * @param length длина
	 * @param height высота
	 * @param width ширина	
	 * @param memory объем памяти
	 * @param NumOfCamera кол-во камер
         * @param cost стоимость
	 */
	public Mobile(int length, int height, int width, int memory, int NumOfCamera, int cost){
		//Присваиваем переданные нам значения - закрытым членам класса

		this.length = length;
		this.height = height;
		this.width = width;
		this.memory = memory;
		this.NumOfCamera = NumOfCamera;
                this.cost = cost;
	}

	//Методы получения значений закрытых параметров класса

	public int getHeigth(){
		return this.height;
	}

	public int getWidth(){
		return this.width;
	}

	public int getLength(){
		return this.length;
	}

	public int getMemory(){
		return this.memory;
	}
	public int getNumOfCamera(){
		return this.NumOfCamera;
	}

	public int getCost(){
		return this.cost;
	}   
	
	public float getPopolneniescheta(){
		return this.popolneniescheta;
	}               
          
	public float getMoney(){
		return this.money;
	}
        
	//Методы - устанавливающие значения
	
	public void setPopolneniescheta(float popolnenie){
		this.popolneniescheta = popolnenie;
	}
	
        public void setMoney(float money){
            this.money=money;
        }
        
	/**
         * Можем ли мы совершить звонок?
	 * @param balance счет после пополнения
	 * @return истину или ложь - если позвонить не удастся
	 */

	public boolean zvonok(){
             float balance = money + popolneniescheta;
            if (balance<=0){               
                
                return true;
                
            }else{
                return false;
                        }
           
            }
            }