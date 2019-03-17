package 多态;

public class Test1 {

	public static void main(String[] args) {
		// 用父类的引用指向子类对象，（用大的类型来表示小的类型），自动转换(向上转型)
		/*HomeChicken hc = new HomeChicken("小鸡1");
		hc.eat();
		YeChicken yc = new YeChicken("野鸡1");
		yc.eat(); 
	
		eat(yc);
		eat(hc);
		eat(sc);*/
		ScreamChicken sc = new ScreamChicken("尖叫鸡");
		eat(sc);
	}
	
	//抽象（粒度） 面向抽象编程（面向接口编程）
	public static void eat(Chicken c) {
		System.out.println("---");
		c.eat();
		ScreamChicken sc = (ScreamChicken) c;
		sc.song();
	}

}
//鸡类
abstract class Chicken{
	private String name;
	public Chicken(String name) {
		this.name = name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public abstract void eat();
}

//家鸡类
class HomeChicken extends Chicken{
	public HomeChicken (String name) {
		super(name);
	}
	public void eat() {
		System.out.println("我吃大米");
	}
}

//野鸡类
class YeChicken extends Chicken{
	public YeChicken(String name) {
		super(name);
	}
	public void eat() {
		System.out.println("我吃虫子");
	}
}
//尖叫鸡
class ScreamChicken extends Chicken{
	public ScreamChicken (String name) {
		super(name);
	}
	public void eat() {
		System.out.println("我不吃东西");
	}
	public void song() {
		System.out.println("i can sing");
	}
}