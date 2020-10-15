package _03_Threaded_Greeting;

public class ThreadedGreeter implements Runnable {

	int num;

	public ThreadedGreeter(int i) {
		num = i;
	}

	@Override
	public void run() {
		System.out.println("this is thread" + num);
		if(num <= 50) {
			Thread t = new Thread(new ThreadedGreeter(num + 1));
			t.run();
			try {
				t.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
