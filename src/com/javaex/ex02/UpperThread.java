package com.javaex.ex02;

public class UpperThread extends Thread{
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
				e.printStackTrace();
			}
		}
	}
}
