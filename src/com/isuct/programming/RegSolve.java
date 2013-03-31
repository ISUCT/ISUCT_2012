package Regex;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegSolve {

    private static String REGEX = "([0-9_A-F]{4})[,]([0-9_A-F]{2})[,](.*)(\\*[0-9_A-F]{2})";
    private Pattern myPattern = Pattern.compile(REGEX);

    public boolean checkNum(String aNum) {

        Matcher myMatch = myPattern.matcher(aNum);
        String result = "!ID, MSG_CMD, F0…Fx, * MSG_CRC";
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
}