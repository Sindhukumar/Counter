
public class CounterThread extends Thread{

	private Counter counter = null;
	public CounterThread(Counter counter){
		this.counter=counter;
	}
	public void run(){
		System.out.println(this.getName() + " is running");
		
		for(int i=0; i<1000;i++){
			try {
				this.sleep(50);
			} catch (InterruptedException e) {
				System.out.println(this.getName()+":"+counter.getCounter());
			}
			counter.add(100);
			System.out.println(counter.getCounter());
		}
		System.out.println(this.getName()+":"+counter.getCounter());
	}
}
