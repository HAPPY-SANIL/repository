package com.nissan.training.corejava.oops;

public class LowBalanceException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String msg;
	public LowBalanceException(String msg) {
		this.msg=msg;
	}
	public String toString() {		return msg;
	}
}
