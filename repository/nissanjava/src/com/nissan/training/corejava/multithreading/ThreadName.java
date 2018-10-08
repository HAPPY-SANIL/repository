package com.nissan.training.corejava.multithreading;

public class ThreadName extends Thread {
	public void run() {
		System.out.println("runnning thread name is"+Thread.currentThread().getName());
		System.out.println("running thread priority is"+Thread.currentThread().getPriority());
	}
public static void main(String[] args) throws InterruptedException {
	ThreadName t1=new ThreadName();
	ThreadName t2=new ThreadName();
	System.out.println("name of t1:"+t1.getName());
	System.out.println("name of t1:"+t2.getName());
	t1.setPriority(Thread.MIN_PRIORITY);
	t2.setPriority(Thread.MAX_PRIORITY);
	t1.start();
	t2.start();
	//sleep(1000);
	t1.setName("nissan");
	System.out.println("after changing initial name of t1:"+t1.getName());
	
}
}
