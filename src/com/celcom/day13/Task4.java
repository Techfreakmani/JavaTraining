package com.celcom.day13;

import java.time.LocalTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Task4 {

	public static void main(String[] args) {
		ScheduledExecutorService obj = Executors.newScheduledThreadPool(3);
		for(int i=1;i<=10;i++)
		{
			obj.schedule(() ->{
				System.out.println("Current time" + LocalTime.now());
			}, i, TimeUnit.SECONDS);
		}
		obj.shutdown();

	}

}
