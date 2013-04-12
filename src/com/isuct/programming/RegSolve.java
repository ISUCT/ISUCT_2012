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
    private static String REGEX="([/#][D][/#])(([0-2])([0-9])|([3])([0-1]))(([0])([0-9])|([1])([0-2]))(([0-9])([0-9])),(([0-1])([0-9])|([2])([0-3]))(([0-5])([0-9]))(([0-5])([0-9])),(\\d*).(\\d*);(\\w),(\\d*).(\\d*);(\\w),(\\d*|[N][A]),(\\d*|[N][A]),(\\d*|[N][A]),(\\d*|[N][A]),(\\d*.[0-9]*|[N][A]),(\\d*|[N][A]),(\\d*|[N][A]),(\\d*.\\d*),(\\d*.\\d*),(\\d*|[N][A]),(\\w{3}):([1-3]*):(\\d*),(\\w{3}):([1-3])*:(\\d)*$";
    
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