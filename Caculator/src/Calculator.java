
public class Calculator {
	public static void arthematicOperation(double num1, double num2, char operator) {
		double result =0.0;
		
		switch(operator) {
		
		case '+':
			result = num1+num2;
			System.out.println("Addition result is: "+ result);
			break;
			
		case '-':
			result = num1-num2;
			System.out.println("Substraction result is: "+ result);
			break;
			
		case '*':
			result = num1*num2;
			System.out.println("Multiplication result is: "+ result);
			break;
			
		case '/':
			result = num1/num2;
			System.out.println("Division result is: "+ result);
			break;
		
		}
		
	
	}
	
	

}
