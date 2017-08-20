package strings;

import java.util.LinkedList;
import java.util.List;

public class LetterCombinationsofaPhoneNumber {
    public static List<String> letterCombinations(String digits) {
        List<String> out = new LinkedList<>();
        if (digits.contains("1") || digits.contains("0") || digits.contains("*") || digits.contains("#")) {
            return out;
        }

        return getCombinations(digits);
    }

    public static List<String> getCombinations(String digits) {
        String[] keyToLetter = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
//        String[] keyToLetter={"","","cba","fed","ihg","lkg","onm","srqp","vut","zyxw"};


        if (digits.length() > 0) {
            List<String> comb = (digits.length() == 1) ? new LinkedList<>() : getCombinations(digits.substring(1));
            List<String> outComb = new LinkedList<>();

            String string = keyToLetter[Character.getNumericValue(digits.charAt(0))];
            for (int i = string.length() - 1; i >= 0; i--) {
                int j = 0;
                boolean isEmpty = comb.isEmpty();
                List<String> newComb = new LinkedList<>(comb);
                do {
                    if (!isEmpty) {
                        newComb.set(j, Character.toString(string.charAt(i)) + newComb.get(j));
                    } else {
                        newComb.add(Character.toString(string.charAt(i)));
                    }
                    j++;
                } while (j < comb.size());
                outComb.addAll(newComb);
            }
            return outComb;
        }

        return null;

    }

    public static void main(String[] args) {
        System.out.println(LetterCombinationsofaPhoneNumber.letterCombinations("23"));
    }
}
