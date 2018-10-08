package com.nissan.training.corejava.oops;

public class UserDefinedExceptonDemo {
public static void main(String[] args) {
	int balance=1000;
	if(balance<2000) {
		try {
			throw new LowBalanceException("Balance is less than 2000");
		}catch(LowBalanceException e) {
			System.out.println(e.getMessage());
		}
	}
}
}
