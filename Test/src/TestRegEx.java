
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class TestRegEx {
    
private static String REGEX= "\\$(\\D{5}),(\\d{6}),(\\D{1}),([0-9]{4}.[0-9]{4}),([NS]{1}),([0-9]{4}.[0-9]{4}),([WE]{1}),([0-9]{1}.[0-9]{1}),([0-9]{3}.[0-9]{1}),([0-9]{6}),(\\D{2}),\\*([0-9]{2})*";
private Pattern myPattern=Pattern.compile(REGEX);
public boolean checkNum(String aNum){

Matcher myMatch = myPattern.matcher(aNum); 
String result="tel. ";
if(myMatch.find()){
for (int i=1;i<=myMatch.groupCount();i++){
System.out.println(myMatch.group(i));
result+=myMatch.group(i);
}
System.out.println(result);


return true;
}else{
return false;
}

}
}
