package ��������;
import java.util.Arrays;
/**
 * 
 * ʹ�ö�������ʵ�ֶ��Chicken�Ĺ���*/
public class Test01 {
	public static void main(String[] args) {

		
		ChickenManager cm = new ChickenManager(5);
		cm.add(new Chicken("����",7931,1));
		cm.add(new Chicken("����2",7932,1));
		cm.add(new Chicken("����3",7933,1));
		cm.add(new Chicken("����4",7934,1));
		cm.add(new Chicken("����5",7935,1));
		
		cm.add(new Chicken("����6",7936,1));
		System.out.println("����ĳ����ǣ�" + cm.length());
		System.out.println("-----------printAll--------");
		System.out.println("-----------find------");
		Chicken c = cm.find(7931);
		c.print();
		//System.out.println("**************���cm������������****************");
		//cm.printAll();
		System.out.println("---------------------update----------------------");
		cm.update(new Chicken("ŵŵ",7931,2));
		cm.printAll();
		
	}
}

//С��������
class ChickenManager{
	private Chicken[] jw = null;
	private int count = 0;	//��¼��ǰԪ�ظ����±�
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

	//���	ʵ�ֶ�̬����
	public void add(Chicken c) {
		if(count >= jw.length) {	//������������Ҫ����
			//�㷨1������ԭ�������С��һ��	jw.length * 3 / 2 +1
			//�㷨2������ԭ�������һ��		jw.length * 2
			int newLen = jw.length*2;
			jw = Arrays.copyOf(jw, newLen);
		}else {
			jw[count] = c;
			count++;
		}
	}
	//ɾ��
	public void delete(int id) {
		
	}
	//����
	public void update(Chicken c) {
		Chicken temp = find(c.getId());
		if(temp != null) {
			temp.setName(c.getName());
			temp.setAge(c.getAge());
		}
	}
	//����
	public Chicken find(int id) {
		for(int i = 0; i<count; i++) {
			if(jw[i].getId() == id) {
				return jw[i];
			}
		}
		return null;
	}
	//�������
	public void printAll() {
		for(int i = 0; i<count; i++) {
			jw[i].print();
		}
	}
}



//С���ࣨ���ݶ��� value object (vo)
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
		System.out.println("��ֻС���У�" + name + "\nId�ǣ�" + id + "\n�����ǣ�" + age);
	}
	
}
