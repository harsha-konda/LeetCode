import java.util.Arrays;

public class ZigZagConversion {
    public String convert(String s, int numRows) {
    	StringBuilder[] output=new StringBuilder[numRows];
    	Arrays.fill(output,new StringBuilder());
    	
    	int b=0;
    	int n=(numRows<2)?0:numRows-2;
    	int index;
    	for(int i=0,j=0;j<s.length();j++){
    		if(j%(numRows+n)==0){b+=1;}
    		
    		if(j%(numRows+n)<numRows){
    			 index=(j)%(numRows+n);

    		}else{
    			 index=numRows-((j)%(numRows+n))%numRows-2;	
    		}
			 output[index]=output[index].append(Character.toString(s.charAt(j)));    			


    	}
    	
    	StringBuilder Output=new StringBuilder();
    	for(StringBuilder out: output){
    		Output.append(out.toString());
    	}
    	return Output.toString();
    }
    
    public static void main(String[] args) {
		ZigZagConversion zagConversion=new ZigZagConversion();
		System.out.println(zagConversion.convert("PAYPALISHIRING", 3));
	}
}
