package ��̬;

public class Test1 {

	public static void main(String[] args) {
		// �ø��������ָ��������󣬣��ô����������ʾС�����ͣ����Զ�ת��(����ת��)
		/*HomeChicken hc = new HomeChicken("С��1");
		hc.eat();
		YeChicken yc = new YeChicken("Ұ��1");
		yc.eat(); 
	
		eat(yc);
		eat(hc);
		eat(sc);*/
		ScreamChicken sc = new ScreamChicken("��м�");
		eat(sc);
	}
	
	//�������ȣ� ��������̣�����ӿڱ�̣�
	public static void eat(Chicken c) {
		System.out.println("---");
		c.eat();
		ScreamChicken sc = (ScreamChicken) c;
		sc.song();
	}

}
//����
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

//�Ҽ���
class HomeChicken extends Chicken{
	public HomeChicken (String name) {
		super(name);
	}
	public void eat() {
		System.out.println("�ҳԴ���");
	}
}

//Ұ����
class YeChicken extends Chicken{
	public YeChicken(String name) {
		super(name);
	}
	public void eat() {
		System.out.println("�ҳԳ���");
	}
}
//��м�
class ScreamChicken extends Chicken{
	public ScreamChicken (String name) {
		super(name);
	}
	public void eat() {
		System.out.println("�Ҳ��Զ���");
	}
	public void song() {
		System.out.println("i can sing");
	}
}