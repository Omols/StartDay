package 模块方法模式;

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
			System.out.println("你没有操作权限，请联系管理员");
		}
	}
	public abstract void execute(String method);
}

class UserManager extends BaseManager{
	public void execute(String method) {
		if("add".equals(method)) {
			System.out.println("执行了添加操作");
		}else if("del".equals(method)) {
			System.out.println("执行了删除操作");
		}
	}
}