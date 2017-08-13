package findMaxofInput;
import java.util.Scanner;

public class FindMaxofInput {

	public static void main(String[] args) {
		int i = 1;
		Scanner keyboard = new Scanner(System.in);
		int maximum = keyboard.nextInt();
		while(i<10){
			int term = keyboard.nextInt();
			maximum = Math.max(maximum, term);
			i++;
		}
		System.out.println(maximum);
	}

}
