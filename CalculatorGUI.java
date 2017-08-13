package CalculatorGUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener{
	
	private JTextField result;
	private JPanel p = new JPanel();
	private JButton b[] = new JButton[16];
	private String n[] = {"0","1","2","3","4","5","6","7","8","9","+","-","*","/","=","AC"};
	private String input = "";
	private String screen1 = "";
	private String screen2 = "";
	private String OperationOn = "";
	boolean turn = true;
	boolean Empty = true;
	double first;
	double second;
	
	
	public Calculator()
	{
		setTitle("Calculator is on.");
		Container C = getContentPane();
		result = new JTextField();
		result.setEditable(false);
		result.setBackground(Color.white);
		
		p.setLayout(new GridLayout(4,4));
		
		for(int i=0 ; i<16 ; i++){
			b[i] = new JButton(n[i]);
			b[i].addActionListener(this);
			p.add(b[i]);
		}
		
		C.add(result, BorderLayout.NORTH);
		C.add(p);
		
		setSize(250,250);
	}
	
	public static void main(String[] args) {
		Calculator Calculator = new Calculator();
		Calculator.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e){
		for(int i = 0; i <= 9; i++){
			if(e.getSource() == b[i]){
				input += i;
				result.setText("");
				result.setText(input);
			}
		}
		for(int i = 10 ;i <= 14; i++){
			
			if(e.getSource() == b[i]){
				if(turn){
					screen1 = n[i];
					turn = false;
				}
				else{
					screen2 = n[i];
					turn = true;
				}
				result.setText(result.getText()+n[i]);
				OperationOn=n[i];
				
				if(screen1 != screen2 && screen2 != ""){
					if(turn)
						Cal(e, screen1.charAt(0) ,screen2);
					else
						Cal(e, screen2.charAt(0) , screen1);
				}
				
				if(n[i] != "=")
					Cal(e,n[i].charAt(0),n[i]);
			}
			
			if(e.getSource()==b[15])
			{
				input = ""; screen1 = ""; screen2 = ""; 
				turn = true; Empty = true;
				result.setText("");
			}
		}
	}
	
	
	
	public void Cal(ActionEvent e ,char OpType ,String Op){
		if (Op == "=")
			Op = "";
		if(Empty && input == "")
		{
			System.exit(0);
		}
		
		else if(Empty && input != ""){
			first = Integer.parseInt(input);
			result.setText(input + Op);
			input="";
			Empty=false;
		}
		else if(!Empty && input != ""){
			second = Integer.parseInt(input);
			first = Operation(first, second ,OpType);
			input="";
			result.setText("");
			result.setText(first + Op);
		}
	}
	
	public static double  Operation(double first, double second, char op)
	{	
		switch (op)
		{
			case '+':
				return first + second;
			case '-':
				return first - second;
			case '*':
				return first * second;
			case '/':
				return first / second;	
			default:
				return 0;
		}
	}
	
}
