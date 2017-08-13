package producerConsumer;

public class Demo {

	public static void main(String[] args) {
		ProducerConsumer producer = new ProducerConsumer();
		ProducerConsumer consumer = new ProducerConsumer();
		producer.setFlag();
		System.out.println("flag = " + ProducerConsumer.getFlag());
		consumer.resetFlag();
		System.out.println("flag = " + ProducerConsumer.getFlag());
	}

}
