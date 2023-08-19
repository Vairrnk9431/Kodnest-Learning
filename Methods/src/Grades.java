import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scan=new Scanner(System.in);
       System.out.println("Enter Score");
       int marks= scan.nextInt();
       Grade grade=new Grade();
       grade.giveGrade(marks);
       
	}

}
