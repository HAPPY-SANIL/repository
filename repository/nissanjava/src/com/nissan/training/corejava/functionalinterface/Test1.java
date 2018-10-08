package com.nissan.training.corejava.functionalinterface;

public class Test1 {
	
	public static void main(String[] args) {
		new Thread(new Runnable()
				{
			@Override
			public void run()
			{
				System.out.println("new thread created");
			}
				}).start();
	}

}
