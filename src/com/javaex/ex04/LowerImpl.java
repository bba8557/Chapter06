package com.javaex.ex04;

public class LowerImpl implements Runnable{
//소문자
	//필드
	
	//생성자
	
	//메소드 gs
	
	//메소드 일반
	public void run() {
		for(char ch='a'; ch<='z'; ch++) {
			System.out.println(ch);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
