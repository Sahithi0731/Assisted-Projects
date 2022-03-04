package ThreadCreationMechanisms;
class multithreadings implements Runnable{
	public void run() {
		try {
			//displaying the thread that is running
			System.out.println("Thread" + Thread.currentThread().getId() +"is running");
		}
		catch(Exception e) {
			//throwing an exception
			System.out.println("exception is caught");
		}
	}
}
public class runnableinterface {
	public static void main(String[] args) {
		int n = 8;
		//number of threads
		for(int i=0;i<n;i++) {
			Thread object = new Thread(new multithreadings());
			object.start();
		}
	}
}
