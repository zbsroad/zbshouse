package 线程;
//创建线程的第一种方法 继承Thread，重写run方法
public class First {
public static void main(String[] args) {
	MyThread t1=new MyThread();// 1.创建线程对象
	//2.启动线程，不能用run方法
	t1.start();//相当于t1.run();
	
	
	for (int i = 1; i <=50; i++) {
		System.out.println("主线程====="+i);
	}
}}
class MyThread extends Thread{
	public MyThread() {
		
	}
	public MyThread(String name) {
		super(name);
	}
	public void run() {
		for (int i = 1; i <=50; i++) {
//			System.out.println("线程id："+getId()+"线程名称："+getName()+"子线程.................."+i);
			//获取线程id的方法第一种：在Thread的子类中调用getId()和getName()方法
			System.out.println("线程id"+Thread.currentThread().getId()+"线程name"+Thread.currentThread().getName()+"子线程.................."+i);
            //第二种方法 不需要是Thread的子类就能用 
		}
	}
}
// 突出线程抢占式执行 每次运行结果都不一样
