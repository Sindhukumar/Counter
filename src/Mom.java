
public class Mom extends Thread {

	Thread last;

	public Mom(Thread last) {
		this.last = last;
	}

	public void run() {

		while (last.isAlive()) {
			System.out.println("-------------------------Mom-------------------------");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
