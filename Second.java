package �߳�;

public class Second {
	public static void main(String[] args) {
		MyThread t1=new MyThread("�ҵ����߳�1");// 1.�����̶߳���
		//�޸��߳����ƣ�������ִ��֮ǰ���޸���   
//		����1��setName���� ֻ���޸�name �����޸��߳�id
//		����2 �޸Ĺ��캯�� ����ʱֱ���޸�
//		t1.setName("�ҵ����߳�1");  
		//2.�����̣߳�������run����
		t1.start();//�൱��t1.run();
		MyThread t2=new MyThread("�ҵ��ӽ���2");
		
//		t1.setName("�ҵ����߳�2");
		t2.start();
		
		
		for (int i = 0; i <50; i++) {
			System.out.println("���߳�====="+i);
		}
	}
}