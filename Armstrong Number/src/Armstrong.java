
public class Armstrong {
	
	boolean isArmstrong(int num){
		
		int dc=countDigit(num);
		int original=num;
		int sum=0;
		
		while(num!=0) {
			int ld=num%10;
			int drp= (int) Math.pow(ld,dc);
			sum= sum+drp;
			num=num/10;	
		  }
		
		if(sum==original)	
		{
			return true;
		}
	        return false;
	        
	    }
	
        int countDigit(int num) {
    	 
    	int count=0;
    	while(num!=0) {
    	num=num/10;
    	count++;
    	
     }
    	return count;
    }
        
  }

