import java.util.Scanner;

public class Main{
	
	
public static void main(String[] args){
	 Scanner scanner = new Scanner(System.in);

     System.out.print("Enter the first number: ");
     int num1 = scanner.nextInt();

     System.out.print("Enter the second number: ");
     int num2 = scanner.nextInt();

      findGCD(num1, num2); 
   }
       public static void findGCD(int a,int b){
    	   
	     while (b!=0) {
         int rem=b;
         b=a%b;
         a=rem;
       }
        System.out.println("GCD : "+ a);
 
   }

}