package maxTest;

public class MaxTest {

	public static void main(String[] args) {
		int maximum = 10 ;
		int i;
		for(i = 10 ; i <= 15 ;i++){
			maximum = Math.max(maximum, i);
		}
		System.out.println("The Max Value between is " +maximum);
	}

}
