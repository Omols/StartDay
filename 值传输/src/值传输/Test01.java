package 值传输;

public class Test01 {

	public static void main(String[] args) {
		String name = "小黄";
		method(name);
		System.out.println("name =" + name);
	}

	public static void method(String sname) {
		sname ="小红";
	}
}
