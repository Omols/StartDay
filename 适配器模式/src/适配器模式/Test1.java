package ������ģʽ;

public class Test1 {
	public static void main(String[] args) {
		PowerA powerA = new PowerAImpl();
		work(powerA);
		
		
	}
	
	public static void work(PowerA a) {
		System.out.println("��������...");
		a.insert();
		System.out.println("��������....");
	}
}

//������
class Adapter implements PowerA{
	private PowerB powerB;
	public Adapter(PowerB powerB) {
		this.powerB = powerB;
	}
	public void insert() {
		powerB.connet();
	}
	
}

interface PowerB{
	public void connet();
}

class PowerBImpl implements PowerB{
	public void connet() {
		System.out.println("��Դ��ʼ����");
	}
}

interface PowerA{
	public void insert();
}

class PowerAImpl implements PowerA{
	public PowerAImpl() {}
	public void insert() {
		System.out.println("��Դ��ʼ����...");
	}
}