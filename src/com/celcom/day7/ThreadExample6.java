package com.celcom.day7;


//Inter Thread Communication
class Resource1{
	
	private String data;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
}

class Reader extends Thread{
	Resource1 resource;
	
	Reader(Resource1 resource)
	{
		this.resource = resource;
	}
	@Override
	public void run() {
		synchronized (resource) {
			System.out.println("Reader is Waiting for Writer to write a data");
			try {
				resource.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Data from Reader :" + resource.getData());
		}
	}
}

class Writer extends Thread{
	Resource1 resource;
	
	Writer(Resource1 resource)
	{
		this.resource = resource;
	}
	
	@Override
	public void run() {
		synchronized (resource) {
			System.out.println("Writer is writing the data....");
			resource.setData("Hello Reader");
			resource.notify();
		}
	}
}
public class ThreadExample6 {

	public static void main(String[] args) throws InterruptedException {
		Resource1 resource = new Resource1();
		
		Reader read = new Reader(resource);
		read.start();
		
		Thread.sleep(2000);
		
		Writer write = new Writer(resource);
		write.start();
		
		
	}

}
