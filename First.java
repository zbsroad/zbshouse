package �߳�;
//�����̵߳ĵ�һ�ַ��� �̳�Thread����дrun����
public class First {
public static void main(String[] args) {
	MyThread t1=new MyThread();// 1.�����̶߳���
	//2.�����̣߳�������run����
	t1.start();//�൱��t1.run();
	
	
	for (int i = 1; i <=50; i++) {
		System.out.println("���߳�====="+i);
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
//			System.out.println("�߳�id��"+getId()+"�߳����ƣ�"+getName()+"���߳�.................."+i);
			//��ȡ�߳�id�ķ�����һ�֣���Thread�������е���getId()��getName()����
			System.out.println("�߳�id"+Thread.currentThread().getId()+"�߳�name"+Thread.currentThread().getName()+"���߳�.................."+i);
            //�ڶ��ַ��� ����Ҫ��Thread����������� 
		}
	}
}
// ͻ���߳���ռʽִ�� ÿ�����н������һ��
