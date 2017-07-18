package solution;

import java.util.List;
import java.util.ArrayList;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> list=new ArrayList<String>();
        for(int i=1;i<=n;i++){
        	String entry=Integer.toString(i);
        	if(i%3==0 && i%5==0){
        	    entry="FizzBuzz";
        	}else if(i%3==0){
        		entry="Fizz";
        	}else if(i%5==0){
        		entry="Buzz";
        	}
        	list.add(entry);
        }
        return list;
    }


}
