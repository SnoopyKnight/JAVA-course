package fraction;
import java.util.Scanner;

public class Fraction {
	private int numerator;
	private int denominator;
	
	public Fraction(){
		this.numerator = 0;
		this.denominator = 1;
	}
	
	public Fraction(int n , int d){
		this.numerator = n;
		this.denominator = d;
		if(d == 0){
			System.out.println("error");
			System.exit(0);
		}
	}
	
	public void readIntput(){
		Scanner input = new Scanner(System.in);
		System.out.println("Input the numerator:");
		this.numerator = input.nextInt();
		System.out.println("Input the denominator:");
		this.denominator = input.nextInt();
		
	}
	
	public static Fraction Add(Fraction f1 , Fraction f2){
		Fraction fAdd = new Fraction(f1.numerator*f2.denominator+f2.numerator*f1.denominator , f1.denominator*f2.denominator);
		return fAdd;
	}
	
	public static Fraction Multi(Fraction f1 , Fraction f2){
		Fraction fMulti = new Fraction(f1.numerator*f2.numerator , f1.denominator*f2.denominator);
		return fMulti;
	}
	
	public String toString(){
		String outcome = " ";
		outcome = this.numerator + "/" +this.denominator;
		return outcome;
	}

	public static void main(String[] args) {
		Fraction number1 = new Fraction();
		Fraction number2 = new Fraction();
		
		number1.readIntput();
		number2.readIntput();
		Add(number1,number2);
		Multi(number1,number2);
		
		System.out.println(number1.toString());
		System.out.println(number2.toString());
		System.out.println(Add(number1,number2).toString());
		System.out.println(Multi(number1,number2).toString());

	}

}
