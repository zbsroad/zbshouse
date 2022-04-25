package 线程;


public class 卖票案例 {
public static void main(String[] args) {
	SellThread t1=new SellThread("1");
	SellThread t2=new SellThread("2");
	SellThread t3=new SellThread("3");
	SellThread t4=new SellThread("4");
	t1.start();
	t2.start();
	t3.start();
	t4.start();
	
}
}
class SellThread extends Thread{
	public SellThread() {
		
		
	}
	public SellThread(String name) {
		super(name);
	}
	public void run() {
		for(int i=1;i<=100;i++)
		{
			System.out.println("窗口："+Thread.currentThread().getName()+"卖了第"+i+"张");
		}
	}
	
}

	


