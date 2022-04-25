package 线程;

public class Second {
	public static void main(String[] args) {
		MyThread t1=new MyThread("我的子线程1");// 1.创建线程对象
		//修改线程名称，必须在执行之前就修改了   
//		方法1用setName方法 只能修改name 不能修改线程id
//		方法2 修改构造函数 创建时直接修改
//		t1.setName("我的子线程1");  
		//2.启动线程，不能用run方法
		t1.start();//相当于t1.run();
		MyThread t2=new MyThread("我的子进程2");
		
//		t1.setName("我的子线程2");
		t2.start();
		
		
		for (int i = 0; i <50; i++) {
			System.out.println("主线程====="+i);
		}
	}
}