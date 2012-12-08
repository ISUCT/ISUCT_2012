package com.isuct.programming;

/**
 * Класс (фабрика, новый тип данных) по производству Tamagoch
 * с закрытыми полями доступа
 * 
 * @author DurdinArtem
 *
 */
public class Tamagoch {
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
      
          
	//Параметры счета: затраты на игру и текущий заряд аккумулятора 
       
	private float igra;
        private float batareya;
   
        
        /**
	 * Конструктор по умолчанию - создает "новую модель tamagoch"
	 * @param NumOfCamera кол-во камер
	 * @param cost цена
	 * @param memory память
         */
        
       public Tamagoch(int NumOfCamera, int cost, int memory){
		//Присваиваем переданные нам значения - закрытым членам класса
		
		this.NumOfCamera = NumOfCamera; 
		this.cost = cost;
		this.memory = memory;
		//И параметры типового тамагочи
		this.length = 130;
		this.height = 12;
		this.width = 56;
	}
     

        
	/**
	 * А вот тут мы можем произвести любой тамагочи
	 * @param length длина
	 * @param height высота
	 * @param width ширина	
	 * @param memory объем памяти
	 * @param NumOfCamera кол-во камер
         * @param cost стоимость
	 */
	public Tamagoch(int length, int height, int width, int memory, int NumOfCamera, int cost){
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

	public float getbatareya(){
		return this.batareya;
	}               
          
	public float getigra(){
		return this.igra;
	}
        
	//Методы - устанавливающие значения

	public void setIgra(float igra){
		this.igra=igra;
	}

        public void setBatareya (float batareya){
            this.batareya=batareya;
        }
        
	/**
         * Можем ли мы начать игру?
	 * @param zagruzka
	 * @return истину или ложь - если загрузить не удастся
	 */

	public boolean zagruzka(){
             float zagruzka= batareya + igra;
            if (zagruzka<=0){               
                
                return true;
                
            }else{
                return false;
                        }
           
            }
            }

