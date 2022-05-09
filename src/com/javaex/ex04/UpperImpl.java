package com.javaex.ex04;

public class UpperImpl implements Runnable{
//대문자
	//필드
	
	//생성자
	
	//메소드 gs
	
	//메소드 일반
	public void run() {
		for(char Ch='A'; Ch<='Z'; Ch++) {
			System.out.println(Ch);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
