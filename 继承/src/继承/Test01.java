package �̳�;

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
		System.out.println("���ǹ��Ĺ��췽��");
	}
	public void eat() {
		System.out.println("�Զ���");
	}
	public void print() {
		System.out.println("����һ����");
	}
}

class Hsq extends Dog{
	public Hsq(String name) {
		super("aaa","��");
	}
	/*public void print() {
		System.out.println("���ǹ�ʿ��");
	}*/
	public void play() {
		System.out.println("��ϲ����ҧ");
	}
	public void eat() {
		System.out.println("����");
	}
}
