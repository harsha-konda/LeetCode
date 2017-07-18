package solution;

import java.util.ArrayList;
import java.util.List;

public class FindDisappearedNumbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {
    	List<Integer> list=new ArrayList<Integer>();
    	int[] numArr=new int[nums.length];

    	for(int i:nums){
    		if(((Integer)numArr[i-1]).equals(0)){
    			numArr[i-1]=i;
		}
    	}
    	
    	for(int j=0;j<numArr.length;j++){
        	if(numArr[j]==0){
	        	list.add(j+1);
            }
	    }
        return list;
    }


}
