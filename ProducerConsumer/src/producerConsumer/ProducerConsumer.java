package producerConsumer;

public class ProducerConsumer {
	public static int flag = 0 ;
	
	public void setFlag(){
		flag = 1;
	}
	public void resetFlag(){
		flag = 0;
	}
	public static int getFlag(){
		return flag;
	}
}


