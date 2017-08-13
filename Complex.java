package complexNumber;
import java.util.Scanner;

public class Complex {
	public double real;
	public double imaginary;
	
	public Complex(double real, double imaginary){
		this.real = real;
		this.imaginary = imaginary;
	}
	
	public Complex(double realPart){
		this.real = realPart;
	}
	
	public Complex(){
		this.real = 0;
		this.imaginary = 0;
	}

	public void readInput(){
		Scanner input = new Scanner(System.in);
		this.real = input.nextInt();
		this.imaginary = input.nextInt();
	}
	public boolean equals(Complex obj){
		return((this.real == obj.real) && (this.imaginary == obj.imaginary));
	}
	
	public String toString(){
		String result = "";
		if(this.imaginary < 0)  
			result = this.real + " + " + "(" + this.imaginary +")" + "i" ;
		else  
			result = this.real + " + " + this.imaginary+ "i" ;
		return result; 
	}
	
	public Complex square(){
		Complex Square = new Complex(Math.pow(this.real,2) - Math.pow(this.imaginary, 2) , 2*this.real*this.imaginary);
		return Square;
	}
	
	public static Complex add(Complex c1,Complex c2){
		Complex Add = new Complex(c1.real + c2.real , c1.imaginary + c2.imaginary);
		return Add;
	}
	
	public static Complex sub(Complex c1,Complex c2){
		Complex Sub = new Complex(c1.real - c2.real , c1.imaginary - c2.imaginary);
		return Sub;
	}
	
	public static Complex multi(Complex c1,Complex c2){
		Complex Multi = new Complex(c1.real*c2.real - c1.imaginary*c2.imaginary , c1.real*c2.imaginary + c1.imaginary*c2.real);
		return Multi;
	}
	
	public Complex add(Complex obj){
		Complex ADD = new Complex(this.real + obj.real , this.imaginary + obj.imaginary);
		return ADD;
	}
	
	public Complex sub(Complex obj){
		Complex SUB = new Complex(this.real - obj.real , this.imaginary - obj.imaginary);
		return SUB;
	}
	
	public Complex multi(Complex obj){
		Complex MULTI = new Complex(this.real*obj.real - this.imaginary*obj.imaginary , this.real*obj.imaginary + this.imaginary*obj.real);
		return MULTI;
	}
	public static void main(String[] args) {
		Complex x = new Complex();
		Complex y = new Complex();
		x.readInput();
		y.readInput();
		
		System.out.println(x.toString());
		System.out.println(y.toString());
		System.out.println("\n");
		System.out.println(x.square().toString());
		System.out.println(y.square().toString());
		System.out.println("\n");
		System.out.println(add(x,y).toString());
		System.out.println(sub(x,y).toString());
		System.out.println(multi(x,y).toString());
		System.out.println("\n");
		System.out.println(x.add(y).toString());
		System.out.println(x.sub(y).toString());
		System.out.println(x.multi(y).toString());

	}

}
