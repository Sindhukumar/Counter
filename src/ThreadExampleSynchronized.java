import java.util.Scanner;

public class ThreadExampleSynchronized {

	public static void main(String[] args) {
		Counter counterA = new Counter();
		Thread threadA = new CounterThread(counterA);
		Thread threadB = new CounterThread(counterA);
		Thread threadC = new Mom(threadB);
		threadA.start();
		threadB.start();
		threadC.start();

	}

}
