package 简单工厂模式;

public class test1 {
	public static void main(String[] args) {
		Product phone = ProdectFactory.getProduct("phone");
		if(null != phone) {
			phone.work();
		}
		
		
	}
}

class ProdectFactory{
	public static Product getProduct(String name) {
		if("phone".equals(name)) {
			return new Phone();
		}else if("computer".equals(name)) {
			return new Computer();
		}else {
			return null;
		}
	}
}

interface Product{
	abstract void work();
}

class Phone implements Product{
	public void work() {
		System.out.println("手机制作中....");
	}
}

class Computer implements Product{
	public void work() {
		System.out.println("电脑制作中....");
	}
}