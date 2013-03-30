/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isuct.programming;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
/**
 *
 * @author Stud_6
 */
public class RegSolve {
    private static String REGEX="(^\\$[A-Z]*),(\\d{6}),(\\d{4}.\\d{4}),([A-Z]{1}),(\\d{4}),([A-Z]{1}),(\\d{1}),([0-9.]*),([A-Z]{1}),([0-9.]*),([A-Z]{1}),([0-9.]*),([A-Z]{1}),([0-9.]*),(\\d{4}),(\\*),(\\d{2}*$";
    
    private Pattern myPattern=Pattern.compile(REGEX);
    
    public boolean  checkNum(String aNum){
        
    Matcher myMatch = myPattern.matcher(aNum);    
    String result="tel. ";
    if(myMatch.find()){
        for (int i=1;i<=myMatch.groupCount();i++){
        	//Выводим группы номеров, 0 группа - это вся строка - выводить её не будем
        	//поэтому номер и начинается с 0
            System.out.println(myMatch.group(i));
            //группы объеденим в результтрующйю строку и выведем её 
            //Для примера такое действие сгодиться
            result+=myMatch.group(i);
        }
        System.out.println(result);
        
        
        return true;
    }else{
        return false;
    }
    
    }
}
