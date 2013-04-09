/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class JavaApplication5 {
  private static String REGEX = "\\#D\\#(\\d{6});(\\d{6});(\\d{4}\\.{1}\\d{4});(\\D{1});(\\d{5}\\.{1}\\d{4});(\\D{1});(\\d{1});(\\d{1});(\\d{3});(\\d{2});(\\d{1}\\.{1}\\d{1});(\\d{3});(\\d{2});(\\d{1}\\.{1}\\d{2}\\,{1}\\d{1}\\.{1}\\d{2});(\\D{2});(\\D{3}\\:{1}\\d{1}\\:{1}\\d{2}\\,{1}\\D{3}\\:{1}\\d{1}\\:{1}\\d{2})$";
    private Pattern myPattern = Pattern.compile(REGEX);

    public boolean checkNum(String aNum) {

        Matcher myMatch = myPattern.matcher(aNum);
        String result = "";
        if (myMatch.find()) {
            for (int i = 1; i <= myMatch.groupCount(); i++) {
                System.out.println(myMatch.group(i));
                result += myMatch.group(i);
            }
            System.out.println(result);
            return true;
        } else {
            return false;
        }

    }

public static void main(String[] args){
  //  RegSolve2 instance=new RegSolve2();
//instance.checkNum("#D#141212;053535;5700.0417;N;04059.6516;E;0;0;159;22;6.2;000;00;3.00,3.00;NA;GNS:1:10,GPS:1:12");

Test test=new Test();
test.testCheckNum1();
}
}