import java.util.HashMap;
import java.util.Map;


public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        char[] Str=s.toCharArray();
        int maxLength=0;

         Map <Character,Integer> substr=new HashMap<>();
         int i=0;
         for(int j=0;j<Str.length;j++){
             if(substr.containsKey(Str[j])){
                 i=Math.max(i,substr.get(Str[j]));   
             }
             maxLength=Math.max(maxLength,j-i+1);
             substr.put(Str[j],j+1);
         }
         
         return maxLength;

    }
    public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("tmmzuxt"));
		System.out.println(lengthOfLongestSubstring("abcabcbb"));

	}
}
