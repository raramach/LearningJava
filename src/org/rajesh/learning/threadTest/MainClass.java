package org.rajesh.learning.threadTest;

public class MainClass {
	
	public static void main(String[] args){
		
		PerfTestAPI pft1 = new PerfTestAPI("test1");
		PerfTestAPI pft2 = new PerfTestAPI("test2");
		PerfTestAPI pft3 = new PerfTestAPI("test3");
		PerfTestAPI pft4 = new PerfTestAPI("test4");
		PerfTestAPI pft5 = new PerfTestAPI("test5");
		Thread t1 = new Thread(pft1);
		Thread t2 = new Thread(pft2);
		Thread t3 = new Thread(pft3);
		Thread t4 = new Thread(pft4);
		Thread t5 = new Thread(pft5);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}

}
