package 内部类;

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
				System.out.println("参数式匿名内部类");
			}
		});
	}
}

class Outer{
	private String name;
	//在外部类中定义一个方法，对外部提供访问内部类的接口
	public void InnerPrint() {
		Inner inner = new Inner();
		inner.print();
	}
	//成员内部类
	class Inner{
		public void print() {
			System.out.println("inner");
		}
	}
	//方法内部类
	//show方法的局部变量必须是最终变量或实际上的变量
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
	
	//静态内部类
	static class Inner3{
		public void print() {
			System.out.println("333");
		}
	}
	
	//匿名内部类
	//继承式
	public void print1(){
		Cat cat = new Cat() {
			public void eat() {
				System.out.println("eat:继承式匿名内部类");
			}
		};
		cat.eat();
		
	}
	
	public void print2() {
		Eat eat = new Eat() {
			public void eat() {
				System.out.println("eat:接口式匿名内部类");
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