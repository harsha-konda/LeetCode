package solution;

import java.util.HashMap;

public class FindTheDifference {
    public char findTheDifference(String s, String t) {
     char[] sc=s.toCharArray();
     char[] tc=t.toCharArray();
     HashMap<Character,Integer> map=new HashMap<Character,Integer>();
     for(char i:sc){
    	 if(map.containsKey((Character)i)){
    		 map.put(i, map.get(i)+1);  		 
    	 }else{
    		 map.put(i,1);
    	 }   	 
     }
     
     for(char i:tc){
    	 if(map.containsKey((Character) i) ){
    		 if(map.get((Character)i)>1){
    			 map.put((Character)i,map.get(i)-1);   			 
    		 }
    		 if(map.get((Character) i)==1){
    			 map.remove(i);
    		 }
    	 }
    	 
     }
     return (char) map.keySet().toArray()[0];
    }
}
