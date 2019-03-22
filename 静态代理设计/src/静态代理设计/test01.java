package ��̬�������;

public class test01 {

	
	public static void main(String[] args) {
		Action userAction = new UserAction();
		ActionProxy proxy = new ActionProxy(userAction);
		proxy.doAction();
	}

}

class ActionProxy implements Action{
	private Action target; //������Ķ���
	public ActionProxy(Action target){
		this.target = target;
	}
	
	//ִ�в���
	public void doAction() {
		long startTime = System.currentTimeMillis();
		target.doAction();//ִ��������ҵ��
		long endTime = System.currentTimeMillis();
		System.out.println("����ʱ" + (endTime - startTime));
		
	}
}


interface Action{
	public void doAction();
}

class UserAction implements Action{
	public void doAction() {
		for(int i = 0; i<100; i++) {
			System.out.println("�û���ʼ����");
		}
		
	}
}
