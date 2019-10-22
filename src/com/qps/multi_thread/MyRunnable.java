package com.qps.multi_thread;

import com.qps.design_model.Singleton.Singleton;

public class MyRunnable implements Runnable {

	public void run() {
		Singleton st = Singleton.getInstance();
		System.out.println(st);
	}

}
