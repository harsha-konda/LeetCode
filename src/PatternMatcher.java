package solution;

import java.awt.List;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {
    public static String[] findWords(String[] words) {
        String regex="([asdfghjkl]*)|([qwertyuiop]*)|([zxcvbnm]*)";
        Pattern p=Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
        ArrayList<String> finalWords=new ArrayList<String>();
        for(String i:words){
        Matcher m=(p.matcher(i));
        	if(m.matches()){
        		finalWords.add(i);
        	}
    	}
        return  finalWords.toArray(new String[finalWords.size()]);
    }
    public static void main(String[] args) {
    	String[] inp={"Hello", "Alaska", "Dad", "Peace"};
		System.out.println(findWords(inp));
	}
}