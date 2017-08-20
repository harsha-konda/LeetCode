package strings;

import java.util.LinkedList;
import java.util.List;

public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> list = new LinkedList<>();
        generateList(list, "", 0, 0, n);
        return list;
    }

    public void generateList(List<String> list, String str, int open, int close, int max) {

        if (str.length() == 2 * max) {
            list.add(str);
            return;
        }

        if (open < max)
            generateList(list, str + "(", open + 1, close, max);

        if (close < open)
            generateList(list, str + ")", open, close + 1, max);
    }


}
