package com.nissan.training.corejava.oops;

public class LocalInnerClas {
	private int data=30;
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	void display() {
		class Local{
			void msg() {System.out.println(data);
		}
		}
		Local l=new Local();
		l.msg();
	}

	public static void main(String[] args) {
		LocalInnerClas ob=new LocalInnerClas();
		ob.display();

	}

}
