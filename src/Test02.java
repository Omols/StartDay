
public class Test02 {
	public static void main(String[] args) {
		int [] scores = {1,20,301,400};
		System.out.println("数组长度：" + scores.length);
		//遍历
		int len =scores.length;	//先定义一个变量储存length，下面判断中的i<len直接判断，不用每次
								//都去数组里再次取值。
		for(int i = 0; i < len ; i++) {
			int score = scores[i];
			System.out.println(score);
		}
		
		System.out.println("------------------------------------");
		//foreach
		for(int x:scores) {
			System.out.println(x);
		}
		System.out.println("------------------------------");
		//print(scores);
		//prints(20,30,40,50,60);
		//print3(null);	
		print4(scores);
		
		//new关键字表示创建一个数组
		int[] nums = new int[] {1,2,3,4,5};
		
	}
	
	public static void print(int[] x){
		int len = x.length;
		for(int i = 0; i<len; i++) {
			System.out.println(x[i]);
		}
	}
	
	public static void prints(int...x) {
		int len = x.length;
		for(int i = 0; i<len; i++) {
			System.out.println(x[i]);
		}
	}
	//测试数组的异常NullPointerException(空指针)
	public static void print3(int[] x) {
		/*	Exception in thread "main" java.lang.NullPointerException	//空指针异常
	 	当一个变量为Null(没有赋值时)时，我们去调用了该变量的属性和方法	*/
		System.out.println("数组的长度为：" + x.length);
	}
	//测试数组下标的越界
	public static void print4(int[] x) {
		for(int i = 0; i<x.length; i++) {
			System.out.println(x[i]);}
		}
}
