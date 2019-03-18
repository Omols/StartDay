package ����ģʽ;

public class Test01 {
	public static void main(String[] args) {
		BaseService user = new UserManager();
		user.setISave(new FileSave());
		user.add("administrator");
	}
}

abstract class BaseService{
	private ISave iSave;
	public void setISave(ISave iSave) {
		this.iSave = iSave;
	}
	public void add(String data) {
		System.out.println("������ݺϷ���.....");
		iSave.save(data);
		System.out.println("���ݱ������");
	}
}

class UserManager extends BaseService{
	
}

//�ѿɱ����Ϊ�������������һϵ�е��㷨
interface ISave{
	public void save(String data);
}

class FileSave implements ISave{
	public void save(String data) {
		System.out.println("�����ݱ��浽�ļ���..." + data);
	}
}

class NetSave implements ISave{
	public void save(String data) {
		System.out.println("�����ݱ��浽������..." + data);
	}
}

