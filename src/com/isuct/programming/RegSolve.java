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
    private static String REGEX="(([0])([1-9])|([1-2])([0-9])|([3])([0-1]))(([0])([1-9])|([1])([0-2]))(([0-9])([0-9])),(\\w),(\\d*).(\\d*),([N]|[S]),(\\d*).(\\d*),([E]|[W]),(\\d).(\\d),(\\d*).(\\d),(([0])([1-9])|([1-2])([0-9])|([3])([0-1]))(([0])([1-9])|([1])([0-2]))(([0-9])([0-9])),,([*])(\\d*)$";
    
    private Pattern myPattern=Pattern.compile(REGEX);
    
    public boolean  checkNum(String aNum){
        
    Matcher myMatch = myPattern.matcher(aNum);    
    String result="Protocol ";
    if(myMatch.find()){
        for (int i=1;i<=myMatch.groupCount();i++){
        	//�� ������ �������, 0 ������ - ��� ��� ������ - �������� �� �� �����
        	//������� ����� � ���������� � 0
            System.out.println(myMatch.group(i));
            //������ ��������� � �������������� ������ � ������� �� 
            //��� ������� ����� �������� ���������
            result+=myMatch.group(i);
        }
        System.out.println(result);
        
        
        return true;
    }else{
        return false;
    }
    
    }
}
