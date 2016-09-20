
public class Mom extends Thread {

	Thread last;
	public Mom(Thread last){
		this.last = last; 
	}
	public void run(){
		
//		for(int i=0;i<1000;i++)
		while(last.isAlive()){
		System.out.println("-------------------------Mom-------------------------");
		try {
			this.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}
