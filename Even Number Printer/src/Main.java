import java.util.Scanner;

public class Main{

public static void printEvenNumbers(int n){

// your code here
	for(int i = 2;i<=n;i+=2) {
		System.out.println(i );
	}
}

public static void main(String[] args){
	
	Scanner scan=new Scanner(System.in);
	int n =scan.nextInt();
	printEvenNumbers(n);

}

}