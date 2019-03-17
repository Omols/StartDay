package 接口;

public interface Interface01 {
	public static void main(String[] args) {
		Boy b = new Boy("卡卡");
		b.sleep();
		b.eat();
		b.run();
		b.print();
	}
}

interface IEat{
	//public abstract void eat();//接口中只能定义抽象方法
	void eat();	//接口中定义的方法没有声明修饰符，默认为public abstract
	//public static final int NUM = 10；	//在接口中定义一个常量
	int NUM =10;	//常量
	
	//在jdk1.8后新特性，可以被所有实现类继承
	public default void print() {
		System.out.println("eat");
	}
}

interface IRun{
	void run();
}

//接口之间可以多继承
interface ISleep extends IEat,IRun{
	void sleep();
}

//实现接口必须实现接口的所有方法
class Boy implements IEat,ISleep{
	private String name;
	public Boy(String name) {
		this.name = name;
	}
	public Boy() {}
	public void sleep(){
		System.out.println("我喜欢睡觉");
	}
	public void eat(){
		System.out.println("我是" + name + ",我喜欢美食");
	}
	public void run() {
		System.out.println("吃完就跑");
	}
}