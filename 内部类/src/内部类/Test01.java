package �ڲ���;

public class Test01 {
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.InnerPrint();
		outer.show();
		Outer.Inner3 inner3 = new Outer.Inner3();
		inner3.print();
		outer.print1();
		outer.print2();
		outer.print3(new Eat() {
			public void eat() {
				System.out.println("����ʽ�����ڲ���");
			}
		});
	}
}

class Outer{
	private String name;
	//���ⲿ���ж���һ�����������ⲿ�ṩ�����ڲ���Ľӿ�
	public void InnerPrint() {
		Inner inner = new Inner();
		inner.print();
	}
	//��Ա�ڲ���
	class Inner{
		public void print() {
			System.out.println("inner");
		}
	}
	//�����ڲ���
	//show�����ľֲ��������������ձ�����ʵ���ϵı���
	public void show() {
		final int x = 10;
		class Inner2{
			public void print() {
				System.out.println("inner2"+x);
			}
		}
		Inner2 inner2 = new Inner2();
		inner2.print();
	}
	
	//��̬�ڲ���
	static class Inner3{
		public void print() {
			System.out.println("333");
		}
	}
	
	//�����ڲ���
	//�̳�ʽ
	public void print1(){
		Cat cat = new Cat() {
			public void eat() {
				System.out.println("eat:�̳�ʽ�����ڲ���");
			}
		};
		cat.eat();
		
	}
	
	public void print2() {
		Eat eat = new Eat() {
			public void eat() {
				System.out.println("eat:�ӿ�ʽ�����ڲ���");
			}
		};
			eat.eat();	
	}
	
	public void print3(Eat eat) {
		eat.eat();
	}
}

interface Eat{
	public void eat();
}

abstract class Cat{
	public abstract void eat();
}