package ������;

/**
 * 1�����������û�г��󷽷����г��󷽷���������ǳ�����
 * 2���ǳ�����̳г��������ʵ�����г��󷽷�
 * 3����������Լ̳г����࣬���Բ�ʵ�ָ�����󷽷�
 * 4������������з���ʵ�ֺ�����
 * 5�������಻�ܱ�ʵ����
 * 6�������಻������Ϊfinal
 * 7������������й��췽��
 * */
public class Test1 {

	public static void main(String[] args) {
		Man man = new Man();
		Women women = new Women();
		man.move();
		women.eat();
	}

}

abstract class Animal{
	public abstract void move();	//���������������󷽷�ֻ��������û��ʵ��
}

abstract class Person extends Animal{
	public abstract  void eat();
}

//�̳г�����ľ�����
//�̳г�����ľ��������ʵ�����г��󷽷�
class Man extends Person{
	public void move() {
		System.out.println("�������ˣ��Ұ�����");
	}
	public void eat() {
		System.out.println("�������ˣ����Ǹ��Ի�");
	}
}

class Women	extends Person{
	public void move() {
		System.out.println("����Ů�ˣ���ϲ�����");
	}
	public void eat() {
		System.out.println("����Ů�ˣ���ϲ������ʳ");
	}
}