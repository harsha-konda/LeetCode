package solution;

import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElement1 {
    public int[] nextGreaterElement(int[] findNums, int[] nums) {
    	Stack<Integer> stack=new Stack();
    	HashMap<Integer,Integer> hashNums=new HashMap<Integer,Integer>();
    	for(int i=0;i<nums.length;i++){
    		while(!stack.isEmpty() && stack.peek()<nums[i]){
    			hashNums.put(stack.pop(),nums[i]);
    		}
    		stack.push(nums[i]);    		
    	}
    	for(int i=0;i<findNums.length;i++){
    		findNums[i]=hashNums.getOrDefault(findNums[i],-1);
    	}
    	return  findNums;
    }

}
