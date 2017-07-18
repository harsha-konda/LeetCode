import java.util.HashMap;

public class LongestPalindromicSubstring {
	
    public String longestPalindrome(String s) {
    	char[] S=s.toCharArray();
    	HashMap<String,Integer> map=new HashMap<>();

    	int start=0;
    	int end=0;
    	int len=0;
    	for(int j=0;j<S.length;j++){
    		len=Math.max(len,Math.max(countPalindrome(j,j,S),countPalindrome(j,j+1,S)));
    		System.out.println(len);
    		if(len>(start-end)){
    			start=j-(len-1)/2;
    			end=j+len/2; 
    		}
    	}
    	return s.substring(start,end);
    }
    
    public static int countPalindrome(int left,int right,char[] S){
    	while(left>=0 && right<S.length && S[left]==S[right]){
    		left--;
    		right++;
    	}
    	return right-left-1;
    	
    }
}

