package �������ģʽ;

import java.awt.image.SinglePixelPackedSampleModel;

public class Test01 {

	public static void main(String[] args) {
		//Singleton1 s = new Singleton1();
		/*
		Singleton1 s = Singleton1.getInstance();
		s.print();
		Singleton1 s1 = Singleton1.getInstance();
		s1.print();
		System.out.println(s == s1);
		*/
		
		Singleton2 s = Singleton2.getInstance();
		s.print();
		Singleton2 s2 = Singleton2.getInstance();
		s2.print();
		System.out.println(s == s2);
	}
}

//����ʽ		ռ���ڴ�ʱ�䳤�����Ч��
class Singleton1{
	private Singleton1() {}
	private static Singleton1 s = new Singleton1();
	public static Singleton1 getInstance() {
		return s;
	}
	
	public void print() {
		System.out.println("���Է���");
	}
}

//����ʽ		�ڴ�ռ��ʱ��̣�Ч�ʵͣ�(�����أ��ӳټ���)
//�ڶ��̷߳���ʱ���а�ȫ����
class Singleton2{
	private Singleton2() {}
	private static Singleton2 s;
	public static Singleton2 getInstance() {
		if(s == null) {
			s = new Singleton2();
		}
		return s;
	}
	
	public void print() {
		System.out.println("���Է���2");
	}
}

