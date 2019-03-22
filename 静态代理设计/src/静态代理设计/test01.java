package 静态代理设计;

public class test01 {

	
	public static void main(String[] args) {
		Action userAction = new UserAction();
		ActionProxy proxy = new ActionProxy(userAction);
		proxy.doAction();
	}

}

class ActionProxy implements Action{
	private Action target; //被代理的对象
	public ActionProxy(Action target){
		this.target = target;
	}
	
	//执行操作
	public void doAction() {
		long startTime = System.currentTimeMillis();
		target.doAction();//执行真正的业务
		long endTime = System.currentTimeMillis();
		System.out.println("共耗时" + (endTime - startTime));
		
	}
}


interface Action{
	public void doAction();
}

class UserAction implements Action{
	public void doAction() {
		for(int i = 0; i<100; i++) {
			System.out.println("用户开始工作");
		}
		
	}
}
