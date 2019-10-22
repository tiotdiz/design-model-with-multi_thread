package com.qps.test;

import com.qps.design_model.Singleton.Singleton;
import com.qps.multi_thread.MyRunnable;
import com.qps.multi_thread.MyThread;

public class SingletonTest {

	public static void main(String[] args) {
		test();
	}
	
	public static void test() {
		for (int i = 0; i < 1000; i++) {
			Thread t = new Thread(new MyRunnable());
			t.start();
		}		
	}

	public static void testSingleton() {
		Singleton[] singletons = new Singleton[10];

		// 初始化singleton
		for (int i = 0; i < singletons.length; i++) {
			//singletons[i] = new Singleton();
			singletons[i] = Singleton.getInstance();
		}
		
		for (Singleton s : singletons) {
			System.out.println(s);
		}
	}
	
	public static void testThread() {
		Singleton[] singletons = new Singleton[10];
		Thread t = new MyThread();
		t.start();
	}
}
