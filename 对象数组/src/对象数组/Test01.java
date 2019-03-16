package 对象数组;
import java.util.Arrays;
/**
 * 
 * 使用对象数组实现多个Chicken的管理*/
public class Test01 {
	public static void main(String[] args) {

		
		ChickenManager cm = new ChickenManager(5);
		cm.add(new Chicken("依依",7931,1));
		cm.add(new Chicken("依依2",7932,1));
		cm.add(new Chicken("依依3",7933,1));
		cm.add(new Chicken("依依4",7934,1));
		cm.add(new Chicken("依依5",7935,1));
		
		cm.add(new Chicken("依依6",7936,1));
		System.out.println("数组的长度是：" + cm.length());
		System.out.println("-----------printAll--------");
		System.out.println("-----------find------");
		Chicken c = cm.find(7931);
		c.print();
		//System.out.println("**************输出cm数组所有内容****************");
		//cm.printAll();
		System.out.println("---------------------update----------------------");
		cm.update(new Chicken("诺诺",7931,2));
		cm.printAll();
		
	}
}

//小鸡管理类
class ChickenManager{
	private Chicken[] jw = null;
	private int count = 0;	//记录当前元素个数下标
	public ChickenManager(int size) {
		if(size > 0) {	
			jw = new Chicken[size];
		}else {
			jw = new Chicken[5];
		}
	}

	public int length() {
		return jw.length;
	}

	//添加	实现动态数组
	public void add(Chicken c) {
		if(count >= jw.length) {	//数组已满，需要扩充
			//算法1：扩充原来数组大小的一半	jw.length * 3 / 2 +1
			//算法2：扩充原来数组的一倍		jw.length * 2
			int newLen = jw.length*2;
			jw = Arrays.copyOf(jw, newLen);
		}else {
			jw[count] = c;
			count++;
		}
	}
	//删除
	public void delete(int id) {
		
	}
	//更新
	public void update(Chicken c) {
		Chicken temp = find(c.getId());
		if(temp != null) {
			temp.setName(c.getName());
			temp.setAge(c.getAge());
		}
	}
	//查找
	public Chicken find(int id) {
		for(int i = 0; i<count; i++) {
			if(jw[i].getId() == id) {
				return jw[i];
			}
		}
		return null;
	}
	//输出所有
	public void printAll() {
		for(int i = 0; i<count; i++) {
			jw[i].print();
		}
	}
}



//小鸡类（数据对象） value object (vo)
class Chicken{
	private String name;
	private int id;
	private int age;
	public Chicken() {}
	public Chicken(String name,int id,int age) {
		this.name = name;
		this.id =id;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void print() {
		System.out.println("这只小鸡叫：" + name + "\nId是：" + id + "\n年龄是：" + age);
	}
	
}
