import java.util.Scanner;

public class Main{

public static void categorizeAge(int age){

// your code here
	if(age>=0 &&age<=12) {
		System.out.println("child");
	}
	else if(age>=13 &&age<=19) {
		System.out.println("Teen");
	}
	else {
		System.out.println("Adult");
	}
	

}

public static void main(String[] args){

	Scanner scan=new Scanner(System.in);
	int age=scan.nextInt();
	categorizeAge(age);
	
	
}

}