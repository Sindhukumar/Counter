
public class ThreadExampleSynchronized {

	public static void main(String[] args) {
		Counter counterA = new Counter();
		Thread threadA = new CounterThread(counterA);
		Thread threadB = new CounterThread(counterA);
		threadA.start();
		threadB.start();
	}

}
