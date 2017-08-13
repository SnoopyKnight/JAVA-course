package calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String Operation;
		double number;
		String reDo = "Y";
		double result = 0.0;
		double Fresult = 0.0;
		
		System.out.println("Calculator is on.");
		System.out.println("result = " + result);
		System.out.println("Type in an arithmetic operator of your choice and press enter.\nThen, please type in a number that will undergo the operation.");

		while( keyboard.hasNextLine() && (reDo.toUpperCase()).compareTo("Y") == 0){
			Operation = keyboard.nextLine().trim();
			number = Double.parseDouble(keyboard.nextLine());
			
			try{
				if(Operation.compareTo("+") != 0 && Operation.compareTo("-") != 0 && Operation.compareTo("*") != 0 && Operation.compareTo("/") != 0 && (Operation.toUpperCase()) .compareTo("R") != 0 )
					throw new UnknownOperatorException( Operation + " is an unknown operator.");
				if(Operation.compareTo("/") == 0 && number == 0)
					throw new DivisionByZeroException("Division by zero exception.");
			}
			
			catch(UnknownOperatorException e){
				System.out.println(e.getMessage());
				System.out.println("reenter your last line:");
			}
			
			catch(DivisionByZeroException e){
				System.out.println(e.getMessage());
				System.out.println("reenter your last line:");
			}
			
			
			if(Operation.compareTo("+") == 0){
				result += number;
				System.out.println("new result = " + result);
			}
			if(Operation.compareTo("-") == 0){
				result -= number;
				System.out.println("new result = " + result);
			}
			if(Operation.compareTo("*") == 0){
				result *= number;
				System.out.println("new result = " + result);
			}
			if(Operation.compareTo("/") == 0 && number != 0){
				result /= number;
				System.out.println("new result = " + result);
			}
			
			Fresult = result;
			
			if( (Operation.toUpperCase()) .compareTo("R") == 0){
				System.out.println("Final Result: " +Fresult);
				System.out.println("Again? (y/n)");
				reDo = keyboard.nextLine();
				if(reDo.compareTo("y") == 0){
					result = 0;
					Fresult = 0;
;					System.out.println(" ");
				}
				
				if(reDo.compareTo("n") == 0){
					System.out.println("Bye Bye");
					break;
				}
			}
		}
		
	}
}





class UnknownOperatorException extends Exception {
	public UnknownOperatorException(){
		super("reenter your last line: ");
	}
	public UnknownOperatorException(String message){
		super(message);
	}
}

class DivisionByZeroException extends Exception {
	public DivisionByZeroException(){
		super("reenter your last line: ");
	}
	public DivisionByZeroException(String message){
		super(message);
	}
}