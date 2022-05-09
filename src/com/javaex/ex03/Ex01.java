package com.javaex.ex03;

public class Ex01 {
//인터페이스 사용
	public static void main(String[] args) throws InterruptedException {
		
		/*
		Runnable digit = new DigitImpl();
		Thread thread = new Thread(digit);
		*/
		
		Thread thread = new Thread(new DigitImpl());
		thread.start();

		for(char ch='A'; ch<='Z'; ch++) {
			System.out.println(ch);
			thread.sleep(1000);
		}
	}

}
