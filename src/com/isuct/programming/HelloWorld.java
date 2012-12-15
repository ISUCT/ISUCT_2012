package com.isuct.programming; 


public class HelloWorld { 


 public static void main(String[] args) { 

  // создаем классику 

  Tetris tamagoch1 = new Tamagoch(1, 5800, 1); 

                tamagoch1.setIgra(-20); 

  tamagoch1.setBatareya(300); 


  if (tamagoch1.zagruzka()) { 

   System.out.println("tamagoch1 Недостаточно заряда аккумулятора. Поменяйте батарейки." ); 


                } else { 

   System.out.println("tamagoch1 Игра загружается. Ждите."); 



                } 


                Tetris tamagoch2 = new Tamagoch(2, 8999, 4); 

                tamagoch2.setIgra(-20); 

  tamagoch2.setBatareya(54); 


  if (tamagoch2.zagruzka()) { 

   System.out.println("tamagoch2 Недостаточно заряда аккумулятора. Поменяйте батарейки." ); 


                } else { 

   System.out.println("tamagoch2 Игра загружается. Ждите."); 



                } 


                Mobile tamagoch3 = new Tamagoch(2, 15000, 8); 

                tamagoch3.setIgra(-20); 

  tamagoch3.setBatareya(0); 


  if (tamagoch3.zagruzka()) { 

   System.out.println("tamagoch3 Недостаточно заряда аккумулятора. Поменяйте батарейки." ); 


                } else { 

   System.out.println("tamagoch3 Игра загружается. Ждите."); 



                } 

        } 


} 

