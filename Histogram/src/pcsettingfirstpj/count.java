package pcsettingfirstpj;


import java.util.Scanner;
public class count {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String Input = keyboard.next();
        String input = Input.toLowerCase();
        System.out.println(input);
        
        int len = input.length();
        System.out.println(len);      //����
        int i=0;
        int[] count; // x is a reference to int[]
        count = new int[10]; // �Q��new���O���ͪ���
        char charAt = input.charAt(i);
        System.out.println(input.charAt(2)); //����
        for(i=0 ; i<len ; i++){
        	if( charAt >= 'a' && charAt <='z')
        		count[charAt - 'a']++;
        }
        for(i = 0 ; i < 26 ; i++){
        	if(count[i]>0)
        		System.out.print( i+'a'  + " " + count[i]+ "\n");
        }
	}
}


