package 继承;

public class Test01 {

	public static void main(String[] args) {
		Hsq hsq = new Hsq("ddd");
		hsq.eat();
		hsq.print();
		hsq.play();
		hsq.eat();
	}

}

class Dog{
	private String name;
	private String sex;
	public  Dog(String name,String sex) {
		this.name = name;
		this.sex = sex;
		System.out.println("我是狗的构造方法");
	}
	public void eat() {
		System.out.println("吃东西");
	}
	public void print() {
		System.out.println("我是一条狗");
	}
}

class Hsq extends Dog{
	public Hsq(String name) {
		super("aaa","公");
	}
	/*public void print() {
		System.out.println("我是哈士奇");
	}*/
	public void play() {
		System.out.println("我喜欢乱咬");
	}
	public void eat() {
		System.out.println("吃肉");
	}
}
