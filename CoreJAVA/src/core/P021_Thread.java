package core;

public class P021_Thread {
	public static void main(String[] args) {
		Thread t = new Thread();
		System.out.println(t.currentThread());
		t.setName("MyThread");
		System.out.println(t);
		for(int i=1;i<=5;i++) {
			System.out.println(t+" : "+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
