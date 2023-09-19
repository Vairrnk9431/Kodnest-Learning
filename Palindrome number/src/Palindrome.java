
public class Palindrome {
    void isPalindrome(int n) {
    	
    	int original=n;
    	int rev=0;
    	while(n>0) {
    		
    		int ld=n%10;
    		rev=rev*10+ld;
    		n=n/10;		
    	}
    	if(original==rev) {
    		System.out.println("Entered number is Palindrome");
    	}
    	else
    	{
    		System.out.println("Entered number is not Palindrome");
    	}
    	
    			
    }
	
	
}
