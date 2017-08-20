package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars);

            if (map.containsKey(sortedStr)) {
                List<String> tempList = map.get(sortedStr);
                tempList.add(str);
                map.put(sortedStr, tempList);
            } else {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(sortedStr, list);
            }

        }

        List<List<String>> output = new ArrayList<>();
        for (String key : map.keySet()) {
            output.add(map.get(key));
        }
        return output;
    }
}
