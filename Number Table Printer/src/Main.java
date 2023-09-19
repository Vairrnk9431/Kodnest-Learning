import java.util.Scanner;

public class Main{

public static void printTable(int num){

// your code here
	for(int i=1;i<=10;i++) {
	System.out.println(num+" x "+i+" = "+(num*i));
	}

}

public static void main(String[] args){

//code here
	Scanner scan=new Scanner(System.in);
	int num=scan.nextInt();
     printTable(num);
}

}