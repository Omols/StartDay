package �򵥹���ģʽ;

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
		System.out.println("�ֻ�������....");
	}
}

class Computer implements Product{
	public void work() {
		System.out.println("����������....");
	}
}