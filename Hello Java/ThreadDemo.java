class Demo extends Thread{
	public void run(){
		for(int x =0;x<60;x++)
			System.out.println("Demo run");
	}
}

class ThreadDemo
{
	public static void main(String[] args) {
		// for(int x=0; x<4000;x++)
			// System.out.println("Hello World!");
		Demo d = new  Demo();
		d.start();

		for(int x =0;x<60;x++)
			System.out.println("Hello World!" + x);
	}
}