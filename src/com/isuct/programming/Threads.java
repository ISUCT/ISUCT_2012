package com.isuct.programming;

/**
 *
 * 
 */
public class Threads implements Runnable {

    public static void main(String[] args) {
        Threads runner = new Threads();
        Thread Alpha = new Thread(runner);
        Thread Beta = new Thread(runner);
        Thread Gamma = new Thread(runner);
        Alpha.setName("Поток А");
        Beta.setName("Поток Б");
        Gamma.setName("Поток С");
        Alpha.start();
        Beta.start();
        Gamma.start();
    }
    public void run(){
        for(int i=0; i<10; i++){
            String thraedName= Thread.currentThread().getName();
            System.out.println("Сейчас работает" + thraedName);
        }
            
    }
}