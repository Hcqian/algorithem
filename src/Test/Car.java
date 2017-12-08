package Test;

public class Car extends Thread{
	public int a=0;
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i+" t");
			try {
				Thread.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			a=i;
		}
	}
}
