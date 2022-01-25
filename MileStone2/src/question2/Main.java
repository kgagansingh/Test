package question2;

import java.util.Random;

class JobOfSum implements Runnable {
	Random random = new Random();
	private int sum;

	private boolean isDone = false;
	int count = 0;

	@Override
	public void run() {
		int randomNumber = random.nextInt(10) + 1;
		System.out.println("Thread Name: " + Thread.currentThread().getName() + "  Value: " + randomNumber);
		count++; // counting no. of threads processed;
		sum = sum + randomNumber;
		if (count == 5) { // if count hits 5 means all the threads have already done their task
			// updating flag variable & notifying the main thread to execute
			isDone = true;
			synchronized (this) {
				notifyAll();
			}
		}
	}

	public synchronized int getSum() {
		// Trapping main thread if the sum has not been calculated yet;
		if (!isDone) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return sum;
	}
}

public class Main {
	public static void main(String[] args) {
		JobOfSum job = new JobOfSum();
		// Creating threads
		Thread thread1 = new Thread(job, "A");
		Thread thread2 = new Thread(job, "B");
		Thread thread3 = new Thread(job, "C");
		Thread thread4 = new Thread(job, "D");
		Thread thread5 = new Thread(job, "E");
		// Starting threads
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		// Printing results
		System.out.println(job.getSum());
	}

}