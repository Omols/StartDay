package ģ�鷽��ģʽ;

public class Test01 {

	public static void main(String[] args) {
		UserManager um = new UserManager();
		um.action("admin", "add");
	}

}

abstract class BaseManager{
	public void action(String name,String method) {
		if("admin".equals(name)) {
			execute(method);
		}else {
			System.out.println("��û�в���Ȩ�ޣ�����ϵ����Ա");
		}
	}
	public abstract void execute(String method);
}

class UserManager extends BaseManager{
	public void execute(String method) {
		if("add".equals(method)) {
			System.out.println("ִ������Ӳ���");
		}else if("del".equals(method)) {
			System.out.println("ִ����ɾ������");
		}
	}
}