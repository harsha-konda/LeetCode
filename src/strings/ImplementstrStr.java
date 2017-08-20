package strings;

public class ImplementstrStr {
    public int strStr(String haystack, String needle) {
        char[] charStack = haystack.toCharArray();
        char[] needleStack = needle.toCharArray();

        for (int i = 0; i < charStack.length; i++) {
            for (int j = 0; ; j++) {
                if (j == needleStack.length) return i;
                if (j == charStack.length) return -1;
                if (charStack[i + j] != needleStack[j]) break;
            }
        }
        return -1;
    }


}
