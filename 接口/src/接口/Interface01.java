package �ӿ�;

public interface Interface01 {
	public static void main(String[] args) {
		Boy b = new Boy("����");
		b.sleep();
		b.eat();
		b.run();
		b.print();
	}
}

interface IEat{
	//public abstract void eat();//�ӿ���ֻ�ܶ�����󷽷�
	void eat();	//�ӿ��ж���ķ���û���������η���Ĭ��Ϊpublic abstract
	//public static final int NUM = 10��	//�ڽӿ��ж���һ������
	int NUM =10;	//����
	
	//��jdk1.8�������ԣ����Ա�����ʵ����̳�
	public default void print() {
		System.out.println("eat");
	}
}

interface IRun{
	void run();
}

//�ӿ�֮����Զ�̳�
interface ISleep extends IEat,IRun{
	void sleep();
}

//ʵ�ֽӿڱ���ʵ�ֽӿڵ����з���
class Boy implements IEat,ISleep{
	private String name;
	public Boy(String name) {
		this.name = name;
	}
	public Boy() {}
	public void sleep(){
		System.out.println("��ϲ��˯��");
	}
	public void eat(){
		System.out.println("����" + name + ",��ϲ����ʳ");
	}
	public void run() {
		System.out.println("�������");
	}
}