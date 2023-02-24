package aryman;
class thread implements Runnable{
	public void run() {
		try {
			Thread.sleep(1000);
			
		}catch (InterruptedException e) {
			e.printStackTrace();
			
		}
		System.out.println("State of the thread 1 while it called join() method on thread2-"+ ThreadLifeCycle.thread1.getState());
		try {
			Thread.sleep(200);
			
		}catch(InterruptedException e) {
			e.printStackTrace();
			
		}
	}
	
}

public class ThreadLifeCycle implements Runnable {
	public static Thread thread1;
	public static ThreadLifeCycle obj;
	

	public static void main(String[] args) {
		obj =new ThreadLifeCycle();
		thread1= new Thread(obj);
		System.out.println("State of thread1 after creating it_ "+ thread1.getState());
		thread1.start();
		System.out.println("State of thread1 after calling .start() method on it _"+thread1.getState());
		
	}
	public void run() {
		thread myThread= new thread();
		Thread thread2 = new Thread(myThread);
		System.out.println("State of thread2 after creating it _"+ thread2.getState());
		thread2.start();
		System.out.println("Stste of thread 2 after calling .start() method on it -"+thread2.getState());
		try {
			Thread.sleep(500);
			
		}catch(Exception e ) {
			e.printStackTrace();
			
		}
		System.out.println("state of thread@ after calling .sleep() method on it -"+thread2.getState());
		try {
			thread2.join();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("state of thread 2 when it has finished itd's execution-"+thread2.getState());
		
	}

}
