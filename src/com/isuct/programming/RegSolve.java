/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isuct.programming;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
/**
 *
<<<<<<< HEAD
 * @author Stud_6
 */
public class RegSolve {
<<<<<<< HEAD
    private static String REGEX="(\\d{3})\\D*(\\d{3})\\D*(\\d{4})\\D*(\\d*)$";
=======
 * @author Max
 */
public class RegSolve {
    private static String REGEX="(([0])([1-9])|([1-2])([0-9])|([3])([0-1]))(([0])([1-9])|([1])([0-2]))(([0-9])([0-9])),(\\w),(\\d*).(\\d*),([N]|[S]),(\\d*).(\\d*),([E]|[W]),(\\d).(\\d),(\\d*).(\\d),(([0])([1-9])|([1-2])([0-9])|([3])([0-1]))(([0])([1-9])|([1])([0-2]))(([0-9])([0-9])),,([*])(\\d*)$";
>>>>>>> remotes/origin/Chernenkov_Maxim
=======
    private static String REGEX="([!](\\d*)),([0][2]),(\\d\\w\\d\\w\\d{2}\\w{2}),(\\d*),(([0][0])|([0][1]))([*])(\\w*)";
>>>>>>> 7ced590e159e3dc7393259112173ca213f0d0942
    
    private Pattern myPattern=Pattern.compile(REGEX);
    
    public boolean  checkNum(String aNum){
        
    Matcher myMatch = myPattern.matcher(aNum);    
<<<<<<< HEAD
    String result="tel. ";
    if(myMatch.find()){
        for (int i=1;i<=myMatch.groupCount();i++){
        	//Выводим группы номеров, 0 группа - это вся строка - выводить её не будем
        	//поэтому номер и начинается с 0
            System.out.println(myMatch.group(i));
            //группы объеденим в результтрующйю строку и выведем её 
            //Для примера такое действие сгодиться
=======
    String result="Protocol ";
    if(myMatch.find()){
        for (int i=1;i<=myMatch.groupCount();i++){
        
            System.out.println(myMatch.group(i));
            
>>>>>>> remotes/origin/Chernenkov_Maxim
            result+=myMatch.group(i);
        }
        System.out.println(result);
        
        
        return true;
    }else{
        return false;
    }
    
    }
}
