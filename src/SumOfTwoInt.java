package solution;

public class SumOfTwoInt {
    public int getSum(int a, int b) {
    	int carry=0;
    	int digitA=0;
    	int digitB=0;
    	int bit=0;
    	while(a!=0 || b!=0){
	        digitA=(a>>1) & 1;
	        digitB=(b>>1) & 1;
	        bit<<=1;
	        (bit)^=(digitA^digitB)^carry;
	        carry=digitA&digitB;
	        a=a>>1;
	        b=b>>1;
	       	}
    System.out.println(bit);
    return bit;
    }
}
