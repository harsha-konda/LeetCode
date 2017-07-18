package solution;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DetectCapital {
    public boolean detectCapitalUse(String word) {

	Pattern p=Pattern.compile("([A-Z]*)|([A-Z][a-z]*)|([a-z]*)");
	Matcher m=p.matcher(word);
	return m.matches();
    }
}
