/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isuct.programming;

/**
 *
 * @author User
 */
public class HelloWorld{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("hello");



        /*У меня уравнение под номером 5.
          
     
        
         * Данные вычисления для первого уравнения в системе.
         Сначала выщитывала для  х3=5.21 */

        double a = -2.5;
        double rezult3 = Math.pow(a, 2);
        double x3 = 5.21;
        double Summa3 = (rezult3 + x3);
        double rezalt3 = Math.log10(x3);
        double rezult2 = Math.pow(rezalt3, 2);
        double ChisliteL3 = (rezult3 * Summa3);
        double Summ3 = a + x3;
        double ZnamenateL3 = Math.pow(a + x3, 2);
        double y3 = ChisliteL3 / ZnamenateL3;
        System.out.println("y3=" + y3);

        /*Вычисления для для первого уравнения при х4=6.28*/
        double x4 = 6.28;

        double rezult4 = Math.pow(a, 2);
        double Summa4 = (rezult4 + x4);
        double rezult5 = Math.log10(x4);
        double rezult6 = Math.pow(rezult5, 2);
        double ChisliteL4 = (rezult6 * Summa4);
        double Sum4 = a + x4;
        double Znamenatel4 = Math.pow(a + x4, 2);
        double y4 = ChisliteL4 / Znamenatel4;
        System.out.println("y4=" + y4);


        /*Для второго уравнения системы при х1=2.89*/
        double x1 = 2.89;
        double b = 3.4;
        double Proizv1 = b * x1;
        double Summ1 = a + Proizv1;
        double Chisl = Math.pow(Summ1, 2.5);
        double Proizved = a * x1;
        double rezlt1 = Math.cos(Proizved);
        double rez5 = Math.pow(rezlt1, 3);
        double Znamentl = 1.8 + rez5;
        double y1 = Chisl / Znamentl;
        System.out.println("y1=" + y1);


        /*Для второго уравнения системы при х2=3.54*/
        double x2 = 3.54;
        double Proiz2 = b * x2;
        double Summ2 = a + Proiz2;
        double Chislit2 = Math.pow(a + Proiz2, 2.5);
        double Proizvd2 = a * x2;
        double rezalt2 = Math.cos(Proizvd2);
        double rezultat2 = Math.pow(rezalt2, 3);
        double Znamenat2 = 1.8 + rez5;
        double y2 = Chislit2 / Znamenat2;
        System.out.println("y2=" + y2);


        /*Для второго уравнения системы при х5=3.48*/
        double x5 = 3.48;
        double Proiz5 = b * x5;
        double Sum5 = a + Proiz5;
        double Chislit5 = Math.pow(a + Proiz5, 2.5);
        double Proizvd5 = a * x2;
        double rezalt5 = Math.cos(Proizvd5);
        double rezultat5 = Math.pow(rezalt5, 3);
        double Znamenat5 = 1.8 + rez5;
        double y5 = Chislit5 / Znamenat5;
        System.out.println("y5=" + y5);


    }
}
