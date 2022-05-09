package com.javaex.ex01;

/*Thread
 *필드
 *생성자
 *메소드
 *	(출장기능....)
 *		(해야될일0~9까지) ?????
 *		run() 이름을 정해준곳에 짜야됨
 *	(종료)*/


public class DigitThread extends Thread{

	//필드
	
	//생성자
	
	//매소드 gs
	
	//메소드 일반
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(i);	
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			}
	}
}
