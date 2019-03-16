package 单例设计模式;

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

//饿汉式		占用内存时间长，提高效率
class Singleton1{
	private Singleton1() {}
	private static Singleton1 s = new Singleton1();
	public static Singleton1 getInstance() {
		return s;
	}
	
	public void print() {
		System.out.println("测试方法");
	}
}

//懒汉式		内存占用时间短，效率低，(懒加载，延迟加载)
//在多线程访问时会有安全问题
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
		System.out.println("测试方法2");
	}
}

