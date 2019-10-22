package com.qps.multi_thread;

import com.qps.design_model.Singleton.Singleton;

public class MyThread extends Thread {
	
	public void run() {
		Singleton st = Singleton.getInstance();
		System.out.println(st);
	}
}
